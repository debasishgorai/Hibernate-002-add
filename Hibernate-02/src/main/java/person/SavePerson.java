package person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person();
		p.setId(1);
		p.setName("Debasish");
		p.setGender("male");
		p.setAge(23);
		
		Person p2=new Person();
		p2.setId(10);
		p2.setName("asish");
		p2.setGender("male");
		p2.setAge(18);
		
		
		
		
		et.begin();
		et.commit();
		em.persist(p);
		em.persist(p2);
		
	}
}