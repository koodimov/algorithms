package mov.kudy.binary_search

fun binarySearch(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return -1
    return doSearch(nums, 0, nums.size - 1, target)
}

private fun doSearch(nums: IntArray, left: Int, right: Int, target: Int): Int {
    val mid = ((right - left) / 2) + left
    val midVal = nums[mid]
    if (left == right && midVal != target) return -1

    if (midVal < target) {
        // search in right side
        return doSearch(nums, mid + 1, right, target)
    } else if (midVal > target) {
        // search in left side
        return doSearch(nums, left, mid, target)
    } else return mid
}


// iterative
fun binarySearch2(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1

    while (start <= end) {
        val mid = (end - start) / 2 + start

        val midValue = nums[mid]

        if (midValue == target) return mid
        // ascending order
        if (target > midValue) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }

    return -1
}

fun agnosticOrderBinarySearch(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1

    val isAsc = nums[0] < nums[end]
    while (start <= end) {
        val mid = (end - start) / 2 + start
        val midValue = nums[mid]

        if (midValue == target) return mid

        if (isAsc) {
            if (target > midValue) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        } else {
            if (target < midValue) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
    }

    return -1
}