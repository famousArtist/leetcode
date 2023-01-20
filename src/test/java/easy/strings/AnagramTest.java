package easy.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        assertEquals(true, new Anagram().isAnagram("anagram","nagaram"));
        assertEquals(false, new Anagram().isAnagram("rat","car"));
    }
}