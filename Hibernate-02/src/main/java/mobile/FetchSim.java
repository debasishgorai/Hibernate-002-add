package mobile;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("FROM Sim");
		List<Sim>sims=q.getResultList();
		for(Sim s:sims) {
			System.out.println(s.getSid());
			System.out.println(s.getProvider());
			System.out.println(s.getType());
			System.out.println("-----------------------");
		}
	}

}
