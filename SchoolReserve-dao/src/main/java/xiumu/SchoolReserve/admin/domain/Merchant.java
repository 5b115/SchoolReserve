package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_MERCHANT")
@Entity
public class Merchant extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "MERCHANTNAME")
	String merchantname;	//商户店名
	
	@Column(name = "MERCHANTADDRESS")
	String merchantaddress;  //商户地址

	public String getMerchantname() {
		return merchantname;
	}

	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}

	public String getMerchantaddress() {
		return merchantaddress;
	}

	public void setMerchantaddress(String merchantaddress) {
		this.merchantaddress = merchantaddress;
	}
	
	
	
}
