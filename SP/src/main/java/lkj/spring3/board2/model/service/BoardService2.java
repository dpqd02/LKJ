package lkj.spring3.board2.model.service;

import lkj.spring3.board2.vo.ListResult;
import lkj.spring3.model.Board2;

public interface BoardService2 {
	ListResult getListResult(int page, int pageSize);
	Board2 getBoard(long seq);
	void write(Board2 board);
	void edit(Board2 board);
	void remove(long seq);
	
}
