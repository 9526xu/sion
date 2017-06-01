package com.lol.sion.core.dao.query;


import com.lol.sion.core.dao.query.support.BaseCriteria;
import com.lol.sion.core.dao.query.support.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NasdqEarningQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public NasdqEarningQuery() {
        super();
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        super.oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class corresponds to the database table nasdq_earning
     */
         protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
        }

        public Criteria andEarningIdIsNull() {
            addCriterion("earning_id is null");
            return (Criteria) this;
        }

        public Criteria andEarningIdIsNotNull() {
            addCriterion("earning_id is not null");
            return (Criteria) this;
        }

        public Criteria andEarningIdEqualTo(Long value) {
            addCriterion("earning_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdNotEqualTo(Long value) {
            addCriterion("earning_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anEarningIdGreaterThan(Long value) {
            addCriterion("earning_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdGreaterThanOrEqualTo(Long value) {
            addCriterion("earning_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdLessThan(Long value) {
            addCriterion("earning_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdLessThanOrEqualTo(Long value) {
            addCriterion("earning_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdIn(List<Long> values) {
            addCriterion("earning_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdNotIn(List<Long> values) {
            addCriterion("earning_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdBetween(Long value1, Long value2) {
            addCriterion("earning_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIdNotBetween(Long value1, Long value2) {
            addCriterion("earning_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(Integer value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(Integer value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountIsNull() {
            addCriterion("capital_amount is null");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountIsNotNull() {
            addCriterion("capital_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountEqualTo(String value) {
            addCriterion("capital_amount =", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotEqualTo(String value) {
            addCriterion("capital_amount <>", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountGreaterThan(String value) {
            addCriterion("capital_amount >", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("capital_amount >=", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountLessThan(String value) {
            addCriterion("capital_amount <", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountLessThanOrEqualTo(String value) {
            addCriterion("capital_amount <=", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountLike(String value) {
            addCriterion("capital_amount like", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotLike(String value) {
            addCriterion("capital_amount not like", value, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountIn(List<String> values) {
            addCriterion("capital_amount in", values, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotIn(List<String> values) {
            addCriterion("capital_amount not in", values, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountBetween(String value1, String value2) {
            addCriterion("capital_amount between", value1, value2, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andCapitalAmountNotBetween(String value1, String value2) {
            addCriterion("capital_amount not between", value1, value2, "capitalAmount");
            return (Criteria) this;
        }

        public Criteria andExpectDateIsNull() {
            addCriterion("expect_date is null");
            return (Criteria) this;
        }

        public Criteria andExpectDateIsNotNull() {
            addCriterion("expect_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpectDateEqualTo(String value) {
            addCriterion("expect_date =", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateNotEqualTo(String value) {
            addCriterion("expect_date <>", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateGreaterThan(String value) {
            addCriterion("expect_date >", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateGreaterThanOrEqualTo(String value) {
            addCriterion("expect_date >=", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateLessThan(String value) {
            addCriterion("expect_date <", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateLessThanOrEqualTo(String value) {
            addCriterion("expect_date <=", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateLike(String value) {
            addCriterion("expect_date like", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateNotLike(String value) {
            addCriterion("expect_date not like", value, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateIn(List<String> values) {
            addCriterion("expect_date in", values, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateNotIn(List<String> values) {
            addCriterion("expect_date not in", values, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateBetween(String value1, String value2) {
            addCriterion("expect_date between", value1, value2, "expectDate");
            return (Criteria) this;
        }

        public Criteria andExpectDateNotBetween(String value1, String value2) {
            addCriterion("expect_date not between", value1, value2, "expectDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateIsNull() {
            addCriterion("deadline_date is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateIsNotNull() {
            addCriterion("deadline_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateEqualTo(String value) {
            addCriterion("deadline_date =", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotEqualTo(String value) {
            addCriterion("deadline_date <>", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateGreaterThan(String value) {
            addCriterion("deadline_date >", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateGreaterThanOrEqualTo(String value) {
            addCriterion("deadline_date >=", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateLessThan(String value) {
            addCriterion("deadline_date <", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateLessThanOrEqualTo(String value) {
            addCriterion("deadline_date <=", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateLike(String value) {
            addCriterion("deadline_date like", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotLike(String value) {
            addCriterion("deadline_date not like", value, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateIn(List<String> values) {
            addCriterion("deadline_date in", values, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotIn(List<String> values) {
            addCriterion("deadline_date not in", values, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateBetween(String value1, String value2) {
            addCriterion("deadline_date between", value1, value2, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineDateNotBetween(String value1, String value2) {
            addCriterion("deadline_date not between", value1, value2, "deadlineDate");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectIsNull() {
            addCriterion("per_share_earnings_expect is null");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectIsNotNull() {
            addCriterion("per_share_earnings_expect is not null");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectEqualTo(String value) {
            addCriterion("per_share_earnings_expect =", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectNotEqualTo(String value) {
            addCriterion("per_share_earnings_expect <>", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectGreaterThan(String value) {
            addCriterion("per_share_earnings_expect >", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectGreaterThanOrEqualTo(String value) {
            addCriterion("per_share_earnings_expect >=", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectLessThan(String value) {
            addCriterion("per_share_earnings_expect <", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectLessThanOrEqualTo(String value) {
            addCriterion("per_share_earnings_expect <=", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectLike(String value) {
            addCriterion("per_share_earnings_expect like", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectNotLike(String value) {
            addCriterion("per_share_earnings_expect not like", value, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectIn(List<String> values) {
            addCriterion("per_share_earnings_expect in", values, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectNotIn(List<String> values) {
            addCriterion("per_share_earnings_expect not in", values, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectBetween(String value1, String value2) {
            addCriterion("per_share_earnings_expect between", value1, value2, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andPerShareEarningsExpectNotBetween(String value1, String value2) {
            addCriterion("per_share_earnings_expect not between", value1, value2, "perShareEarningsExpect");
            return (Criteria) this;
        }

        public Criteria andExpectNumIsNull() {
            addCriterion("expect_num is null");
            return (Criteria) this;
        }

        public Criteria andExpectNumIsNotNull() {
            addCriterion("expect_num is not null");
            return (Criteria) this;
        }

        public Criteria andExpectNumEqualTo(String value) {
            addCriterion("expect_num =", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumNotEqualTo(String value) {
            addCriterion("expect_num <>", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumGreaterThan(String value) {
            addCriterion("expect_num >", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumGreaterThanOrEqualTo(String value) {
            addCriterion("expect_num >=", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumLessThan(String value) {
            addCriterion("expect_num <", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumLessThanOrEqualTo(String value) {
            addCriterion("expect_num <=", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumLike(String value) {
            addCriterion("expect_num like", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumNotLike(String value) {
            addCriterion("expect_num not like", value, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumIn(List<String> values) {
            addCriterion("expect_num in", values, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumNotIn(List<String> values) {
            addCriterion("expect_num not in", values, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumBetween(String value1, String value2) {
            addCriterion("expect_num between", value1, value2, "expectNum");
            return (Criteria) this;
        }

        public Criteria andExpectNumNotBetween(String value1, String value2) {
            addCriterion("expect_num not between", value1, value2, "expectNum");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateIsNull() {
            addCriterion("last_year_report_date is null");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateIsNotNull() {
            addCriterion("last_year_report_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateEqualTo(String value) {
            addCriterion("last_year_report_date =", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateNotEqualTo(String value) {
            addCriterion("last_year_report_date <>", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateGreaterThan(String value) {
            addCriterion("last_year_report_date >", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateGreaterThanOrEqualTo(String value) {
            addCriterion("last_year_report_date >=", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateLessThan(String value) {
            addCriterion("last_year_report_date <", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateLessThanOrEqualTo(String value) {
            addCriterion("last_year_report_date <=", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateLike(String value) {
            addCriterion("last_year_report_date like", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateNotLike(String value) {
            addCriterion("last_year_report_date not like", value, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateIn(List<String> values) {
            addCriterion("last_year_report_date in", values, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateNotIn(List<String> values) {
            addCriterion("last_year_report_date not in", values, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateBetween(String value1, String value2) {
            addCriterion("last_year_report_date between", value1, value2, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearReportDateNotBetween(String value1, String value2) {
            addCriterion("last_year_report_date not between", value1, value2, "lastYearReportDate");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsIsNull() {
            addCriterion("last_year_per_share_earnings is null");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsIsNotNull() {
            addCriterion("last_year_per_share_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsEqualTo(String value) {
            addCriterion("last_year_per_share_earnings =", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsNotEqualTo(String value) {
            addCriterion("last_year_per_share_earnings <>", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsGreaterThan(String value) {
            addCriterion("last_year_per_share_earnings >", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("last_year_per_share_earnings >=", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsLessThan(String value) {
            addCriterion("last_year_per_share_earnings <", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsLessThanOrEqualTo(String value) {
            addCriterion("last_year_per_share_earnings <=", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsLike(String value) {
            addCriterion("last_year_per_share_earnings like", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsNotLike(String value) {
            addCriterion("last_year_per_share_earnings not like", value, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsIn(List<String> values) {
            addCriterion("last_year_per_share_earnings in", values, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsNotIn(List<String> values) {
            addCriterion("last_year_per_share_earnings not in", values, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsBetween(String value1, String value2) {
            addCriterion("last_year_per_share_earnings between", value1, value2, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andLastYearPerShareEarningsNotBetween(String value1, String value2) {
            addCriterion("last_year_per_share_earnings not between", value1, value2, "lastYearPerShareEarnings");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(String value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(String value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(String value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(String value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(String value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLike(String value) {
            addCriterion("publish_time like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotLike(String value) {
            addCriterion("publish_time not like", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<String> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<String> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(String value1, String value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(String value1, String value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table nasdq_earning
    */
    public  static class Criteria extends GeneratedCriteria{
        protected Criteria() {
            super();
        }
    }



    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}