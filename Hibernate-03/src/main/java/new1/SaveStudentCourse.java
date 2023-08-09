package new1;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setSid(201);
		s1.setName("debasish");
		
		
		Student s2=new Student();
		s2.setSid(202);
		s2.setName("asish");
		
		Student s3=new Student();
		s3.setSid(203);
		s3.setName("chinmoy");
		
		Student s4=new Student();
		s4.setSid(204);
		s4.setName("tapan");
		
		Course c1=new Course();
		c1.setCid(100);
		c1.setSub("java");
		

		Course c2=new Course();
		c2.setCid(101);
		c2.setSub("mern-stack");

		Course c3=new Course();
		c3.setCid(102);
		c3.setSub("python");

		Course c4=new Course();
		c4.setCid(103);
		c4.setSub("sql");
		
		List<Course>course1=new ArrayList<Course>();
		course1.add(c1);
		//course1.add(c2);
		course1.add(c3);
		course1.add(c4);
		
		
		List<Course>course2=new ArrayList<Course>();
		course1.add(c2);
		course1.add(c3);
		
		List<Student>students1=new ArrayList<Student>();
		students1.add(s1);
		
		List<Student>students2=new ArrayList<Student>();
		students2.add(s2);
		
		List<Student>students3=new ArrayList<Student>();
		students3.add(s1);
		students3.add(s2);
		

		List<Student>students4=new ArrayList<Student>();
		students4.add(s1);
		c4.setStudents(students4);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s1);
		//em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		et.commit();
		
		
		
	}

}
