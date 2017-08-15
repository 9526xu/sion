package com.lol.sion.controller;

import com.google.common.collect.Maps;
import com.lol.sion.core.dao.intf.NasdqEarningManager;
import com.lol.sion.core.dao.query.NasdqEarningQuery;
import com.lol.sion.core.pojo.response.NasdaqEarningListResponse;
import com.lol.sion.core.service.intf.NasdaqEarningService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;
import java.util.Map;

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


    @Autowired
    CounterService counterService;


    @Autowired
    GaugeService gaugeService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        log.info("log4j2 日志测试");
        model.addAttribute("host", "www.baidu.com");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        log.info("查找 list 开始");
        NasdqEarningQuery query = new NasdqEarningQuery();
        List<NasdaqEarningListResponse> listResponses = nasdaqEarningService.query();
        //根据时间分档
        model.addAttribute("list", listResponses);
        model.addAttribute("time", DateFormatUtils.format(new Date(), "yyyy-MM-dd"));

        Map<String, Integer> timeMap = Maps.newHashMap();

        //计算数量
        if (!CollectionUtils.isEmpty(listResponses)) {
            listResponses.forEach(nasdaqEarningListResponse -> {
                String time = nasdaqEarningListResponse.getPublishTime();
                if (time.equals("盘前")) {
                    time = "before";
                } else if (time.equals("盘后")) {
                    time = "after";
                } else {
                    time = "unknown";
                }

                timeMap.merge(time, 1, (oldNum, newNum) -> oldNum + newNum);
            });
        }
        model.addAttribute("timeMap", timeMap);

        counterService.increment("nasdaq.list");
        gaugeService.submit("nasdaq.list.last.visit",System.currentTimeMillis());
        return "index";
    }

//    @RequestMapping(value = "/test",method = RequestMethod.GET)
//    public String test() {
//        nasdaqEarningService.transactionTest();
//        return "index";
//    }


}
