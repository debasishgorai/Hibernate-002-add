package videoplatform;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveVideoPlatform {
	
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	Platform p1=new Platform();
	p1.setPid(200);
	p1.setName("youtube");
	

	Platform p2=new Platform();
	p2.setPid(201);
	p2.setName("ULLU");
	
	Video v1= new Video();
	v1.setVid(50);
	v1.setTitle("learning java");
	v1.setDuration(10);
	v1.setP(p1);
	

	Video v2= new Video();
	v2.setVid(51);
	v2.setTitle("watching film");
	v2.setDuration(150);
	v2.setP(p1);
	
	

	Video v3= new Video();
	v3.setVid(52);
	v3.setTitle("chat gpt");
	v3.setDuration(25);
	v3.setP(p1);
	
	

	Video v4= new Video();
	v4.setVid(53);
	v4.setTitle("gaon ki garmi");
	v4.setDuration(150);
	v4.setP(p2);
	
	

	Video v5= new Video();
	v5.setVid(54);
	v5.setTitle("gandii baat");
	v5.setDuration(40);
	v5.setP(p2);
	
	et.begin();
	em.persist(v1);
	em.persist(v2);	
	em.persist(v3);	
	em.persist(v4);	
	em.persist(v5);
	em.persist(p1);
	em.persist(p2);
	et.commit();
	
	
	
	
	
	
}
}
