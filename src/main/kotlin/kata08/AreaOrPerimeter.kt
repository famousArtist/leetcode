package kata08

//You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
//If it is a square, return its area. If it is a rectangle, return its perimeter.
//
//Example(Input1, Input2 --> Output):
//
//6, 10 --> 32
//3, 3 --> 9
//Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
class AreaOrPerimeter {
}

fun main() {
}
// my solution
object Solution {
    fun areaOrPerimeter(l: Int, w: Int): Int {
        // code away...
        if (l == w) {
            return l * w
        }
        return l * 2 + w * 2
    }
}

// kata best solutions

object Solution1 {
    fun areaOrPerimeter(l: Int, w: Int) = if (l == w) l * w else 2 * (l + w)
}

object Solution2 {
    fun areaOrPerimeter(l:Int, w:Int): Int {
        return when {
            w == l -> w * l
            else -> (w + l) * 2
        }
    }


}