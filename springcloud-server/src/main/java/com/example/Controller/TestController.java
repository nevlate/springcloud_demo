package com.example.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Value("${server.port}")
    String port;


    @RequestMapping("/test")
    public String index(){

        return "server被调用了！:" +port;
    }
}
