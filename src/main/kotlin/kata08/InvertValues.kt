package kata08
//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/kotlin

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
//
//invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//invert([]) == []
class InvertValues {
}

fun main(){

}
//my solution
fun invert(arr: IntArray): IntArray {
    // code here
    return arr.map { x -> x * -1 }.toIntArray()
}

// kata best solution

fun invertKata(arr: IntArray) = arr.map { -it }.toIntArray()