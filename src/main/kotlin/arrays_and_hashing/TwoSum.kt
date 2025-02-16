package mov.kudy.arrays_and_hashing

fun twoSum(nums: IntArray, target: Int): IntArray {
    val resPos = mutableMapOf<Int, Int>()

    nums.forEachIndexed { idx, num ->
        val minusResult = target - num
        val res = resPos[minusResult]
        if (res != null) {
            return intArrayOf(res, idx)
        }
        resPos[num] = idx
    }
    return IntArray(0)
}