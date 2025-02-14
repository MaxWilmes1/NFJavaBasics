package com.github.MaxWilmes1.Ecosystem.Lombok;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("1234", "Max", "Düsseldorf", 1.0);
        Student s2 = new Student("1234", "Linda", "Düsseldorf", 3.1);
        Student s3 = new Student("1234", "Silvia", "Düsseldorf", 1.7);
        Student s4 = new Student("1234", "Jörg", "Düsseldorf", 4.6);
        Teacher t1 = new Teacher("1", "Lehrer", "Wuppertal");
        Course mathe = Course.builder()
                .name(CourseName.MATH)
                .id("11")
                .students(List.of(s1,s3,s4))
                .teacher(t1)
                .build();

        Course physics = Course.builder()
                .name(CourseName.PHYSICS)
                .id("11")
                .students(List.of(s1,s2))
                .teacher(t1)
                .build();

        System.out.println(mathe.getName().getGerman());

        University BergischeUniWuppertal = University.builder()
                .id("007")
                .name("Bergische Universität Wuppertal")
                .courses(List.of(mathe,physics))
                .build();

        System.out.println(BergischeUniWuppertal.calculateAverageCourseGrade(mathe));
        System.out.println(BergischeUniWuppertal.calculateAverageCourseGrade(physics));
        System.out.println(BergischeUniWuppertal);

        System.out.println(BergischeUniWuppertal.calculateAverageGrade(BergischeUniWuppertal));
        System.out.println(BergischeUniWuppertal.getBestStudents(BergischeUniWuppertal));
    }
}
