package JavaBasics;

public class PasswordValidation {

    public static void main(String[] args) {
        String password = "12345678";
        validatePasswordLength(password);
        validatePasswordDigits(password);
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
}