package easy.strings

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class LongestPollindromeKtTest {

    @Test
    fun longestPalindrome() {
        Assertions.assertEquals(7, LongestPollindrome().longestPalindrome("abccccdd"))
        Assertions.assertEquals(1, LongestPollindrome().longestPalindrome("a"))
    }
}