package bike;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Engine1 {
	@Id
   private int eid;
   private int cc;
   @OneToOne
   private Bike1 b;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public Bike1 getB() {
	return b;
}
public void setB(Bike1 b) {
	this.b = b;
}
   
   
}
