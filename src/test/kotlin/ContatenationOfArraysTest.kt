import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import leetcode.easy.getConcatenation

class ContatenationOfArraysTest {
    @Test
    fun concatenationOfNumsArrayTest() {
        assertEquals(intArrayOf(1, 2, 1, 1, 2, 1).contentToString(), getConcatenation(intArrayOf(1, 2, 1)).contentToString())
    }
}

