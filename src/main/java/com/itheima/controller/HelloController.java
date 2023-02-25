package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author _oah
 * @Date 2023.2.25 8:38
 * @Version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        System.out.println("hello world222...");
        return "OK22";
    }



}
















































































