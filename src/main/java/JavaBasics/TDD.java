package JavaBasics;

public class TDD {
    public static String FizzBuzz(int number) {

        if (number % 3 == 0){
            return "Fizz";
        }

        return String.valueOf(number);
    }
}
