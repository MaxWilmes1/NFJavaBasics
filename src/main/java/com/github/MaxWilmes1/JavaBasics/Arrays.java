package com.github.MaxWilmes1.JavaBasics;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Arrays {

    public static void main (String[] args) throws IOException {
         int[] numbers = new int[5];
         numbers[0] = 1;
         int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers[0]);

        // for-Schleife mit i
        for(int i=0; i<numbers2.length; i++ ){
            System.out.println(numbers2[i]);
        }
        String asciiArt = FigletFont.convertOneLine("Hello das ist ASCII Art");
        System.out.println(asciiArt);

        // foreach-Schleife
        for(int number : numbers2){
            System.out.println(number);
        }
    }
}
