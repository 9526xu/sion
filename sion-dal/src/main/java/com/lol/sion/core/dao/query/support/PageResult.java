package com.lol.sion.core.dao.query.support;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 */
public class PageResult<X> implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<X> result;

	private int pageNo = BaseQuery.DEFAULT_PAGE;

	private int totalCount; // 总的数目

	private int pageSize = BaseQuery.DEFAULT_PAGE_SIZE; //每一页数目

	public static <T> PageResult<T> createPageResult(List<T> data, PageInfo pageInfo) {
		PageResult<T> pageResult = new PageResult<T>();
		pageResult.setPageNo(pageInfo.getPageNo());
		pageResult.setPageSize(pageInfo.getPageSize());
		pageResult.setTotalCount(pageInfo.getTotalCount());
		pageResult.setResult(data);
		return pageResult;
	}
	
	public PageInfo getPageInfo() {
		return new PageInfo(this.getPageNo(), 
				this.getPageSize(), 
				this.getTotalCount());
	}

	@Data
	@AllArgsConstructor
	public static class PageInfo {
		
		private int pageNo;
		
		private int pageSize;
		
		private int totalCount;
		
	}
	
	public List<X> getResult() {
		return result;
	}

	public void setResult(List<X> result) {
		this.result = result;
	}

    public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalPage() {
        if(pageNo < 1){
            pageNo = BaseQuery.DEFAULT_PAGE;
        }
		return totalCount / pageSize + (totalCount % pageSize == 0 ? 0 : 1);
	}


	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
