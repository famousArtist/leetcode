package leetcode.easy.arrays

class ReverseString {
}

// my first solution
fun reverseWords(s: String): String {
    val stringArr = s.split(" ")
    var result: String = ""
    for (el in stringArr){
        result += el.reversed() + " "
    }
    return result.trim()
}

// leetcode oneline

fun reverseWords1(s: String): String = s.split(" ").map { it.reversed() }.joinToString(" ");