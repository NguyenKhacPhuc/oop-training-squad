package ex_0811;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private String gender;
    private String dateBirth;
    private String email;

    public Person(int id, String name, String gender, String dateBirth, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        if (id > 0) {
            this.id = id;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name != null) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public String getGender() {
        return gender;
    }

    public boolean setGender(String gender) {
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
            this.gender = gender;
            return true;
        } else {
            return false;
        }
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public boolean setDateBirth(String dateBirth) {
        if (dateBirth != null) {
            this.dateBirth = dateBirth;
            return true;
        } else {
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            return false;
        }
    }
}
