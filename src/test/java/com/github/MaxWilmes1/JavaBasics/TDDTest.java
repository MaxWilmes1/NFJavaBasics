package com.github.MaxWilmes1.JavaBasics;

import com.github.MaxWilmes1.JavaBasics.TDD;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TDDTest {

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,Fizz",
            "4,4",
            "5,Buzz",
            "6,Fizz",
            "15,FizzBuzz"

    })
    void testFizzBuzz(int number, String expected ){
        String actual = TDD.FizzBuzz(number);
        Assertions.assertEquals(expected,actual);
    }
/*
    @Test
    void expect2_whenGivenNumber2(){
        // Given
        int number = 2;
        // When
        String actual = TDD.FizzBuzz(number);
        // Then
        String expected = "2";
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void expectFizz_whenGivenNumber3(){
        // Given
        int number = 3;
        // When
        String actual = TDD.FizzBuzz(number);
        // Then
        String expected = "Fizz";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void expectFizz_whenGivenNumber6(){
        // Given
        int number = 6;
        // When
        String actual = TDD.FizzBuzz(number);
        // Then
        String expected = "Fizz";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void expectBuzz_whenGivenNumber5(){
        // Given
        int number = 5;
        // When
        String actual = TDD.FizzBuzz(number);
        // Then
        String expected = "Buzz";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void expectFizzBuzz_whenGivenNumber15(){
        // Given
        int number = 15;
        // When
        String actual = TDD.FizzBuzz(number);
        // Then
        String expected = "FizzBuzz";
        Assertions.assertEquals(expected,actual);
    }*/

}
