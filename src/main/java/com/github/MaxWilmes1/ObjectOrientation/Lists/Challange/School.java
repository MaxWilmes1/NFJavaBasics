package com.github.MaxWilmes1.ObjectOrientation.Lists.Challange;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final List<Student> studentList;

    public School() {
        this.studentList = new ArrayList<>();
    }

    public School(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentList=" + studentList +
                '}';
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public String findStudent(int studentId){
        for (Student student : studentList) {
            if ( student.getStudentId() == studentId ){
                return student.getFirstName();
            }
        }
        return "Student was not found";
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public void retrieveCourses (int id){
        System.out.println("--------Retrieve Courses from studentId--------");
        for (Student student : studentList) {
            System.out.println("Checking if Student id " + student.getStudentId() +  " is matching: " + id);
            if ( student.getStudentId() == id){
                System.out.println("Student with matching id found!");
                System.out.println("Here are the courses in which the student is participating: ");
                System.out.println(student.getCourseList());
                break;
            }
            System.out.println("----------next Student-----------");
        }
    }

}
