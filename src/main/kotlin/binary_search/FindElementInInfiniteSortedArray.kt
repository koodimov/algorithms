package mov.kudy.binary_search

fun findElementInInfiniteSortedArray(nums: IntArray, target: Int): Int {
    var start = 0
    var end = 1
    var chunk = 1

    while (start < nums.size && nums[start] < target) {
        if (nums[start] <= target && nums[end] >= target) {
            return binSearch(nums, start, end, target)
        }
        start = end + 1
        chunk *= 2
        end = start + chunk
        end = if (end < nums.size) end else nums.size - 1
    }

    return -1
}

private fun binSearch(nums: IntArray, start: Int, end: Int, target: Int): Int {
    var start = start
    var end = end
    while (start <= end) {
        val mid = (start + end).shr(1)
        if (nums[mid] < target) {
            start = mid + 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else return mid
    }
    return -1
}