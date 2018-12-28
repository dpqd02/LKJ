package lkj.spring3.addr.ajax.model.dao;

import java.util.List;
import lkj.spring3.model.Address;

public interface AddrDAO {
	List<Address> list();
	void insert(Address address);
	void delete(long seq);
	
	//for Ajax
	Address select(long seq);
	List<Address> select(String name);
}
