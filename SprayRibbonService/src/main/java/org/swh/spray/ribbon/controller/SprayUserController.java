package org.swh.spray.ribbon.controller;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("spray/ribbon")
@Log
public class SprayUserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer")
    private User consumerUserInfo() {
        User user = restTemplate.getForObject("http://SPRAYUSERSERVICE/spray/user/print", User.class);
        return user;
    }

}
