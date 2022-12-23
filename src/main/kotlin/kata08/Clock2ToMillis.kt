package kata08

//Clock shows h hours, m minutes and s seconds after midnight.
//
//Your task is to write a function which returns the time since midnight in milliseconds.
//
//Example:
//
//h = 0
//m = 1
//s = 1
//
//result = 61000
//Input constraints:
//
//0 <= h <= 23
//0 <= m <= 59
//0 <= s <= 59
class Clock2ToMillis {
}

fun main() {}


fun past(h: Int, m: Int, s: Int): Int {
    // your code here
    var seconds = h * 60 * 60 + m * 60 + s
    return seconds * 1000
}