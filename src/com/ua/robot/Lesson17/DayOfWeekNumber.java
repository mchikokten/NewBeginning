package com.ua.robot.Lesson17;

public enum DayOfWeekNumber {
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

    DayOfWeekNumber(int number) {
        this.number = number;
    }

    public void getDayName() {
        for (DayOfWeekNumber day : DayOfWeekNumber.values()) {
            if (day.getNumber() == this.number) {
                System.out.println("Day Name is " + day.name());
            }
        }
    }

}
