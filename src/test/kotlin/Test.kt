import kata08.repeatStr
import leetcode.easy.RunningSum1dArray
import leetcode.easy.runningSum
import org.junit.jupiter.api.Test
import org.springframework.test.context.TestConstructor
import kotlin.test.assertEquals


class StringRepeatTest {
    @Test
    fun test(){
        assertEquals("EvgenyEvgeny1", repeatStr(2, "Evgeny"), "RESULT IS ")
    }
}

