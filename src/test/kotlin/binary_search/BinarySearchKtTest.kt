package binary_search

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.binary_search.agnosticOrderBinarySearch
import mov.kudy.binary_search.binarySearch
import mov.kudy.binary_search.binarySearch2
import org.junit.jupiter.api.Test

class BinarySearchKtTest {

    @Test
    fun testBinarySearch(): Unit = runBlocking {
        forAll(
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 9, 4),
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 2, -1)
        ) { nums, target, result ->
            binarySearch(nums, target) shouldBe result
        }
    }

    @Test
    fun testBinarySearch2(): Unit = runBlocking {
        forAll(
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 9, 4),
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 2, -1)
        ) { nums, target, result ->
            binarySearch2(nums, target) shouldBe result
        }
    }

    @Test
    fun testAgnosticOrderBinarySearch(): Unit = runBlocking {
        forAll(
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 9, 4),
            row(intArrayOf(-1, 0, 3, 5, 9, 12), 2, -1),
            row(intArrayOf(25, 12, 9, 8, 4, 2, 1, 0, -5, -20), 4, 4),
            row(intArrayOf(25, 12, 9, 8, 4, 2, 1, 0, -5, -20), -20, 9),
            row(intArrayOf(25, 12, 9, 8, 4, 2, 1, 0, -5, -20), 11, -1),
            row(intArrayOf(1,1,1), 1, 1),
            row(intArrayOf(1,1,1), 0, -1),
        ) { nums, target, result ->
            agnosticOrderBinarySearch(nums, target) shouldBe result
        }
    }
}
