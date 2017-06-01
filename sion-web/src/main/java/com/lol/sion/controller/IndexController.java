package com.lol.sion.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/5/30
 */
@Slf4j
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        log.info("log4j2 日志测试");
        model.addAttribute("host", "www.baidu.com");

        return "index";
    }
}
