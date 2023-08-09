package mobile;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	@Id
private int mid;
private String brand;
private double price;
@OneToMany
private List<Sim>sims;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public List<Sim> getSims() {
	return sims;
}
public void setSims(List<Sim> sims) {
	this.sims = sims;
}
}
