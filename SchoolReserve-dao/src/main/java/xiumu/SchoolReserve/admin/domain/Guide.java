package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_GUIDE")
@Entity
public class Guide extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "cmaddress")
	String cmaddress;	//商家地址
	
	@Column(name = "ccaddress")
	String ccaddress;  //顾客地址
	
	@Column(name = "cdistance")
	String cdistance;  //相据距离
	
	@Column(name = "ctime")
	String ctime;  //预计到达时间
	
	public String getcmaddress() {
		return cmaddress;
	}

	public void setcmaddress(String cmaddress) {
		this.cmaddress =cmaddress;
	}

	public String getccaddress() {
		return ccaddress;
	}

	public void setccaddress(String ccaddress) {
		this.ccaddress = ccaddress;
	}



	public String getcdistance() {
		return cdistance;
	}

	public void setcdistance(String cdistance) {
		this.cdistance = cdistance;
	}

	public String getctime() {
		return ctime;
	}

	public void setctime(String ctime) {
		this.ctime = ctime;
	}
}
	