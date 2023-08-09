
package Politics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStateCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		State s=new State();
		s.setNo(2);
		s.setName("west- bengal");
		s.setCapital("Kolkata");
		
		CM c=new CM();
		c.setName("Devv");
		c.setAge(38);
		c.setQualification("politics");
		c.setS(s);
		
		s.setCm(c);
		et.begin();
		em.persist(c);
		em.persist(s);
		et.commit();
		
		
		
		
		
		
		
		
		
	}

}
