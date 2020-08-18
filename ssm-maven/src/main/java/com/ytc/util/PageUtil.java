package com.ytc.util;

import java.util.ArrayList;
import java.util.List;


public class PageUtil<T>{

	private int start; // 起始条数
	private int end; // 结束条数
	private int totalPage; // 总页数
	private int cpage=1; // 当前页
	private Long totalRow; // 总信息数
	private int pageSize = 3; // 分页单位
	private List<T> list = new ArrayList<>();  //当前页的数据
	
	
	public PageUtil(int cpage, Long totalRow, int pageSize) {
		this.totalRow = totalRow;
		this.pageSize = pageSize;
		this.cpage = (cpage <= 0) ? 1 : cpage;
		this.totalPage = (int) (totalRow / pageSize);
		if (totalRow % pageSize > 0)
			this.totalPage = this.totalPage + 1;
		if (this.cpage > this.totalPage)
			this.cpage = this.totalPage;

		this.start = (this.cpage - 1) * pageSize;
		this.end = this.start + pageSize;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public int getTotalPage() {
		return this.totalPage;
	}

	public int getCpage() {
		return cpage;
	}

	public Long getTotalRow() {
		return totalRow;
	}

	public int getPageSize() {
		return pageSize;
	}


	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public void setCpage(int cpage) {
		this.cpage = cpage;
	}

	public void setTotalRow(Long totalRow) {
		this.totalPage = (int) (totalRow / pageSize);
		if (totalRow % pageSize > 0)
			this.totalPage = this.totalPage + 1;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public PageUtil() {
		super();
	}


	public void setList(List<T> list) {
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}



}
