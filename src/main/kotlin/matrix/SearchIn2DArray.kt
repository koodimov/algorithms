package mov.kudy.matrix

fun searchIn2DArray(arr: Array<IntArray>, target: Int): IntArray {
    val sub = arr[0]
    for (i in arr.indices) {
        for (j in sub.indices) {
            if (arr[i][j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf(-1,-1)
}