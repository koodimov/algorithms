package mov.kudy.binary_search

fun findElementInInfiniteSortedArray(nums: IntArray, target: Int): Int {
    var start = 0
    var end = 1
    var chunkSize = 1
    var answer = -1

    while (start < nums.size && answer == -1) {
        val startValue = nums[start]
        val endValue = nums[end]
        if (target in (startValue + 1)..<endValue) {
            answer = binSearch(nums, start, end, target)
        }
        if (start > target) {
            return -1
        }

        start = end + 1
        chunkSize *= 2
        end = start + chunkSize
        if (end > nums.size - 1) end = nums.size - 1
    }

    return answer
}

private fun binSearch(nums: IntArray, start: Int, end: Int, target: Int): Int {
    var start = start
    var end = end

    while (start <= end) {
        val mid = (end - start) / 2 + start // todo do shr
        if (nums[mid] < target) {
            start = mid + 1
        } else if (nums[mid] > target) {
            end = mid - 1
        } else return mid
    }

    return -1
}
