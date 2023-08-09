
package Politics;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id
private int no;
	private String name;
	private String capital;
	@OneToOne(mappedBy="s")
	private CM cm;
public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public CM getCm() {
		return cm;
	}
	public void setCm(CM cm) {
		this.cm = cm;
	}

}