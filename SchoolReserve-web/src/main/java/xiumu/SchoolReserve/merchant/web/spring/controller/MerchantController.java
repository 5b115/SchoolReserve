package xiumu.SchoolReserve.merchant.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import xiumu.SchoolReserve.admin.domain.Merchant;
import xiumu.SchoolReserve.admin.service.MerchantManager;

@Controller
@RequestMapping("/merchant")
public class MerchantController extends GenericController<Merchant, Long, MerchantManager> {

	MerchantManager merchantManager;
	
	@Autowired
	public void setMerchantManager(MerchantManager merchantManager) {
		this.merchantManager = merchantManager;
		this.manager = this.merchantManager;
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/index.html")
	public String index() {
		String result = "/merchant/index";
		return result;
	}
	
	
}
