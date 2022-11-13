package ex_0811;

public class Interviewer extends Person {
    private int experience;

    public Interviewer(int id, String name, String gender, String dateBirth, String email, int experience) {
        super(id, name, gender, dateBirth, email);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public boolean setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
            return true;
        } else {
            return false;
        }
    }
}

