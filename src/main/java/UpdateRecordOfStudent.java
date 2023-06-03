package students;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecordOfStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yuvraj");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id:");
		int id= scanner.nextInt();
		System.out.println("Enter name:");
		String name=scanner.next();
		System.out.println("Enter branch:");
		String branch= scanner.next();
		System.out.println("Enter year:");
		byte year = scanner.nextByte();
		Student student = new Student(id,name,branch,year);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
