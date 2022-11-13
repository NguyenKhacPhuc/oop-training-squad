/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Person {

    private int id;
    private String candiateName;
    private String gender;
    private String email;

    public Person(int id, String candiateName, String gender, String email) {
        this.id = id;
        this.candiateName = candiateName;
        this.gender = gender;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandiateName() {
        return candiateName;
    }

    public void setCandiateName(String candiateName) {
        this.candiateName = candiateName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
