package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}