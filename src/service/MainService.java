package service;

import model.Degree;
import model.Professor;
import model.Student;

import model.Course;

public class MainService {

	public static void main(String[] args) {
		System.out.println("-----------------------------------STUDENTI-------------------------------");
		Student st1 = new Student();
		System.out.println(st1); // 0: Testa students // to String tiek izsaukts automatiski
		Student st2 = new Student("Janis","Berzins");
		System.out.println(st2); // 1: Janis Berzins
		
		
		Student st3 = new Student("Anna Paula","Jauka-Nejauka");
		System.out.println(st3);
		
		Student st4 = new Student("23895823", "2347534789");
		System.out.println(st4);
		
		
		System.out.println("-----------------------------------PROFESORI--------------------------------");
		Professor p1 = new Professor();
		System.out.println(p1);
		
		Professor p2 = new Professor("Andritis", "Smukais", Degree.bsc);
		System.out.println(p2);
		
		
		System.out.println("-----------------------------------KURSI---------------------------------------");
		Course c1 = new Course();
		System.out.println(c1);
		
		Course c2 = new Course("JAVA",6,p2);
		System.out.println(c2);
		

	}

}
