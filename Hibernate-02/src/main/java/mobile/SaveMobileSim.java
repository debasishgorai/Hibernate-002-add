package mobile;

import java.util.List;
//import java.util.*;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {

	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Sim s=new Sim();
		s.setSid(105);
		s.setProvider("jio");
		s.setType("5G");
		
		Sim s1=new Sim();
		s1.setSid(106);
		s1.setProvider("AIRTEL");
		s1.setType("4G");
		
		List<Sim>sims=new ArrayList<Sim>();
		sims.add(s1);
		sims.add(s);
		
		Mobile m=new Mobile();
		m.setMid(205);
		m.setBrand("1+");
		m.setPrice(20000);
		m.setSims(sims);
		
		Mobile m1=new Mobile();
		m1.setMid(206);
		m1.setBrand("Realme 14");
		m1.setPrice(2505000);
		m1.setSims(sims);
		
		et.begin();
		em.persist(s);
		em.persist(s1);
		em.persist(m);
		em.persist(m1);
		et.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
