package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_COURIER")
@Entity
public class Courier extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "cname")
	String cname;	//快递员名字
	
	@Column(name = "caddress")
	String caddress;  //快递员负责区域
	
	@Column(name = "cphone")
	String cphone;  //快递员电话

	boolean sfwcdd;
	
	public String getcname() {
		return cname;
	}

	public void setcname(String cname) {
		this.cname = cname;
	}

	public String getcaddress() {
		return caddress;
	}

	public void setcaddress(String caddress) {
		this.caddress = caddress;
	}



	public String getcphone() {
		return cphone;
	}

	public void setcphone(String cphone) {
		this.cphone = cphone;
	}

	public boolean isSfwcdd() {
		return sfwcdd;
	}

	public void setSfwcdd(boolean sfwcdd) {
		this.sfwcdd = sfwcdd;
	}
	


	
	
}
