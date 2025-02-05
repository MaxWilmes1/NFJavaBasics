package com.github.MaxWilmes1.ObjectOrientation.Static_4;

public class Main {
    static int totalCount = 0;
    private int instanceCount = 0;

    public static void main(String[] args) {
        Main o1 = new Main();
        Main o2 = new Main();
        Main o3 = new Main();

        o1.incrementInstanceCount();
        incrementTotalCount();
        System.out.println(o1);
        System.out.println(totalCount);

    }

    public static int incrementTotalCount(){
        return totalCount++;
    }

    public int incrementInstanceCount(){
        return instanceCount++;
    }

    @Override
    public String toString() {
        return "Main{" +
                "instanceCount=" + instanceCount +
                '}';
    }
}
