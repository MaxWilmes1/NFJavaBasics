package JavaBasics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest {

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1",
            "3,1",
            "4,2",
            "5,3",
            "6,5",
            "7,8",
            "8,13",
            "9,21",
            "47,1836311903",
            "93,7540113804746346429"
    })
    void fibonacciTest (long number, long expected){
        long actual = Fibonacci.getFibonacciNumber(number);
        Assertions.assertEquals(expected, actual);
    }


}
