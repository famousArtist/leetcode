package arrays

import leetcode.easy.arrays.MajorityElement
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MajorityElementTest {
    @Test
    fun `testing majority element`(){
        assertEquals(3, MajorityElement().majorityElement(intArrayOf(3,2,3)))
    }
}