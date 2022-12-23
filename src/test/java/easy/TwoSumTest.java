package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumTest() {
        assertArrayEquals(new int[]{0,2}, new TwoSum().twoSum(new int[]{3,2,3}, 6));
    }
}