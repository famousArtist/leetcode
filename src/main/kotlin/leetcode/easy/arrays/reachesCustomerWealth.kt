package leetcode.easy.arrays

//https://leetcode.com/problems/richest-customer-wealth/
class reachesCustomerWealth {
}

fun main() {
    var accounts = arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))
    println(maximumWealth(accounts))
}

// my first solution
fun maximumWealth(accounts: Array<IntArray>): Int {
    var sumsList = ArrayList<Int>()
    var result = 0;

    for (customer in accounts) {
        sumsList.add(customer.reduce { sum, it -> sum + it })
    }

    for (max in sumsList) {
        if (max > result) result = max
    }
    return result
}

