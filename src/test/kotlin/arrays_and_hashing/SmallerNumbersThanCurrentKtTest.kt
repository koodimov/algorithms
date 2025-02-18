package arrays_and_hashing

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.arrays_and_hashing.smallerNumbersThanCurrent
import org.junit.jupiter.api.Test

class SmallerNumbersThanCurrentKtTest {
    @Test
    fun `should return array with count of numbers in array smaller than current`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(8, 1, 2, 2, 3), intArrayOf(4, 0, 1, 1, 3)),
            row(intArrayOf(6, 5, 4, 8), intArrayOf(2, 1, 0, 3)),
            row(intArrayOf(7, 7, 7, 7), intArrayOf(0, 0, 0, 0))
        ) { input, result ->
            smallerNumbersThanCurrent(input) shouldBe result
        }
    }
}