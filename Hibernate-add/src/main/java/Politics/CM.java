
package Politics;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CM {
	@Id
	private String name;
	private int age;
	private String qualification;
	@OneToOne
	@JoinColumn
	private State s;
	@Override
	public String toString() {
		return "CM [name=" + name + ", age=" + age + ", qualification=" + qualification + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public State getS() {
		return s;
	}
	public void setS(State s) {
		this.s = s;
	}
	
	
}