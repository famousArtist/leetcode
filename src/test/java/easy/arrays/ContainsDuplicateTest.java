package easy.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    public void containsDuplicateFunTest(){
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

}