package matrix

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.matrix.searchIn2DArray
import org.junit.jupiter.api.Test

class SearchIn2DArrayKtTest {
    @Test
    fun `search in 2d array`(): Unit = runBlocking {
        forAll(
            row(arrayOf(intArrayOf(18, 9, 12), intArrayOf(36, -9, 91), intArrayOf(44, 33, 16)), 91, intArrayOf(1, 2)),
            row(arrayOf(intArrayOf(18, 9, 12), intArrayOf(36, -9, 91), intArrayOf(44, 33, 16)), 92, intArrayOf(-1, -1))
        ) { arr, target, result ->
            searchIn2DArray(arr, target) shouldBe result
        }
    }
}