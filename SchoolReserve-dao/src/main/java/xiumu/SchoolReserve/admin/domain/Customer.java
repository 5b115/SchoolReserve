package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_Customer")
@Entity
public class Customer extends BaseEntity {

	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "CustomerSno")
	String CustomerSno; // 顾客学号

	@Column(name = "CustomerName")
	String CustomerName; // 顾客姓名

	@Column(name = "CustomerSex")
	String CustomerSex; // 顾客性别

	@Column(name = "RegistrationDate")
	String RegistrationDate; // 注册日期
	@Column(name = "CustomerIntro")
	String CustomerIntro; // 用户介绍
	public String getCustomerIntro() {
		return CustomerIntro;
	}

	public void setCustomerIntro(String CustomerIntro) {
		CustomerIntro = CustomerIntro;
	}

	public String getCustomerSno() {
		return CustomerSno;
	}

	public void setCustomerSno(String customerSno) {
		CustomerSno = customerSno;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerSex() {
		return CustomerSex;
	}

	public void setCustomerSex(String customerSex) {
		CustomerSex = customerSex;
	}

	public String getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		RegistrationDate = registrationDate;
	}
	
	

}
