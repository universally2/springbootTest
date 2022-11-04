package com.universally2.springbootTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenlinfeng
 * @date 2022/11/3
 * @time 下午3:54
 */
@Controller
public class IndexController {
    
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "test2");
        return "test";
    }
}
