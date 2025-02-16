package mov.kudy.binary_search

fun findFloor(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return -1
    if (target < nums[0]) {
        return -1
    }
    val index = binSearch(nums, 0, nums.size - 1, target)
    return index
}

private fun binSearch(nums: IntArray, left: Int, right: Int, target: Int): Int {
    val mid = (right - left) / 2 + left
    if (right < left) return right

    return if (nums[mid] < target) { // right side
        binSearch(nums, mid + 1, right, target)
    } else if (nums[mid] > target) { // left side
        binSearch(nums, left, mid - 1, target)
    } else {
        mid
    }
}