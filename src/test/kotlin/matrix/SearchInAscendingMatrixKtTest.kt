package matrix

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.matrix.searchInAscendingMatrix
import org.junit.jupiter.api.Test

class SearchInAscendingMatrixKtTest {
    @Test
    fun `should find target in ascending matrix`(): Unit = runBlocking {
        forAll(
            row(
                arrayOf(
                    intArrayOf(10, 20, 30, 40),
                    intArrayOf(11, 25, 35, 45),
                    intArrayOf(28, 29, 37, 49),
                    intArrayOf(33, 34, 38, 50)
                ),
                37,
                intArrayOf(2, 2)
            ),
            row(
                arrayOf(
                    intArrayOf(10, 20, 30, 40),
                    intArrayOf(11, 25, 35, 45),
                    intArrayOf(28, 29, 37, 49),
                    intArrayOf(33, 34, 38, 50)
                ),
                5,
                intArrayOf(-1, -1)
            )
        ) { matrix, target, result ->
            searchInAscendingMatrix(matrix, target) shouldBe result
        }
    }
}