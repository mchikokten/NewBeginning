package com.ua.robot.Lesson22;

public class Student {

    public Student(String lastname, String averageScore) {
        this.lastname = lastname;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastname='" + lastname + '\'' +
                ", averageScore='" + averageScore + '\'' +
                '}';
    }

    private String lastname;
    private String averageScore;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore;
    }
}
