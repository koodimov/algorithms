package arrays_and_hashing

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.arrays_and_hashing.twoSum
import org.junit.jupiter.api.Test

class TwoSumKtTest {
    @Test
    fun `twoSum with parameters`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(1, 2, 3), 4, intArrayOf(0, 2)),
            row(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1)),
            row(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2)),
            row(intArrayOf(3, 3), 6, intArrayOf(0, 1))
        ) { nums, target, result ->
            twoSum(nums, target) shouldBe result
        }
    }
}