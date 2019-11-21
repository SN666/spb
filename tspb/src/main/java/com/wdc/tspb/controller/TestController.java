package com.wdc.tspb.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Author : wdc
 * @Date : 2019/11/21 15:45
 * @Description :
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "/index.html";
    }
}
