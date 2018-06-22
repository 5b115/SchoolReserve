package xiumu.SchoolReserve.admin.service;


import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import xiumu.SchoolReserve.admin.domain.Indent;

public interface IndentManager extends GenericManager<Indent, Long> {

	
	List<Indent> findAll();
	
	List<Indent> findbyIndentfoodname(String indentfoodname);
}
