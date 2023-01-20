package strings

import easy.strings.Anagram
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class AnagramKtTest {

    @Test
    fun isAnagram() {
        Assertions.assertEquals(true, Anagram().isAnagram("anagram", "nagaram"))
        Assertions.assertEquals(false, Anagram().isAnagram("rat", "car"))
    }
}