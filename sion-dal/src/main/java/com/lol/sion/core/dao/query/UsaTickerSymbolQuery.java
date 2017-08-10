package com.lol.sion.core.dao.query;


import com.lol.sion.core.dao.query.support.BaseCriteria;
import com.lol.sion.core.dao.query.support.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsaTickerSymbolQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public UsaTickerSymbolQuery() {
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
     * This class corresponds to the database table usa_ticker_symbol
     */
         protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
        }

        public Criteria andSymbolIdIsNull() {
            addCriterion("symbol_id is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIdIsNotNull() {
            addCriterion("symbol_id is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolIdEqualTo(Long value) {
            addCriterion("symbol_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotEqualTo(Long value) {
            addCriterion("symbol_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anSymbolIdGreaterThan(Long value) {
            addCriterion("symbol_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("symbol_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdLessThan(Long value) {
            addCriterion("symbol_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdLessThanOrEqualTo(Long value) {
            addCriterion("symbol_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdIn(List<Long> values) {
            addCriterion("symbol_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotIn(List<Long> values) {
            addCriterion("symbol_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdBetween(Long value1, Long value2) {
            addCriterion("symbol_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIdNotBetween(Long value1, Long value2) {
            addCriterion("symbol_id not between", value1, value2, "id");
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

        public Criteria andTickerNameCnIsNull() {
            addCriterion("ticker_name_cn is null");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnIsNotNull() {
            addCriterion("ticker_name_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnEqualTo(String value) {
            addCriterion("ticker_name_cn =", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnNotEqualTo(String value) {
            addCriterion("ticker_name_cn <>", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnGreaterThan(String value) {
            addCriterion("ticker_name_cn >", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("ticker_name_cn >=", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnLessThan(String value) {
            addCriterion("ticker_name_cn <", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnLessThanOrEqualTo(String value) {
            addCriterion("ticker_name_cn <=", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnLike(String value) {
            addCriterion("ticker_name_cn like", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnNotLike(String value) {
            addCriterion("ticker_name_cn not like", value, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnIn(List<String> values) {
            addCriterion("ticker_name_cn in", values, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnNotIn(List<String> values) {
            addCriterion("ticker_name_cn not in", values, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnBetween(String value1, String value2) {
            addCriterion("ticker_name_cn between", value1, value2, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerNameCnNotBetween(String value1, String value2) {
            addCriterion("ticker_name_cn not between", value1, value2, "tickerNameCn");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolIsNull() {
            addCriterion("ticker_symbol is null");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolIsNotNull() {
            addCriterion("ticker_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolEqualTo(String value) {
            addCriterion("ticker_symbol =", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolNotEqualTo(String value) {
            addCriterion("ticker_symbol <>", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolGreaterThan(String value) {
            addCriterion("ticker_symbol >", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("ticker_symbol >=", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolLessThan(String value) {
            addCriterion("ticker_symbol <", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolLessThanOrEqualTo(String value) {
            addCriterion("ticker_symbol <=", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolLike(String value) {
            addCriterion("ticker_symbol like", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolNotLike(String value) {
            addCriterion("ticker_symbol not like", value, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolIn(List<String> values) {
            addCriterion("ticker_symbol in", values, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolNotIn(List<String> values) {
            addCriterion("ticker_symbol not in", values, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolBetween(String value1, String value2) {
            addCriterion("ticker_symbol between", value1, value2, "tickerSymbol");
            return (Criteria) this;
        }

        public Criteria andTickerSymbolNotBetween(String value1, String value2) {
            addCriterion("ticker_symbol not between", value1, value2, "tickerSymbol");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table usa_ticker_symbol
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