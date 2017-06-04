package com.lol.sion.core.service.impl;

import com.google.common.collect.Lists;
import com.lol.sion.core.dao.dataobject.NasdqEarningDO;
import com.lol.sion.core.dao.intf.NasdqEarningManager;
import com.lol.sion.core.dao.query.NasdqEarningQuery;
import com.lol.sion.core.pojo.response.NasdaqEarningListResponse;
import com.lol.sion.core.service.intf.NasdaqEarningService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/2
 */
@Slf4j
@Service
public class NasdaqEarningServiceImpl implements NasdaqEarningService {

    @Autowired
    NasdqEarningManager nasdqEarningManager;


    @Override
    public List<NasdaqEarningListResponse> query() {
        String time = DateFormatUtils.format(new Date(), "M/d/yyyy");
        NasdqEarningQuery query = new NasdqEarningQuery();
        // query.or().andExpectDateEqualTo(time);
        List<NasdqEarningDO> earningDOS = nasdqEarningManager.selectByQuery(query);

        List<NasdaqEarningListResponse> list = Lists.transform(earningDOS, nasdqEarningDO -> {
            NasdaqEarningListResponse nasdaqEarningListResponse = new NasdaqEarningListResponse();
            BeanUtils.copyProperties(nasdqEarningDO, nasdaqEarningListResponse);
            String publishTime = nasdqEarningDO.getPublishTime();
            String time1 = null;
            Integer publishTimeType = null;
            switch (publishTime) {
                case "Pre-market Quotes":
                    time1 = "盘前";
                    publishTimeType = 1;
                    break;
                case "After Hour Quotes":
                    time1 = "盘后";
                    publishTimeType = 2;
                    break;
                default:
                    publishTimeType = 3;
                    time1 = "未知";
            }
            nasdaqEarningListResponse.setPublishTime(time1);
            nasdaqEarningListResponse.setPublishTimeType(publishTimeType);
            nasdaqEarningListResponse.setCode(nasdqEarningDO.getCode().toUpperCase());

            String deadLine = nasdqEarningDO.getDeadlineDate();
            Date date = null;
            try {
                date = DateUtils.parseDate(deadLine, Locale.ENGLISH, "MMM yyyy");
            } catch (ParseException e) {
                log.error("时间转换错误{}", e);
            }
            String parseTime = DateFormatUtils.format(date, "yyyy MM");
            nasdaqEarningListResponse.setDeadlineDate(parseTime);

            //财报截止
            return nasdaqEarningListResponse;
        });
        List<NasdaqEarningListResponse> listResponses = list
                .stream()
                .sorted((per, after) -> {
                    int value = per.getPublishTimeType().compareTo(after.getPublishTimeType());
                    //先比较时间 在比较市值
                    if (value == 0) {
                        Double perTotal = getTotal(per.getCapitalAmount());
                        Double afterTotal = getTotal(after.getCapitalAmount());
                        return afterTotal.compareTo(perTotal);
                    }
                    return value;

                })
                .collect(Collectors.toList());


        return listResponses;
    }

    private Double getTotal(String capitalAmount) {
        if (StringUtils.isBlank(capitalAmount)) {
            return 0D;
        }

        String regex = "(\\d+\\.\\d+)(B|M)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(capitalAmount);
        Double perT = null;
        if (matcher.find()) {
            String unit = matcher.group(2);
            if (unit.equalsIgnoreCase("B")) {
                BigDecimal decimal = new BigDecimal(matcher.group(1));
                perT = decimal.multiply(BigDecimal.valueOf(1000)).doubleValue();
            } else {
                BigDecimal decimal = new BigDecimal(matcher.group(1));
                perT = decimal.multiply(BigDecimal.valueOf(1)).doubleValue();
            }

            return perT;

        } else {
            return 0D;
        }


    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void transactionTest() {
        NasdqEarningDO nasdqEarningDO = new NasdqEarningDO();
        nasdqEarningDO.setCode("Test");
        nasdqEarningDO.setCompany("测试小黑公司");

        nasdqEarningManager.insertSelective(nasdqEarningDO);

        int a = 1 / 0;


    }

    public static void main(String[] args) throws ParseException {
        List<Integer> integerList = Lists.newArrayList(1, 5, 8, 9, 10);
        String total = "$10.38B";
        String regex = "(\\d+\\.\\d+)(B|M)";
        Pattern pattern = Pattern.compile(regex);
        Matcher perMatch = pattern.matcher(total);
        if (perMatch.find()) {
            System.out.println(perMatch.group(1));
        }
        System.out.println(perMatch.group());

    }
}
