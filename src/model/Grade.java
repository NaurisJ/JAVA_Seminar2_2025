package model;

public class Grade {
	
	private long gID;
	private int value;
	private Student student;
	private Course course;
	
	private static long counter = 0;

	public long getgID() {
		return gID;
	}

	public int getValue() {
		return value;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}
	
	
	public void setValue(int inputValue) {
		if (inputValue > 0 && inputValue <= 10) {
			value = inputValue;
		} else {
			value = 1;
		}
	}
	public void setStudent(Student inputStudent) {
		if (inputStudent != null) {
			student = inputStudent;
		} else {
			student = new Student();
		}
	}
	
	public void setCourse(Course inputCourse) {
		if (inputCourse != null) {
			course = inputCourse;
		} else {
			course = new Course();
		}
	}
	
	public void setgID() {
		gID = counter++;
	}
	
	public Grade() {
		setgID();
		setValue(4);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	public Grade(Course course, Student student, int value) {
		setgID();
		setValue(value);
		setStudent(student);
		setCourse(course);
	}
	
	@Override
	public String toString() {
		return gID + ": " + course.getTitle() + "| " + student.getName().charAt(0) + ". " + student.getSurname() + " | Grade: | " + value; 
	}
	

}
