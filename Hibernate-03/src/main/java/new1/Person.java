package new1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="myperson")
@Entity
public class Person {
@Id

private int id;
@Column(length=20,nullable=false)
private String name;
@Column(length=25,unique=true)
private String email;
@Column(length=6,nullable=false)
private String gender;
@Column(nullable=false,name="page")
private int age;
}
