package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSumTest() {
        Assertions.assertArrayEquals(new int[]{0,2}, new TwoSum().twoSum(new int[]{3,2,3}, 6));
    }
}