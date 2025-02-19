package model;

public class Professor {

	private long pID;
	private String name;
	private String surname;
	private Degree degree;
	
	private static long counter = 0;
	
	
	
	//getter
	
	
	public long getpID() {
		return pID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Degree getDegree() {
		return degree;
	}

	
	// setter

	public void setName(String inputName) {
		if (inputName != null
				&& inputName.matches("[A-Z]{1}[a-z]{3,10}([ ][A-Z]{1}[a-z]{3,10})?")) {
			name = inputName;
		} else {
			name = "unknown";
		}
	}
	public void setSurname(String inputSurname) {
		if (inputSurname != null
				&& inputSurname.matches("[A-Z]{1}[a-z]{3,10}([ ][A-Z]{1}[a-z]{3,10})?")) {
		surname = inputSurname;
		} else {
			surname = "unknown";
		}
	}
	
	
	public void setDegree(Degree inputDegree) {
		if (inputDegree != null) {
			
		
			degree = inputDegree;
		} else {
			degree = Degree.other;
		}
	}
	
	public void setpID() {
		pID = counter++;
	}
	

	public Professor() {
		setpID();
		setName("Acainais");
		setSurname("Professors");
		setDegree(Degree.bsc);
	}
	
	public Professor(String inputName, String inputSurname, Degree degree) {
		setpID();
		setName(inputName);
		setSurname(inputSurname);
		setDegree(degree);
	}
	
	
	@Override
	public String toString() {
		return pID + ": " + name + " " + surname + " Degree: " + degree;
	}
}
