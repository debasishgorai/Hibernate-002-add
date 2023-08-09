package bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBike2 {
	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Bike b1=new Bike();
		b1.setBid(11);
		b1.setBname("R15");
		
		Bike b2=new Bike();
		b2.setBid(12);
		b2.setBname("Honda");
		
		
	
		Engine e=new Engine();
		e.setEid(101);
		e.setCc(0);
		e.setB(b1);
		e.setB(b2);
		
	//	b1.setE(e);
		//b1.setE(e);
		
		
		et.begin();
		em.persist(e);
		em.persist(b1);
		em.persist(b2);
		et.commit();
		
		
		
		
		
		
		
		
}}
