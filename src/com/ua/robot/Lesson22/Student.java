package com.ua.robot.Lesson22;

public class Student {

    public Student(String lastname, int averageScore) {
        this.lastname = lastname;
        this.averageScore = averageScore;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastname='" + lastname + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }

    private String lastname;
    private int averageScore;

}
