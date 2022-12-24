import kata08.repeatStr
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class StringRepeatTest {
    @Test
    fun test(){
        assertEquals("EvgenyEvgeny1", repeatStr(2, "Evgeny"), "RESULT IS ")
    }
}

