package lkj.spring3.slang.model.service;

import java.util.List;
import lkj.spring3.model.Slang_Board;

public interface SlangService {
	List<Slang_Board> selectService();
	Slang_Board selectService(long seq);
}
