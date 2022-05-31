package org.swh.spray.user.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spray/user")
@Log
public class SprayUserController {
    @GetMapping("print")
    private User printClientInfo() {
        return User.builder().name("月饼").age(1).sex("女").build();
    }

}
