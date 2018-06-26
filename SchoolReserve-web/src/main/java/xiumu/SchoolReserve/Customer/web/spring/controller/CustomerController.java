package xiumu.SchoolReserve.Customer.web.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import xiumu.SchoolReserve.admin.domain.Customer;
import xiumu.SchoolReserve.admin.service.CustomerManager;

@Controller
@RequestMapping("/customer")
public class CustomerController extends GenericController<Customer,Long,CustomerManager>{
	
	CustomerManager customerManager;
	
	@Autowired
    public void setCustomerManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
		this.manager = this.customerManager;
	}


	@RequestMapping(method=RequestMethod.GET,value="/index.html")
    public String index() {
        return "/customer/index";
    }

}

