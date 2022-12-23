package leetcode.easy

class MovingAverage(size: Int) {
    val size = size;
    var list = mutableListOf<Int>();
    fun next(`val`: Int): Double {
        list.add(`val`)
        var result = 0.0
        return if (list.size < size) {
            for (num in list) {
                result += num.toDouble()
            }
            result / list.size
        } else {
            for (i in list.size - size until list.size) {
                result += list[i].toDouble()
            }
            result / size
        }
    }

}