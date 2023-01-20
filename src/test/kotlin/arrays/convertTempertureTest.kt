package arrays

import leetcode.easy.arrays.convertTemperature
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class convertTempertureTest {
    @Test
    fun `converting Celcius temperture to array of kelvin and faghreheit`(){
        assertEquals(doubleArrayOf(309.65000,97.70000).contentToString(), convertTemperature(36.5).contentToString())
    }
}