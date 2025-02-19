package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1); // 0: Testa students // to String tiek izsaukts automatiski
		Student st2 = new Student("Janis","Berzins");
		System.out.println(st2); // 1: Janis Berzins
		
		
		Student st3 = new Student("Anna Paula","Jauka-Nejauka");
		System.out.println(st3);
		
		Student st4 = new Student("23895823", "2347534789");
		System.out.println(st4);

	}

}
