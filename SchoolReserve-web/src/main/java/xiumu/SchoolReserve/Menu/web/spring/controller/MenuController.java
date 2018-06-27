package xiumu.SchoolReserve.Menu.web.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.dream.base.web.spring.controller.GenericController;
import xiumu.SchoolReserve.admin.domain.Menu;
import xiumu.SchoolReserve.admin.service.MenuManager;

@Controller
@RequestMapping("/menu")
public class MenuController extends GenericController<Menu,Long,MenuManager>{
	
	MenuManager menuManager;
	
	@Autowired
    public void setMenuManager(MenuManager menuManager) {
		this.menuManager = menuManager;
		this.manager = this.menuManager;
	}


	@RequestMapping(method=RequestMethod.GET,value="/index.html")
    public String index() {
        return "/menu/index";
    }

}
