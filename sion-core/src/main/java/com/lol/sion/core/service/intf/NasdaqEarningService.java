package com.lol.sion.core.service.intf;

import com.lol.sion.core.pojo.response.NasdaqEarningListResponse;

import java.util.List;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/2
 */
public interface NasdaqEarningService {

    List<NasdaqEarningListResponse> query();

    void transactionTest();


}
