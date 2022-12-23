package kata08
//https://www.codewars.com/kata/5a00e05cc374cb34d100000d/kotlin
class ReversedSequence {
}

fun main(){
    println(reverseSeq(5))
}
// my decision
fun reverseSeq(n: Int): List<Int> {
    //TODO: Fill in your code here!
    var list: ArrayList<Int> = arrayListOf()
    for (i in n downTo 1){
        list.add(i)
    }
    return list
}


// codewars best decision
fun reverseSeqCodeWars(n: Int) = n.downTo(1).toList()
