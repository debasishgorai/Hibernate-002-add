package state;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStateCM {
public static void main(String[] args) {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
	EntityManager em=emf.createEntityManager();
	
	State s=em.find(State.class, 2);
	int no=s.getNo();
	String name=s.getName();
	String capital=s.getCapital();
	
	
	CM c=s.getCm();
	String cmname=c.getName();
	int age=c.getAge();
	String qualification =c.getQualification();
	
	System.out.println("-----------STATE DETAILS----------");
	System.out.println(no);
	System.out.println(name);
	System.out.println(capital);
	
	System.out.println("-----------CM DETAILS------------");
	System.out.println(cmname);
	System.out.println(age);
	System.out.println(qualification);
}
}
