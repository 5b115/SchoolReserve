package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_INDENT")
@Entity
public class Indent extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "INTENDFOODNAME")
	String intendfoodname;	//订单菜品名
	
	@Column(name = "INTENDDATE")
	String intenddate;  //订单日期
	
	@Column(name = "INTENDPRICE")
	String intendprice;	//订单菜品名
	
	public String getIntendfoodname() {
		return intendfoodname;
	}

	public void setIntendfoodname(String intendfoodname) {
		this.intendfoodname = intendfoodname;
	}

	public String getIntenddate() {
		return intenddate;
	}

	public void setIntenddate(String intenddate) {
		this.intenddate = intenddate;
	}
	
	public String getIntendprice() {
		return intendprice;
	}

	public void setIntendprice(String intendprice) {
		this.intendprice = intendprice;
	}
	
}
