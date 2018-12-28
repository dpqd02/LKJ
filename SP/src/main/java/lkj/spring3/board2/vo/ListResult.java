package lkj.spring3.board2.vo;

import java.util.List;
import lkj.spring3.model.Board2;

public class ListResult {
	private int page;
	private long totalCount;
	private int pageSize;
	private List<Board2> list;
	private long totalPageCount;
	
	public ListResult(){}
	public ListResult(int page, long totalCount, int pageSize, List<Board2> list) {
		this.page = page;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.list = list;
		this.totalPageCount = calTotalPageCount();
	}
	public long calTotalPageCount() {
		long tpc= totalCount/pageSize;
		if(totalCount%pageSize !=0) tpc++;
		return tpc;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Board2> getList() {
		return list;
	}
	public void setList(List<Board2> list) {
		this.list = list;
	}
	public long getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
		
}
