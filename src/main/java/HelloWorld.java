public class HelloWorld {

    public static void main(String[] args) {

        double a= 18.5;
        double b = 44.5;


        double sum = b % a;
        System.out.println("Modulo = " + sum);

        // addition
        System.out.println("Sum: " + (a + b));
        // substraction
        System.out.println("substraction: " + (a - b));
        // multiplication
        System.out.println("multiplication: " + (a * b));
        // division
        System.out.println("division: " + (b / a));

        // greater than
        System.out.println("Greater than: " + (a > b));
        //lesser than
        System.out.println("Less than: " + (a < b));
        // equality
        System.out.println("Greater than or equal to: " + (a == b));

    }
}
