package JavaBasics;

public class Method {
    public static void main(String[] args){
        int result;
        result = add(12, 13);
        System.out.println("Integer addition: " + result);

        System.out.println("---------------");

        double sumDresultouble = add(12.3, 13.3);
        System.out.println("Double addition: " + result);

        System.out.println("---------------");

        result = subtract(20, 15);
        System.out.println("Integer Subtraction: " + result);

        System.out.println("---------------");

        result = makePositive(-12);
        System.out.println(result);

        System.out.println("---------------");

        System.out.println("Add or subtract?");
        result = addOrSubtract(9, 10);
        System.out.println(result);

        System.out.println("---------------");

        System.out.println("Is Even?");
        result = doubleOddNumberReturnEven(11);
        System.out.println(result);

    }
    static int add (int num1, int num2){
        System.out.println("Addiere " + num1 + " mit " + num2);
        return num1 + num2;
    }

    static double add (double num1, double num2){
        System.out.println("Addiere " + num1 + " mit " + num2);
        return num1 + num2;
    }

    static int subtract(int num1, int num2){
        System.out.println("Subtrahiere " + num1 + " von " + num2);
        return num1 - num2;
    }

    static int makePositive(int num){
        System.out.println("Make " + num + " positive");
        if (num >= 0){
            System.out.println("Zahl ist positiv");
            return num;
        }
        else {
            System.out.println("Zahl ist negativ");
            return -num;
        }
    }

    /**subtract wenn Wert 1 größer. add wenn Wert 1 kleiner **/
    static int addOrSubtract(int num1,int num2){
        if (num1 > num2) {
            System.out.println("Subtrahiere");
            int num = subtract(num1, num2);
            return num;
        }
        else {
            System.out.println("Addiere");
            int num = add(num1, num2);
            return num;
        }
    }
    /**return value when num even. Double value when value odd **/
    static int doubleOddNumberReturnEven(int num){
        if (num % 2 == 0) {
            System.out.println("True. Return your number");
            return num;
        }
        else {
            System.out.println("False. Double your number");
            return num*2;
        }
    }
}

