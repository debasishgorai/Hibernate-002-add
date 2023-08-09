package Cashcadings;

import javax.persistence.EmbeddedId;

public class SignIn {
@EmbeddedId
	private MyKey mk;
	public MyKey getMk() {
	return mk;
}
public void setMk(MyKey mk) {
	this.mk = mk;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	private String name;
	private int age;
	private String password;
	
}
