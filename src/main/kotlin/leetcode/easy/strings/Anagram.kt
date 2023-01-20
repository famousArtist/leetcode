package leetcode.easy.strings

class Anagram {
}

fun isAnagram(s: String, t: String): Boolean {
    val arr1 = s.toCharArray().sorted()
    val arr2 = t.toCharArray().sorted()

    if (arr1 == arr2)
        return true
    return false
}