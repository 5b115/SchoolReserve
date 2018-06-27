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
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import xiumu.SchoolReserve.admin.domain.Customer;

public class CustomerManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager>{

	CustomerManager customerManager;
	
	private static final Logger logger = LogManager.getLogger(CustomerManagerTest.class.getName());
	
	
	public CustomerManagerTest() {
		super(Customer.class);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setCustomerManager(CustomerManager customerManager) {
		this.customerManager = customerManager;
		this.manager = this.customerManager;
	}
	@Before
	public void setUp() throws Exception{
		for(int i=0;i<50;i++)
			
		{
			
			Customer customer = new Customer();
			if(i%3==0||i%5==0) {
				customer.setCustomerSex("男");
			}else {
				customer.setCustomerSex("女");
			}
			customer.setCustomerSno("2016");
			if(i%3==0&&i%6==0) {
				if(i<=30) {
					customer.setCustomerName("张娜拉"+i);
				}else {
					customer.setCustomerName("谢霆锋"+i);
				}
			}
			else {

				customer.setCustomerName("刘益民"+i);
			}
		
			customer.setRegistrationDate("2016/8/8");
			this.entity = this.manager.save(customer);
		}
	}
	@Test@Rollback(false)//避免插入的数据回滚
	public void testFindByCustomername() {
		List<Customer> result = this.customerManager.findbyCustomername("吴");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("吴吴", result.get(0).getCustomerName());
	}
}
