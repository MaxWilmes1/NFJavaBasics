package com.github.MaxWilmes1.ObjectOrientation.Static_4;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student();
        System.out.println();
        System.out.println("Totalcount: " + Student.getTotalCount());
        Student s2 = new Student();
        System.out.println("Instance count: " + s2.getInstanceCount());
        System.out.println("Total count :" + Student.getTotalCount());

        System.out.println(s1);

        System.out.println(Calculator.add(2, 3));
        System.out.println(Calculator.subtract(2, 3));
        System.out.println(Calculator.multiply(2, 3));
        System.out.println(Calculator.divide(2, 3));
        System.out.println(Calculator.surfaceOfCircle(42));

        System.out.println(Calculator.getPi());

    }

}
