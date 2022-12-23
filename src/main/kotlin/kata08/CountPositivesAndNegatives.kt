package kata08

class CountPositivesAndNegatives {
}

fun main() {
    println(countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}

//my solution
//fun countPositivesSumNegativesMY(input: Array<Int>?): Array<Int> {
//    //code here
//    if (input.isNullOrEmpty()) {
//        return arrayOf()
//    }
//    var positiveList = input?.filter { e -> e > 0 }
//    var negativeList = input?.filter { e -> e < 0 }
//
//    var negative: Int = negativeList?.reduce { sum, x -> sum + x }.toInt()
//    var positive: Int = positiveList.size
//    return arrayOf(positive, negative)
//
//}

// kata solution
fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    if (input == null || input.isEmpty()) return emptyArray()
    val (positive, negative) = input.partition { it > 0 }
    return arrayOf(positive.count(), negative.sum())
}