package easy.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPollindromeTest {

    @Test
    void longestPalindrome() {

        assertEquals(7, new LongestPollindrome().longestPalindrome("abccccdd") );
        assertEquals(1, new LongestPollindrome().longestPalindrome("a") );
    }
}