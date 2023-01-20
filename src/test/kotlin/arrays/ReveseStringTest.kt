package arrays

import leetcode.easy.arrays.reverseWords
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReveseStringTest {
    @Test
    fun `testing reversed string`(){
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"))
    }
}




