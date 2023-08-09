package person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

import javax.persistence.*;

public class FindAllPersons {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	String hql="FROM   Person";
	Query q=em.createQuery(hql);
	
	
	List<Person>persons=q.getResultList();
	for(Person p:persons) {
		System.out.println(p.getId());
		System.out.println(p.getGender());
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println("......................");
	}
	
	}
	
	}
