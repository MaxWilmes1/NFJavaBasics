package JavaBasics;

public class Fibonacci {

    public static void main (String[] args) {
        System.out.println("Hello World");
    }

    public static int getFibonacciNumber(int number) {

        if ( number == 3){
            return 1;
        }
        return number-1;

    }
}
