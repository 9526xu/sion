package com.lol.sion.core.pojo.response;

import lombok.Data;

import java.util.Date;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/2
 */
@Data
public class NasdaqEarningListResponse {

    /**
     * This field corresponds to the database column nasdq_earning.earning_id
     */
    private Long earningId;

    /**
     * This field corresponds to the database column nasdq_earning.gmt_create
     */
    private Date gmtCreate;

    /**
     * This field corresponds to the database column nasdq_earning.gmt_modified
     */
    private Date gmtModified;

    /**
     * This field corresponds to the database column nasdq_earning.is_deleted
     */
    private Integer isDeleted;

    /**
     * This field corresponds to the database column nasdq_earning.company
     */
    private String company;

    /**
     * This field corresponds to the database column nasdq_earning.code
     */
    private String code;

    /**
     * This field corresponds to the database column nasdq_earning.capital_amount
     */
    private String capitalAmount;

    /**
     * This field corresponds to the database column nasdq_earning.expect_date
     */
    private String expectDate;

    /**
     * This field corresponds to the database column nasdq_earning.deadline_date
     */
    private String deadlineDate;

    /**
     * This field corresponds to the database column nasdq_earning.per_share_earnings_expect
     */
    private String perShareEarningsExpect;

    /**
     * This field corresponds to the database column nasdq_earning.expect_num
     */
    private String expectNum;

    /**
     * This field corresponds to the database column nasdq_earning.last_year_report_date
     */
    private String lastYearReportDate;

    /**
     * This field corresponds to the database column nasdq_earning.last_year_per_share_earnings
     */
    private String lastYearPerShareEarnings;

    /**
     * This field corresponds to the database column nasdq_earning.publish_time
     */
    private String publishTime;

    /**
     * This field corresponds to the database column nasdq_earning.title
     */
    private String title;


    private Integer publishTimeType;

    private String reportStr;
}
