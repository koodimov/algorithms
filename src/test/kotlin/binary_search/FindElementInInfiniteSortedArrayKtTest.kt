package binary_search

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.binary_search.findElementInInfiniteSortedArray
import org.junit.jupiter.api.Test

class FindElementInInfiniteSortedArrayKtTest {
    @Test
    fun `should find element in infinite sorted array`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(1, 3, 4, 6, 7, 9, 10, 12, 16, 19, 24, 32, 59, 105, 108, 204), 16, 8),
            row(intArrayOf(1, 3, 4, 6, 7, 9, 10, 12, 16, 19, 24, 32, 59, 105, 108, 204), 15, -1),
            row(intArrayOf(1, 3, 4, 6, 7, 9, 10, 12, 16, 19, 24, 32, 59, 105, 108, 204), 59, 12),
            row(intArrayOf(1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 19), 3, 1)
        ) { nums, target, result ->
            findElementInInfiniteSortedArray(nums, target) shouldBe result
        }
    }
}