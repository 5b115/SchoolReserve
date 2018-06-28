package xiumu.SchoolReserve.admin.service;


import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import xiumu.SchoolReserve.admin.domain.Guide;

public interface GuideManager extends GenericManager<Guide, Long> {

	
	List<Guide> findAll();
	
	List<Guide> findbycdistance(String cdistance);
}
