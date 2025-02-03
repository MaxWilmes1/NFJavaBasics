package com.github.MaxWilmes1.ObjectOrientation.Interface;

import java.nio.channels.Pipe;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Spoon spoon = new Spoon();


        recordStudio(spoon);

    }

    public static void recordStudio(CanMakeSound sound){
        System.out.println("Start recording");
        System.out.println(sound.makeSound());
        System.out.println("Stop recoeding");
    }
}
