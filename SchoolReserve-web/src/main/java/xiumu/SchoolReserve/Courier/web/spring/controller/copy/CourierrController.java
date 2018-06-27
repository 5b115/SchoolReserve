package xiumu.SchoolReserve.Courier.web.spring.controller.copy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import xiumu.SchoolReserve.admin.domain.Courier;
import xiumu.SchoolReserve.admin.service.CourierManager;


@Controller
@RequestMapping("/courier")
public class CourierrController extends GenericController<Courier,Long,CourierManager>{
	
	CourierManager courierManager;
	
	@Autowired
    public void setCourierManager(CourierManager courierManager) {
		this.courierManager = courierManager;
		this.manager = this.courierManager;
	}


	@RequestMapping(method=RequestMethod.GET,value="/index.html")
    public String index() {
        return "/courier/index";
    }

}

