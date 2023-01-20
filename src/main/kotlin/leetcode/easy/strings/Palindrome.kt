package leetcode.easy.strings

class Palindrome {

}

fun isPalindrome(s: String): Boolean {

    var result = s.filter { it.isLetterOrDigit() }.map { it.lowercase() }
    return result == result.reversed()
}