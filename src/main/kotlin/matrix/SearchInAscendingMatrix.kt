package mov.kudy.matrix

fun searchInAscendingMatrix(matrix: Array<IntArray>, target: Int): IntArray {
    val colLastIdx = matrix.lastIndex
    val rowLastIdx = matrix.first().lastIndex

    var colIdx = colLastIdx
    var rowIdx = 0

    while (colIdx >= 0 && rowIdx <= rowLastIdx) {
        if (matrix[rowIdx][colIdx] > target) colIdx--
        else if (matrix[rowIdx][colIdx] < target) rowIdx++
        else return intArrayOf(rowIdx, colIdx)
    }

    return intArrayOf(-1, -1)
}