package xiumu.SchoolReserve.admin.service;


import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import xiumu.SchoolReserve.admin.domain.Menu;

public interface MenuManager extends GenericManager<Menu, Long> {

	
	List<Menu> findAll();
	
	List<Menu> findbyMenufoodname(String Menufoodname);
}
