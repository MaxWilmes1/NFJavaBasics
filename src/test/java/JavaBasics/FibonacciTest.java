package JavaBasics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void given1_then0 (){
        int number = 1;
        int expected = 0;
        int actual = Fibonacci.getFibonacciNumber(number);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void given2_then1 (){
        int number = 2;
        int expected = 1;
        int actual = Fibonacci.getFibonacciNumber(number);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void given3_then1 (){
        int number = 3;
        int expected = 1;
        int actual = Fibonacci.getFibonacciNumber(number);
        Assertions.assertEquals(expected, actual);
    }
}
