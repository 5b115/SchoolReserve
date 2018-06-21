package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_MERCHANT")
@Entity
public class Courier extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "CNAME")
	String Cname;	//快递员名字
	
	@Column(name = "CADDRESS")
	String Caddress;  //快递员负责区域
	
	@Column(name = "CPHONE")
	String Cphone;  //快递员电话

	boolean sfwcdd;
	
	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getCaddress() {
		return Caddress;
	}

	public void setCaddress(String caddress) {
		Caddress = caddress;
	}



	public String getCphone() {
		return Cphone;
	}

	public void setCphone(String cphone) {
		Cphone = cphone;
	}

	public boolean isSfwcdd() {
		return sfwcdd;
	}

	public void setSfwcdd(boolean sfwcdd) {
		this.sfwcdd = sfwcdd;
	}
	


	
	
}
