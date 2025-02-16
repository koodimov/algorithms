package mov.kudy.arrays_and_hashing

fun containsDuplicate(nums: IntArray): Boolean {
    val dataSet = hashSetOf<Int>()
    nums.iterator().forEach {
        if (!dataSet.add(it)) return true
    }
    return false
}