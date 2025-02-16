package mov.kudy.sliding_window

import kotlin.math.max

// two pointers
fun bestTimeToBuyAndSellStocks(prices: IntArray): Int {
    var maxTotal = 0
    var leftIdx = 0
    var rightIdx = 1

    while (rightIdx < prices.size) {
        val left = prices[leftIdx]
        val right = prices[rightIdx]

        val total = right - left
        maxTotal = max(total, maxTotal)

        if (left > right) leftIdx = rightIdx
        rightIdx++
    }

    return maxTotal
}
