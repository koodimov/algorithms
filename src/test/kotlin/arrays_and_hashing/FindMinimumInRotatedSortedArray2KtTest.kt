package arrays_and_hashing

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.arrays_and_hashing.findMinimumInRotatedSortedArray2
import org.junit.jupiter.api.Test

class FindMinimumInRotatedSortedArray2KtTest {
    @Test
    fun `find minimum in array`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(1,3,5), 1),
            row(intArrayOf(2,2,2,0,1), 0),
            row(intArrayOf(1,2,2,0,1), 0),
            row(intArrayOf(1,3,1), 1),
            row(intArrayOf(1,3,3), 1),
            row(intArrayOf(1,1,1,1,1,3,3,3,3,3,3,3,3), 1),
            row(intArrayOf(3,3,3,3,3,3,3,3,1,1,1,1,1), 1),
            row(intArrayOf(3,3,1), 1),
            row(intArrayOf(1,3), 1),
            row(intArrayOf(3,1), 1),
            row(intArrayOf(3,0,1,1,1), 0),
            row(intArrayOf(3,1,3), 1),
            row(intArrayOf(3,3,1,1,3,3), 1),
        ) { input, result ->
            findMinimumInRotatedSortedArray2(input) shouldBe result
        }
    }
}