package xiumu.SchoolReserve.admin.service;



import java.util.ArrayList;
import java.util.List;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import edu.zut.cs.javaee.dream.base.service.GenericGenerator;

import xiumu.SchoolReserve.admin.domain.Courier;

public class CourierManagerTest extends GenericGenerator{
	
	
	
	@Autowired
	CourierManager courierManager;
	@Test
	public void Cadd() 
	{
		List<Courier> list=new ArrayList<Courier>();
		for(int i=0;i<100;i++)
    	{
    		Courier courier=new Courier();
    		courier.setCname("bigpenzi");
    		courier.setCaddress("****");
    		courier.setCphone("1*******0");
    		list.add(courier);
    	}
    	this.courierManager.save(list);
    }
		
	}

 



