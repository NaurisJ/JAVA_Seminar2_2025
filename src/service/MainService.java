package service;

import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;

public class MainService {
	
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();

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
		
		allStudents.addAll(Arrays.asList(st1, st2, st3, st4));
		System.out.println(allStudents);
		
		
		System.out.println("-----------------------------------PROFESORI--------------------------------");
		Professor p1 = new Professor();
		System.out.println(p1);
		
		Professor p2 = new Professor("Andritis", "Smukais", Degree.bsc);
		System.out.println(p2);
		
		allProfessors.addAll(Arrays.asList(p1, p2));
		
		
		try {
			createProfessor("Karlis","Immers", Degree.mg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(allProfessors);
		
		
		System.out.println("-----------------------------------KURSI---------------------------------------");
		Course c1 = new Course();
		System.out.println(c1);
		
		Course c2 = new Course("JAVA",6,p2);
		System.out.println(c2);
		
		allCourses.addAll(Arrays.asList(c1,c2));
		System.out.println(allCourses);
		
		
		System.out.println("-----------------------------------ATZIMES----------------------------------------");
		Grade g1 = new Grade();
		System.out.println(g1);
		
		Grade g2 = new Grade(c2,st3,7);
		System.out.println(g2);
		
		allGrades.addAll(Arrays.asList(g1,g2));
		System.out.println(allGrades);
		

	}
	
	//CRUD
	
	// C - create
	
	public static void createProfessor(String name, String surname, Degree degree) throws Exception {
		// parbaudam vai tads professors jau eksiste
		for (Professor tempP : allProfessors) {
			if (tempP.getName().equals(name)
					&& tempP.getSurname().equals(surname)
					&& tempP.getDegree().equals(degree)) {
				throw new Exception("Tads professors jau eksiste sistema");
			}
		}
		allProfessors.add(new Professor(name, surname, degree));
	}
	
	// R - retrieve
	
	public static Professor retrieveProfessorByID(int id) throws Exception{
		if (id < 0) {
			throw new Exception("ID nevar but negativs");
		}
		
		for (Professor tempP : allProfessors) {
			if (tempP.getpID() == id) {
				return tempP;
			}
		}
		
		throw new Exception("Professors ar noradito ID: " + id + " - neeksiste");
		
	}

}
