package com.hx.common.base;

import java.io.Serializable;


public class Page implements Serializable {

	/** 
	 * @Fields serialVersionUID : 
	 */ 
	private static final long serialVersionUID = -695964261708844818L;
	
	private int pageNo = 1;//页码，默认是第一页
    private int pageSize = 10;//每页显示的记录数，默认是10
    private long totalRecord = -1;//总记录数
    private int totalPage;//总页数
    
    public Page(){}
    public Page(int pageNo, int pageSize){
    	this.pageNo = pageNo;
    	this.pageSize = pageSize;
    }
    
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
	    //在设置总页数的时候计算出对应的总页数，在下面的三目运算中加法拥有更高的优先级，所以最后可以不加括号。
		if(0 == pageSize){
			pageSize =10;
		}
		int totalPage = (int) (totalRecord % pageSize == 0l ? totalRecord / pageSize : totalRecord / pageSize + 1);
	    this.setTotalPage(totalPage);
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
