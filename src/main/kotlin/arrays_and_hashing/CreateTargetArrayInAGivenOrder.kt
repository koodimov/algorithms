package mov.kudy.arrays_and_hashing

fun createTargetArrayInAGivenOrder(nums: IntArray, index: IntArray): IntArray {
    val target = IntArray(nums.size)
    for (i in nums.indices) {
        shiftRightFromIndex(target, index[i])
        target[index[i]] = nums[i]
    }
    return target
}

private fun shiftRightFromIndex(target: IntArray, index: Int) {
    for (i in (target.size - 1) downTo index) {
        if (i == 0) {
            target[i] = 0
        } else {
            target[i] = target[i - 1]
        }
    }
}
