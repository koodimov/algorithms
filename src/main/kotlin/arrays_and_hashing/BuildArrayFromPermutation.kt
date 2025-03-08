package mov.kudy.arrays_and_hashing

fun buildArrayFromPermutation(nums: IntArray): IntArray {
    for (i in nums.indices) {
        nums[i] = nums[i] + nums[nums[i]] % 10000 * 10000
    }
    for (i in nums.indices) {
        nums[i] = nums[i] / 10000
    }
    return nums
}