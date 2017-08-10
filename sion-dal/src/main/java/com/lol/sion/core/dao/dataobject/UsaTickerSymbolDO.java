package com.lol.sion.core.dao.dataobject;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class UsaTickerSymbolDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * This field corresponds to the database column usa_ticker_symbol.symbol_id
     */
    private Long symbolId;

    /**
     * This field corresponds to the database column usa_ticker_symbol.is_deleted
     */
    private Integer isDeleted;

    /**
     * This field corresponds to the database column usa_ticker_symbol.gmt_create
     */
    private Date gmtCreate;

    /**
     * This field corresponds to the database column usa_ticker_symbol.gmt_modified
     */
    private Date gmtModified;

    /**
     * This field corresponds to the database column usa_ticker_symbol.ticker_name_cn
     */
    private String tickerNameCn;

    /**
     * This field corresponds to the database column usa_ticker_symbol.ticker_symbol
     */
    private String tickerSymbol;

	public Long getSymbolId() {
	                return symbolId;
	    
	}

	public void setSymbolId(Long symbolId) {
                    this.symbolId = symbolId;
	    
	}

	public Integer getIsDeleted() {
	                return isDeleted;
	    
	}

	public void setIsDeleted(Integer isDeleted) {
                    this.isDeleted = isDeleted;
	    
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

	public String getTickerNameCn() {
	                return tickerNameCn;
	    
	}

	public void setTickerNameCn(String tickerNameCn) {
                    this.tickerNameCn = tickerNameCn;
	    
	}

	public String getTickerSymbol() {
	                return tickerSymbol;
	    
	}

	public void setTickerSymbol(String tickerSymbol) {
                    this.tickerSymbol = tickerSymbol;
	    
	}


	public static interface IField {
		
		public static final String f_symbol_id = "symbolId";
		
		public static final String f_is_deleted = "isDeleted";
		
		public static final String f_gmt_create = "gmtCreate";
		
		public static final String f_gmt_modified = "gmtModified";
		
		public static final String f_ticker_name_cn = "tickerNameCn";
		
		public static final String f_ticker_symbol = "tickerSymbol";
		
	}

    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}