package lkj.spring3.slang.model.dao;

import java.util.List;

import lkj.spring3.model.Slang_Board;

public interface SlangDAO {
	List<Slang_Board> select();
	Slang_Board select(long seq);
}
