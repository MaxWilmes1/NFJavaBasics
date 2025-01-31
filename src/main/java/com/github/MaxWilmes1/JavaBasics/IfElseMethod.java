package com.github.MaxWilmes1.JavaBasics;

class IfElseMethod {

    public static void main(String[] args) {
        int age = 17;

        if (age > 18) {
            System.out.println("Du bist volljährig");
        } else if (age == 18) {
            System.out.println(" Hey du bist genau 18!");
        } else {
            System.out.println("Du bist nicht volljährig");
        }
    }
}