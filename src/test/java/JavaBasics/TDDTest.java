package JavaBasics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDDTest {

    @Test
    void expect1__whenGivenNumber1(){
        // Given
        int number = 1;
        // When
        String actual = TDD.FizzBuzz(number);
        // Then
        String expected = "1";
        Assertions.assertEquals(expected,actual);
    }

}
