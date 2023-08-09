package state;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

import javax.persistence.*;

public class FindAllStateCM {

	public static void main(String[] args) {
	
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
			EntityManager em=emf.createEntityManager();
		
			String hql="FROM State";
			Query q=em.createQuery(hql);
			List<State>list=q.getResultList();
			for(State s: list) {
				System.out.println("-----STATE"+s.getNo()+"DETAILS-----");
				System.out.println(s.toString());
				System.out.println("------------CM DETAILS-------------");
				CM cm= s.getCm();
				System.out.println(cm.toString());
				System.out.println("-----------------------------");
			}
			
			
			
			
			
			
	}

}
