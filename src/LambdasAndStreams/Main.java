package LambdasAndStreams;


public class Main {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = (String password, String reversed) -> {
            if (password.equals(reversed)) {
                return true;
            }
            return false;
        };

        System.out.println(passwordEncoder.reversePassword("olamide", "olamide"));

        PasswordEncoder passwordReverse = (String password, String reversed) -> {
            String input = password.toString();
            String reversePassword = "";

            for (int count = input.length() - 1; count >= 0; count--) {
                reversePassword += input.charAt(count);
            }

            return reversePassword.equals(reversed);
        };
        System.out.println(passwordReverse.reversePassword("olamide", "edimalo"));
    }


}