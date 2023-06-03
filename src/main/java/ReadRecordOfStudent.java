package students;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReadRecordOfStudent {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yuvraj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Student student = entityManager.find(Student.class, 1);
	System.out.println(student);
	Query query= entityManager.createQuery("Select e from Student e where e.rollNo= ?1");
	query.setParameter(1, 2);
	 List<Student> list= query.getResultList();System.out.println(list);
}
}
