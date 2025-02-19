package model;

public class Student {
	
	// 1. mainigie
	private long stID;
	private String name;
	private String surname;
	
	
	// 2. getters
	
	public long getstID() {
		return stID;
	}
	public String getName() {
		return name;
	}
	public String setSurname() {
		return surname;
	}
	// 3. setters
	public void setName(String inputName) {
		if (inputName != null
				&& inputName.matches("[A-Z]{1}[a-z ]{1,10}[A-Z]{1}[a-z]{1,10}")) {
			name = inputName;
		}
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	// 4. bez argumenta konstruktors
	// 5. argumenta konstruktors
	// 6. toString funkcija
	// 7. citas funkciajs (ja nepieciešams)
	
	
}
