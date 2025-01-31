package com.github.MaxWilmes1.JavaBasics;

import com.github.MaxWilmes1.JavaBasics.PasswordValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    void given8Char_expectTrue (){
        // Given
        String password = "ABCDEFGH";
        // When
        boolean expected = true;
        boolean actual = PasswordValidation.validatePasswordLength(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void given9Char_expectFalse (){
        // Given
        String password = "ABCDEFGHI";
        // When
        boolean expected = true;
        boolean actual = PasswordValidation.validatePasswordLength(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void given0Char_expectFalse (){
        // Given
        String password = "";
        // When
        boolean expected = false;
        boolean actual = PasswordValidation.validatePasswordLength(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenNoDigits_expectFalse (){
        // Given
        String password = "ABCDEFGHIJ";
        // When
        boolean expected = false;
        boolean actual = PasswordValidation.validatePasswordDigits(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void given2Digits_expectTrue (){
        // Given
        String password = "ABCDE1FGHI2J3";
        // When
        boolean expected = true;
        boolean actual = PasswordValidation.validatePasswordDigits(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenOnlyLowercase_expectfalse (){
        // Given
        String password = "abcdefgh";
        // When
        boolean expected = false;
        boolean actual = PasswordValidation.validatePasswordCase(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenOnlyUppercase_expectFalse (){
        // Given
        String password = "ABCDEF";
        // When
        boolean expected = false;
        boolean actual = PasswordValidation.validatePasswordCase(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenUpperAndLowercase_expectTrue (){
        // Given
        String password = "ABCDEFcf";
        // When
        boolean expected = true;
        boolean actual = PasswordValidation.validatePasswordCase(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenCommonlyUsedPassword_expectFalse (){
        // Given
        String password = "ABCDEFHG123";
        // When
        boolean expected = false;
        boolean actual = PasswordValidation.validatePasswordCommenlyUsed(password);
        // Then
        Assertions.assertEquals(expected,actual);
    }


}
