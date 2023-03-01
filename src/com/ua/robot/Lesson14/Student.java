package com.ua.robot.Lesson14;

public class Student extends Person {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        this.Group = group;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    private String firstName;
    private String lastName;
    private String Group;
    private int Score;

    public Student(String firstName, String lastName, String group, int Score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Group = group;
        this.Score = Score;
    }

    @Override
    public void printPersonInformation() {
        System.out.print("Student" + "\nFirst name: " + firstName + " \nLast name: " + lastName + " \nGroup: " + Group + " \nScore: " + Score);
    }


}
