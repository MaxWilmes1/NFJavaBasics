package com.github.MaxWilmes1.ObjectOrientation.Interface;

public class Guitar implements CanMakeSound {

    @Override
    public String makeSound() {
        return "Guitar music";
    }
}
