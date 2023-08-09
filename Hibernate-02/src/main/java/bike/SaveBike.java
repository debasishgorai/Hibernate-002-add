package bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBike {
	
public static void main(String[] args) {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Engine e=new Engine();
	e.setEid(201);
	e.setCc(150);
	
	Bike b1=new Bike();
	b1.setBid(101);
	b1.setBname("Enfield");
	b1.setE(e);
	

	Bike b2=new Bike();
	b2.setBid(102);
	b2.setBname("RX-100");
	b2.setE(e);
	
	et.begin();
	em.persist(e);
	em.persist(b1);
	em.persist(b2);
	et.commit();
	
	
	
	
	
	
	
	
	
}
}
