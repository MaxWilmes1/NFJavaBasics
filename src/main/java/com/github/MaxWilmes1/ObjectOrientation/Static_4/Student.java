package com.github.MaxWilmes1.ObjectOrientation.Static_4;

import java.util.Objects;

public class Student {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public Student() {
        totalCount++;
    }

    public Student(int instanceCount) {
        this.instanceCount = instanceCount;
        totalCount++;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Student.totalCount = totalCount;
    }

    public static int incrementTotalCount(){
        return totalCount++;
    }

    public int incrementInstanceCount(){
        return instanceCount++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return instanceCount == student.instanceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(instanceCount);
    }

    @Override
    public String toString() {
        return "Main{" +
                "instanceCount=" + instanceCount +
                "TotalCount=" + totalCount +
                '}';
    }
}
