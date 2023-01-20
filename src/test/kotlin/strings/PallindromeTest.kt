package strings

import leetcode.easy.arrays.reverseWords
import leetcode.easy.strings.isPalindrome
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class PallindromeTest {

    @Test
    fun `testing pallindrome`(){
        assertEquals(true, isPalindrome("ab_a"))
    }
}