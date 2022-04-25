package models;

import helpers.Enums.UserType;

public class User extends Identifiable {
    private String name;
    private String email;
    private int age;
    private String password;
    private UserType userType;

    public User(String name, String email, int age, String password, UserType userType, String id) {
        super(id);
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.userType = userType;
    }

    public User() {
        super("dkomlk");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return this.userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public boolean isPasswordCorrect(String password) {
        return this.password == password;
    }

}
