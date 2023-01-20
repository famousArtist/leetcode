package easy.arrays

import leetcode.easy.arrays.defangIPaddr
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DefragingIpAddressTest {
    @Test
    fun `defrag IP address test`(){
        assertEquals("1[.]1[.]1[.]1", defangIPaddr("1.1.1.1"))
    }
}