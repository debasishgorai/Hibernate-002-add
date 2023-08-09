package new1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
private int sid;
private String name;
private String type;
@ManyToMany
private List<Course>cources;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Course> getCources() {
		return cources;
	}
	public void setCources(List<Course> cources) {
		this.cources = cources;
	}

}
