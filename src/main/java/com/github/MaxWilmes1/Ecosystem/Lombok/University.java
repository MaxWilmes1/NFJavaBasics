package com.github.MaxWilmes1.Ecosystem.Lombok;

import com.github.MaxWilmes1.Ecosystem.Stream.Challange.Stream;
import lombok.Builder;

import java.util.*;
import java.util.stream.Collectors;

@Builder
public record University(
        String id,
        String name,
        List<Course> courses
) {

    public double calculateAverageCourseGrade(Course course){
        List<Student> students = course.getStudents();
        double sum = students.stream()
                .peek(student -> System.out.println("Student: " + student + ", Grade: " + student.getGrade()))
                .mapToDouble(Student::getGrade)
                .sum();

        return sum/students.size();
    }

    public double calculateAverageGrade(University university){

        double sum = university.courses.stream()
                .flatMap(course -> course.getStudents().stream())
                .mapToDouble(Student::getGrade)
                .sum();
        double size = university.courses.stream()
                .mapToDouble(course -> course.getStudents().size())
                .sum();

        return sum/size;
    }

    public Set<Student> getBestStudents(University university){

        Set<Student> bestStudents = new HashSet<>();

        university.courses.stream()
        .flatMap(course -> course.getStudents().stream())
        .filter(student -> student.getGrade() <= 2.0)
        .forEach(bestStudents::add);
        return bestStudents;
    }
}
