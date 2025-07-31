package CodeWar;

public class Palindrome {
    public boolean ifPalindrome(int number) {
        String numbers = String.valueOf (number);
        String palindrome = "";
        for(int count = numbers.length()-1;count>=0;count--){
            palindrome += numbers.charAt(count);
        }
        return palindrome.equals(numbers);
    }
}
