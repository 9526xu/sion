package com.lol.sion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/5/30
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("host", "www.baidu.com");

        return "index";
    }
}
