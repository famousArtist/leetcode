package leetcode.easy

class ConvertTheTempertures {
}

fun convertTemperature(celsius: Double): DoubleArray {

    val fahrenheite = celsius * 9 / 5 + 32
    val kelvin = celsius + 273.15
    return doubleArrayOf(kelvin, fahrenheite)
}