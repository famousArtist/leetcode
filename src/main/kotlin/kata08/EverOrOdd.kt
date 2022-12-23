package kata08

//https://www.codewars.com/kata/583710ccaa6717322c000105/train/kotlin
class EverOrOdd {
}
// my first decision
fun simpleMultiplication(n: Int): Int {

    return if (n % 2 == 0) {
        n * 8
    } else {
        n * 9
    }
}

// codewars best
fun simpleMultiplicationFromCodeWars(n: Int) = n * (8 + n%2)