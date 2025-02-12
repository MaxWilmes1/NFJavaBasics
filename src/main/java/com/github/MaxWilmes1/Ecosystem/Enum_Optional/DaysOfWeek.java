package com.github.MaxWilmes1.Ecosystem.Enum_Optional;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String weekday(){
        if (this == SATURDAY || this == SUNDAY) {
            return "Weekend";
        } else {
            return this.name();
        }
    }
}
