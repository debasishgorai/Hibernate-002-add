package state;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStateCM {

		
		
		
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			
			State s=em.find(State.class, 1);
			CM cm=s.getCm();
			//cm.setS(null);
			//s.setName("west bengal");
			//s.setCapital("kolkata");
			et.begin();
			em.remove(cm);
			//em.persist(c);
			//em.persist(s);
			et.commit();
	}
	}
