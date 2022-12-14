package com.universally2.springbootTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenlinfeng
 * @date 2022/10/17
 * @time 下午4:31
 */

@Controller
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, world.";
    }
}
