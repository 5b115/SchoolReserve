package xiumu.SchoolReserve.indent.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import xiumu.SchoolReserve.admin.domain.Indent;
import xiumu.SchoolReserve.admin.service.IndentManager;

@Controller
@RequestMapping("/indent")
public class IndentController extends GenericController<Indent, Long, IndentManager> {

	IndentManager indentManager;
	
	@Autowired
	public void setMerchantManager(IndentManager indentManager) {
		this.indentManager = indentManager;
		this.manager = this.indentManager;
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/index.html")
	public String index() {
		String result = "/indent/index";
		return result;
	}
	
	
}
