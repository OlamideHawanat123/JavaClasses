package CodeWar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testThatPalindromeFunctionReturnsTrueIfTheNumberIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.ifPalindrome(121));
    }

}