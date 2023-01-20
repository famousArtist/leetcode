package leetcode.easy.arrays

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit: Int = 0
        var minPrice = Int.MAX_VALUE;

        prices.forEach { price ->
            if (price < minPrice)
                minPrice = price
            else if (price - minPrice > maxProfit)
                maxProfit = price - minPrice
        }
        return maxProfit
    }
}

fun main() {
    println( BestTimeToBuyAndSellStock().maxProfit(intArrayOf(7,1,5,3,6,4)))
    println(toLowerCase("AssSSs"))
}

fun toLowerCase(s: String): String = s.lowercase()

