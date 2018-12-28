package lkj.spring3.board2.model.dao;

import java.util.List;
import lkj.spring3.model.Board2;

public interface BoardDAO2 {
	List<Board2> select(int page, int pageSize);
	long selectCount();
	Board2 select(long seq);
	void insert(Board2 board);
	void update(Board2 board);
	void delete(long seq);
}
