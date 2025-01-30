package JavaBasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args) {
            System.out.println("Willkommen zu deinem Fibonacci Programm! Die Ausgabe bis zu 93. Zahl der Folge ist möglich.");
            int userInput = getValidUserInput();

            System.out.println("Wert der Fibonacci Folge mit der Stelle " + userInput + " ist: " + getFibonacciNumber(userInput));

        }

    public static int getValidUserInput (){
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;
        while (true) {
            System.out.print("Gib eine Zahl zwischen 0 und 93 ein: ");
            try {
                userInput = scanner.nextInt();

                // Überprüfen, ob die Zahl im gültigen Bereich liegt
                if (userInput < 0 || userInput > 93) {
                    System.out.println("Fehler: Bitte gib eine Zahl zwischen 0 und 93 ein.");
                    continue; // Wiederhole die Eingabe
                }
                break; // Korrekte Eingabe → Schleife verlassen

            } catch (InputMismatchException e) {
                System.out.println("Fehler: Bitte gib eine gültige Zahl ein.");
                scanner.nextLine(); // Verhindert Endlosschleife bei falschen Eingaben (z. B. Buchstaben)
            }
        }
        scanner.close();
        return userInput;
    }

    public static long getFibonacciNumber(long number) {
        if ( number == 1){
            return 0;
        }
        if (number==2){
            return 1;
        }
        long a = 0;
        long b = 1;

        for (int i=2; i < number; i++){
            long temp = a+b;
            a=b;
            b=temp;
        }
        return b;
    }
}

