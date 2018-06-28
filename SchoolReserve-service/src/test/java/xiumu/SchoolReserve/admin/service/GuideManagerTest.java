package xiumu.SchoolReserve.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericGenerator;
import xiumu.SchoolReserve.admin.domain.Guide;

public class GuideManagerTest extends GenericGenerator{

	@Autowired
	GuideManager GuideManager;
	
	
	@Test
	public void testAdd() {
		Guide Guide = new Guide();
		Guide.setcmaddress("美食城二楼");
		Guide.setccaddress("北五b115");
		Guide.setcdistance("0.1km");
		Guide.setctime("15分钟");
		this.GuideManager.save(Guide);
	}
}
