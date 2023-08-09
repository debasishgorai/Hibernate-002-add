package bike;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.build.Plugin.Engine;
@Entity
public class Bike1{
	@Id
	private int bid;
	private String bname;
	@OneToOne
	private  Engine1 e;
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
	public Engine1 getE() {
		return e;
	}
	public void setE(Engine1 e) {
		this.e = e;
	}



}