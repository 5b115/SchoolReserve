package xiumu.SchoolReserve.admin.service;


import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import xiumu.SchoolReserve.admin.domain.Customer;

public interface CustomerManager extends GenericManager<Customer, Long> {

	
	List<Customer> findAll();
	
	List<Customer> findbyCustomername(String Customername);
}
