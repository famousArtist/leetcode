package kata08
//https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/kotlin

//Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
//
//Examples (input -> output)
//
//6, "I"     -> "IIIIII"
//5, "Hello" -> "HelloHelloHelloHelloHello"

fun main(){
    println(repeatStr(5, "Evgeny"))
}

class StringRepeat {
}
// my solution
fun repeatStr(r: Int, str: String) : String = str.repeat(r)