package com.github.MaxWilmes1.Ecosystem.Lombok;

import lombok.Builder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder
public record University(
        String id,
        String name,
        List<Course> courses
) {

    public double calculateAverageCourseGrade(Course course){
        double sum = 0;
        double courseSize = course.getStudents().size();
        System.out.println("Course size: "+ courseSize);
        for (Student student : course.getStudents()) {
            sum += student.getGrade();
            System.out.println("Student: "+student+" , Grade: "+student.getGrade());
        }
        return sum/courseSize;
    }

    public double calculateAverageGrade(University university){
        double sum = 0;
        double size = 0;
        for (Course course : university.courses) {
            for (Student student : course.getStudents()) {
                System.out.println("Student: "+student+" , Grade: "+student.getGrade());
                sum += student.getGrade();
            }
            size += course.getStudents().size();
        }
        return sum/size;
    }

    public Set<Student> getBestStudents(University university){
        Set<Student> bestStudents = new HashSet<>();
        for (Course course : university.courses) {
            for (Student student : course.getStudents()) {
                if (student.getGrade() <= 2.0) {
                    bestStudents.add(student);
                }
            }
        }
        return bestStudents;
    }
}
