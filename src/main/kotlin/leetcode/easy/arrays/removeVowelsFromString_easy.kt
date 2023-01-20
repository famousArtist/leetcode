package leetcode.easy.arrays

import java.lang.StringBuilder

class removeVowelsFromString_easy {
}

fun main() {
    println(removeVowels("leetcodeisacommunityforcoders"))
}

// my first solution
fun removeVowels(s: String): String {
    var vowels = "aeiou";
    var result = StringBuilder();
    for (char in s.toList()) {
        if (!vowels.contains(char)) {
            result.append(char)
        }
    }
    return result.toString()
}

// oneline solution
fun removeVowels2(s: String): String = s.replace("aeiou".toRegex(), "")