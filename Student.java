package problemThree;

public class Student {

	private String name;
	private float grade;
	private float gpa;
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private float getGrade() {
		return grade;
	}
	private void setGrade(float grade) {
		this.grade = grade;
	}
	private float getGpa() {
		return gpa;
	}
	private void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	private void getInfo() {
		System.out.println("My name is " + getName() + "I'm in grade " 
							+ getGrade() + " and I have a " + getGpa()
							+ " GPA. For now, at least...");
	}
}
