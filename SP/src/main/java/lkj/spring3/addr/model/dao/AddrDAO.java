package lkj.spring3.addr.model.dao;

import java.util.List;
import lkj.spring3.model.Address;

public interface AddrDAO {
	List<Address> list();
	void insert(Address address);
	void delete(long seq);
}
