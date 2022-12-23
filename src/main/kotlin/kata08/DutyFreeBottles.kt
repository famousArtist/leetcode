package kata08

import kotlin.math.roundToInt

//https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/kotlin
class DutyFreeBottles {
}

fun main() {
//    println(dutyFree(12,50,1000))
    println(dutyFree(377, 40, 9048))
}

fun dutyFree(normPrice: Int, discount: Int, hol: Int): Int {
    //code here
    var savingsAmount = normPrice * discount.toDouble() / 100
    var resultInDouble = hol / savingsAmount
    var ceil = Math.ceil(resultInDouble)
    var flor = Math.floor(resultInDouble)
    if ((Math.ceil(resultInDouble) - resultInDouble) <= 0.01) {
        return ceil.toInt()
    }
    return flor.toInt()

}