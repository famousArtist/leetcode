package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        Assertions.assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}