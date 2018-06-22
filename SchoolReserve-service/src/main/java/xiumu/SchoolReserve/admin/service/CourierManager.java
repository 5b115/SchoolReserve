package xiumu.SchoolReserve.admin.service;


import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import xiumu.SchoolReserve.admin.domain.Courier;

public interface CourierManager extends GenericManager<Courier, Long> {

	
	List<Courier> findAll();
	
	List<Courier> findbyCname(String Cname);
	
	
	 
}
