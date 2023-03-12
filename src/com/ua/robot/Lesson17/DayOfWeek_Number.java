package com.ua.robot.Lesson17;

public enum DayOfWeek_Number {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    DayOfWeek_Number(int number) {
        this.number = number;
    }

    public void getDayName() {
        for (DayOfWeek_Number day : DayOfWeek_Number.values()) {
            if (day.getNumber() == this.number) {
                System.out.println("Day Name is " + day.name());
            }
        }
    }

}
