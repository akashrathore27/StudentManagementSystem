package StudentDaoModel;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.assignment3.Student;
import com.mysql.cj.xdevapi.SessionFactory;

public class StudentDao {

		Scanner sc = new Scanner(System.in);

		public void addRecords(Student student) {

			Configuration cfg = new Configuration();
			cfg.configure("com/assignment3/assignment3.cfg.xml");

			org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
			org.hibernate.Session session = factory.openSession();

			org.hibernate.Transaction tx = session.beginTransaction();

			System.out.println("Enter Roll Number of Student");
			student.setRollNo(sc.nextInt());
			System.out.println("Enter Name of Student");
			sc.nextLine();
			student.setName(sc.nextLine());
			System.out.println("Enter Age of Student");
			student.setAge(sc.nextInt());
			System.out.println("Enter Class Section  of Student");
			student.setClassSection(sc.nextLine());
			sc.nextLine();
			System.out.println("Enter Address of Student");
			student.setAddress(sc.nextLine());

			session.save(student);
			tx.commit();
			System.out.println("Inserted Record Succesfully");

			session.close();
			factory.close();

			
		}

		public Student read() 
		{
			Configuration cfg = new Configuration();
			cfg.configure("com/assignment3/assignment3.cfg.xml");

			org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
			org.hibernate.Session session = factory.openSession();

			org.hibernate.Transaction tx = session.beginTransaction();
			
			System.out.println("Enter Roll Number for get details");
			Student student1=session.get(Student.class, sc.nextInt());
			session.close();
			factory.close();
			
			return student1;
			

			

                  
 			
		}
	}

	

