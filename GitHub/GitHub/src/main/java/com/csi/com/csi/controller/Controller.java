package com.csi.com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HP on 26-Nov-21.
 */

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping
    public  String sayWelcome(){

        return "Welcome To CSI";
    }
}
