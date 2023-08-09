package bike;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.build.Plugin.Engine;
@Entity
public class Bike {
@Id
	private int bid;
	private String bname;
	@OneToOne
	private Engine e;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public void setE(bike.Engine e2) {
		// TODO Auto-generated method stub
		
	}


	
}
