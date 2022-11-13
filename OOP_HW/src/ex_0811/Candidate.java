package ex_0811;

public class Candidate extends Person {
    private double gpa;

    public Candidate(int id, String candidateName, String gender, String dateBirth, String email, double gpa) {
        super(id, candidateName, gender, dateBirth, email);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10.0) {
            this.gpa = gpa;
            return true;
        } else {
            return false;
        }
    }
}
