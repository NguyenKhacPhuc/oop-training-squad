public class Interviewer extends Person {
    private int experience;

    public Interviewer(int experience) {
        this.experience = experience;
    }

    public Interviewer(int id, String candidateName, String gender, String birthDate, String email, int experience) {
        super(id, candidateName, gender, birthDate, email);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
