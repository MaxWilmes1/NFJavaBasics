package com.github.MaxWilmes1.Ecosystem.Lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CourseName {
    MATH("Mathe"),
    IT("Informatik"),
    PHYSICS("Physik"),
    CHEMISTRY("Chemie"),
    ENGLISH("Englisch");

    private final String german;

/*    CourseName(String german) {
        this.german = german;
    }*/
}
