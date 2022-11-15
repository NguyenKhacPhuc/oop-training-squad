package PracticalTime_1311;

public class Candidate extends Person {
	private double gpa;

	public Candidate(int id, String candidateName, String gender, String birthDate, String email, double gpa) {
		super(id,candidateName, gender, birthDate, email);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}
