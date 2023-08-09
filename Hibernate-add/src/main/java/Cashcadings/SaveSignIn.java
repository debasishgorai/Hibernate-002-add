package Cashcadings;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		MyKey mk=new MyKey();
		mk.setEmail("debasishgorai.121@gmail.com");
mk.setPhone(719514868);
		
		SignIn si=new SignIn();
	si.setMk(mk);
	si.setAge(23);
	si.setName("debasiah");
	si.setPassword("2346");
		
		
		
		et.begin();
		em.persist(si);
		et.commit();
		
	}

}
