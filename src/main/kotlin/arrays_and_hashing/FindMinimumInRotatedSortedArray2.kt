package mov.kudy.arrays_and_hashing

fun findMinimumInRotatedSortedArray2(nums: IntArray): Int {
    // in such an array you can not do time complexity in worst case better than O(n)
    // todo try binary search for case where not more than 2-3 elements out big array are repeated
    return nums.min()
}
