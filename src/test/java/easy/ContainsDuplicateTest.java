package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    public void containsDuplicateFunTest(){
        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

}