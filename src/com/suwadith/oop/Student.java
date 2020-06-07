package com.suwadith.oop;

public class Student extends User {

    private String currentClass;

    public Student(String username) {
        super(username);
    }

    public Student(String username, String currentClass) {
        super(username);
        this.currentClass = currentClass;
    }

    public String getCurrentClass() {
        return currentClass;
    }
}
