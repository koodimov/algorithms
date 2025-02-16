package mov.kudy.binary_search

fun firstAndLastPositionOfElement(nums: IntArray, target: Int): IntArray {
    val startIndex = findIndex(nums, target, true)
    val endIndex = if (startIndex != -1) {
        findIndex(nums, target, false)
    } else -1

    return intArrayOf(startIndex, endIndex)
}

private fun findIndex(nums: IntArray, target: Int, findStartIndex: Boolean): Int {
    var start = 0
    var end = nums.size - 1
    var ans = -1

    while (start <= end) {
        val mid = (end - start) / 2 + start
        if (nums[mid] < target) { // search in right side
            start = mid + 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else {
            ans = mid // potential answer
            if (findStartIndex) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
    }
    return ans
}
