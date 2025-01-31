package com.github.MaxWilmes1.JavaBasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println("Willkommen zu deinem Passwort Validator.");
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            System.out.print("Gib jetzt dein Passwort ein: ");
            try {
                userInput = scanner.nextLine();
                if (!validatePasswordLength(userInput)){
                    System.out.println("Fehler: Dein Passwort muss mind. 8 Zeichen enthalten!");
                    continue; // Wiederhole die Eingabe
                }
                if (!validatePasswordCase(userInput)){
                    System.out.println("Fehler: Muss Lower und Upper Case Characters enthalten!");
                    continue; // Wiederhole die Eingabe
                }
                if (!validatePasswordDigits(userInput)){
                    System.out.println("Fehler: Dein Passwort muss mind. ein digit enthalten!");
                    continue; // Wiederhole die Eingabe
                }
                if (!validatePasswordCommenlyUsed(userInput)){
                    System.out.println("Fehler: Dein Passwort wurde bei google geleaked!");
                    continue; // Wiederhole die Eingabe
                }
                break; // Korrekte Eingabe → Schleife verlassen

            } catch (InputMismatchException e) {
                System.out.println("Fehler: Bitte gib eine gültige Zahl ein.");
                scanner.nextLine(); // Verhindert Endlosschleife bei falschen Eingaben (z. B. Buchstaben)
            }
        }
        scanner.close();
        System.out.println("Dein neues Passwort wurde gesichert!");
    }


    public static boolean validatePasswordLength(String password) {

        if (password.length() >= 8) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean validatePasswordDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char temp = password.charAt(i);
            if (Character.isDigit(temp)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validatePasswordCase(String password) {
        boolean containsLowercase = false;
        boolean containsUppercase = false;
        for (int i = 0; i < password.length(); i++) {
            char temp = password.charAt(i);
            if (Character.isLowerCase(temp)) {
                containsLowercase = true;
            }
            if (Character.isUpperCase(temp)) {
                containsUppercase = true;
            }
        }
        if ( containsLowercase && containsUppercase){
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePasswordCommenlyUsed(String password) {
        String[] commenlyUsedPasswords = {"ABCDEFHG123"};
        for ( String temp : commenlyUsedPasswords ){
            if (password == temp){
                return false;
            }
        }
        return true;
    }
}