package new1;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBusSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Bus b=new Bus();
		b.setBid(101);
		b.setNumber("KA 03 3667");
		b.setType("AC");
		
		
		Seat s1= new Seat();
		s1.setSno(201);
		s1.setColor("blue");
		s1.setB(b);
		

		Seat s2= new Seat();
		s2.setSno(202);
		s2.setColor("green");
		s2.setB(b);
		

		Seat s3= new Seat();
		s3.setSno(203);
		s3.setColor("black");
		s3.setB(b);
		

		Seat s4= new Seat();
		s1.setSno(204);
		s1.setColor("white");
		s1.setB(b);
		
		List<Seat>seats=new ArrayList<Seat>();
		seats.add(s1);
		seats.add(s2);
		seats.add(s3);
		seats.add(s4);
		//seats.add(s4)
		
		b.setSeats(seats);
		
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		et.commit();
		
		
		
		
		
	}

}
