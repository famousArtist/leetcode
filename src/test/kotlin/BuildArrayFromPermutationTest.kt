import leetcode.easy.BuildArrayFromPermutation
import leetcode.easy.buildArray
import org.junit.jupiter.api.Test
import java.util.Arrays
import kotlin.test.assertEquals

class BuildArrayFromPermutationTest {
    @Test
    fun buildArrayFromPermutationTest(){
        assertEquals(intArrayOf(0, 1, 2, 4, 5, 3).contentToString(), buildArray(intArrayOf(0,2,1,5,3,4)).contentToString())
    }
}