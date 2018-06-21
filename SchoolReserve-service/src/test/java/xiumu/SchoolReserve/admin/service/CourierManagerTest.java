package xiumu.SchoolReserve.admin.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import xiumu.SchoolReserve.admin.domain.Courier;

public class CourierManagerTest extends GenericManagerTestCase<Long, Courier, CourierManager>{

	CourierManager courierManager;
	
	private static final Logger logger = LogManager.getLogger(CourierManagerTest.class.getName());
	
	
	public CourierManagerTest() {
		super(Courier.class);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setMerchantManager(MerchantManager merchantManager) {
		this.courierManager = courierManager;
		this.manager = this.courierManager;
	}
	@Before
	public void setUp() throws Exception{
		Courier courier = new Courier();
		courier.setCname("C1");
		courier.setCaddress("河南省郑州市");
		courier.setCphone("139*******2");
		this.entity = this.manager.save(courier);
	}
	@Test
	public void testFindByCname() {
		List<Courier> result = this.courierManager.findbyCname("C");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("C1", result.get(0).getCname());
	}
}
