package lkj.spring3.addr.ajax.model.service;

import java.util.List;
import lkj.spring3.model.Address;

public interface AddrService {
	List<Address> listService();
	void insertService(Address address);
	void deleteService(long seq);
	
	//for Ajax
	Address selectService(long seq);
	List<Address> selectService(String name);
}
