package mov.kudy.arrays_and_hashing

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val digits = IntArray(101)
    val runSum = IntArray(101)
    val answer = IntArray(nums.size)

    nums.forEach { num ->
        digits[num]++
    }
    for (i: Int in 1..<digits.size) {
        runSum[i] = runSum[i - 1] + digits[i - 1]
    }
    for (i: Int in nums.indices) {
        answer[i] = runSum[nums[i]]
    }

    return answer
}