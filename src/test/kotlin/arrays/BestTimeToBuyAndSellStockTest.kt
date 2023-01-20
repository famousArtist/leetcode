package arrays

import leetcode.easy.arrays.BestTimeToBuyAndSellStock
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockTest {
    @Test
    fun `test for maximum profit value`(){
        assertEquals(5, BestTimeToBuyAndSellStock().maxProfit(intArrayOf(7,1,5,3,6,4)))
    }
}