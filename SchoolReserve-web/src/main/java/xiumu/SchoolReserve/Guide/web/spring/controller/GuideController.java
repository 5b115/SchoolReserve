package xiumu.SchoolReserve.Guide.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import xiumu.SchoolReserve.admin.domain.Guide;
import xiumu.SchoolReserve.admin.service.GuideManager;

@Controller
@RequestMapping("/indent")
public class GuideController extends GenericController<Guide, Long, GuideManager> {

	GuideManager GuideManager;
	
	@Autowired
	public void setGuideManager(GuideManager GuideManager) {
		this.GuideManager = GuideManager;
		this.manager = this.GuideManager;
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/index.html")
	public String index() {
		String result = "/Guide/index";
		return result;
	}
	
	
}
