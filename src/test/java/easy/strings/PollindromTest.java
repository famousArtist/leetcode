package easy.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PollindromTest {
    @Test
    public void checkPalindrome() {
        Assertions.assertEquals(true, new Pollindrome().isPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertEquals(false, new Pollindrome().isPalindrome("race a car"));
        Assertions.assertEquals(true, new Pollindrome().isPalindrome("ab_a"));



    }

}
