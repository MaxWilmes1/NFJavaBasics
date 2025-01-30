package JavaBasics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void given0_then0 (){
        int number = 1;
        int expected = 0;
        int actual = Fibonacci.getFibonacciNumber(number);
        Assertions.assertEquals(expected, actual);
    }
}
