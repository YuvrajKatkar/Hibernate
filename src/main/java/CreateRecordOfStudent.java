package students;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateRecordOfStudent {
	static EntityManagerFactory entityManagerFactory;
	static EntityManager entityManager ;
	static EntityTransaction entityTransaction;
	static Scanner scanner;
	public static void main(String[] args) {
		entityManagerFactory= Persistence.createEntityManagerFactory("yuvraj");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		
		scanner = new Scanner(System.in);
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
		entityManager.persist(student);
		entityTransaction.commit();
	}
}
