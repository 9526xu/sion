package com.lol.sion.core.service.impl;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.lol.sion.core.dao.dataobject.NasdqEarningDO;
import com.lol.sion.core.dao.intf.NasdqEarningManager;
import com.lol.sion.core.dao.query.NasdqEarningQuery;
import com.lol.sion.core.pojo.response.NasdaqEarningListResponse;
import com.lol.sion.core.service.intf.NasdaqEarningService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.List;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/2
 */
@Service
public class NasdaqEarningServiceImpl implements NasdaqEarningService {

    @Autowired
    NasdqEarningManager nasdqEarningManager;


    @Override
    public List<NasdaqEarningListResponse> query() {
        String time = DateFormatUtils.format(new Date(), "M/d/yyyy");
        NasdqEarningQuery query = new NasdqEarningQuery();
        query.or().andExpectDateEqualTo(time);
        List<NasdqEarningDO> earningDOS = nasdqEarningManager.selectByQuery(query);

        List<NasdaqEarningListResponse> list = Lists.transform(earningDOS, new Function<NasdqEarningDO, NasdaqEarningListResponse>() {
            @Override
            public NasdaqEarningListResponse apply(@Nullable NasdqEarningDO nasdqEarningDO) {
                NasdaqEarningListResponse nasdaqEarningListResponse = new NasdaqEarningListResponse();
                BeanUtils.copyProperties(nasdqEarningDO, nasdaqEarningListResponse);
                return nasdaqEarningListResponse;
            }
        });
        return list;
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
}
