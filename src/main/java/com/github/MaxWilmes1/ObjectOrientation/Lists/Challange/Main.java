package com.github.MaxWilmes1.ObjectOrientation.Lists.Challange;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Phil", "Maier", 1234567);
        Student s2 = new Student("Phillip", "Mayer", 12345678);
        Student s3 = new Student("Philipp", "Meyer", 123456789);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println(studentList);

        System.out.println("--------Fill school with pupils--------");

        School school = new School();
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        System.out.println(school);


        System.out.println("-------find pupil by id---------");
        System.out.println(school.findStudent(1234567));

        System.out.println("-------remove pupil from school---------");
        school.removeStudent(s2);
        System.out.println(school);


        System.out.println("-------Bonus: Course---------");
        Course math = new Course("math", "Schröder", 21);
        Course physics = new Course("physics", "Einstein", 42);
        Course chemistry = new Course("chemistry", "Bohr", 84);

        s1.addStudentToCourse(math);
        s1.addStudentToCourse(physics);
        s1.addStudentToCourse(chemistry);

        System.out.println(s1);

        System.out.println("-----------------------------");
        school.retrieveCourses(1234567);
    }

}
