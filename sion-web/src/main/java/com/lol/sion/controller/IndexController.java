package com.lol.sion.controller;

import com.lol.sion.core.dao.intf.NasdqEarningManager;
import com.lol.sion.core.dao.query.NasdqEarningQuery;
import com.lol.sion.core.pojo.response.NasdaqEarningListResponse;
import com.lol.sion.core.service.intf.NasdaqEarningService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/5/30
 */
@Slf4j
@Controller
public class IndexController {


    @Autowired
    private NasdqEarningManager nasdqEarningManager;

    @Autowired
    private NasdaqEarningService nasdaqEarningService;

    @RequestMapping("/index")
    public String index(Model model) {
        log.info("log4j2 日志测试");
        model.addAttribute("host", "www.baidu.com");
        return "index";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        log.info("查找 list 开始");
        NasdqEarningQuery query = new NasdqEarningQuery();
        List<NasdaqEarningListResponse> listResponses = nasdaqEarningService.query();
        //根据时间分档
        model.addAttribute("list", listResponses);
        model.addAttribute("time", DateFormatUtils.format(new Date(), "yyyy-MM-dd"));
        return "index";
    }

    @RequestMapping("/test")
    public String test() {
        nasdaqEarningService.transactionTest();
        return "index";
    }


}
