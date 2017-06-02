package com.lol.sion.core.dao.dataobject;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class NasdqEarningDO implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public Long getEarningId() {
        return earningId;

    }

    public void setEarningId(Long earningId) {
        this.earningId = earningId;

    }

    public Date getGmtCreate() {
        return gmtCreate == null ? null : new Date(gmtCreate.getTime());

    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : new Date(gmtCreate.getTime());

    }

    public Date getGmtModified() {
        return gmtModified == null ? null : new Date(gmtModified.getTime());

    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified == null ? null : new Date(gmtModified.getTime());

    }

    public Integer getIsDeleted() {
        return isDeleted;

    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;

    }

    public String getCompany() {
        return company;

    }

    public void setCompany(String company) {
        this.company = company;

    }

    public String getCode() {
        return code;

    }

    public void setCode(String code) {
        this.code = code;

    }

    public String getCapitalAmount() {
        return capitalAmount;

    }

    public void setCapitalAmount(String capitalAmount) {
        this.capitalAmount = capitalAmount;

    }

    public String getExpectDate() {
        return expectDate;

    }

    public void setExpectDate(String expectDate) {
        this.expectDate = expectDate;

    }

    public String getDeadlineDate() {
        return deadlineDate;

    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;

    }

    public String getPerShareEarningsExpect() {
        return perShareEarningsExpect;

    }

    public void setPerShareEarningsExpect(String perShareEarningsExpect) {
        this.perShareEarningsExpect = perShareEarningsExpect;

    }

    public String getExpectNum() {
        return expectNum;

    }

    public void setExpectNum(String expectNum) {
        this.expectNum = expectNum;

    }

    public String getLastYearReportDate() {
        return lastYearReportDate;

    }

    public void setLastYearReportDate(String lastYearReportDate) {
        this.lastYearReportDate = lastYearReportDate;

    }

    public String getLastYearPerShareEarnings() {
        return lastYearPerShareEarnings;

    }

    public void setLastYearPerShareEarnings(String lastYearPerShareEarnings) {
        this.lastYearPerShareEarnings = lastYearPerShareEarnings;

    }

    public String getPublishTime() {
        return publishTime;

    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;

    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;

    }


    public static interface IField {

        public static final String f_earning_id = "earningId";

        public static final String f_gmt_create = "gmtCreate";

        public static final String f_gmt_modified = "gmtModified";

        public static final String f_is_deleted = "isDeleted";

        public static final String f_company = "company";

        public static final String f_code = "code";

        public static final String f_capital_amount = "capitalAmount";

        public static final String f_expect_date = "expectDate";

        public static final String f_deadline_date = "deadlineDate";

        public static final String f_per_share_earnings_expect = "perShareEarningsExpect";

        public static final String f_expect_num = "expectNum";

        public static final String f_last_year_report_date = "lastYearReportDate";

        public static final String f_last_year_per_share_earnings = "lastYearPerShareEarnings";

        public static final String f_publish_time = "publishTime";

        public static final String f_title = "title";

    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}