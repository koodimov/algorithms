package arrays_and_hashing

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.arrays_and_hashing.createTargetArrayInAGivenOrder
import org.junit.jupiter.api.Test

class CreateTargetArrayInAGivenOrderKtTest {

    @Test
    fun `should return a target array in a given order made from inputs`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(), intArrayOf(), intArrayOf()),
            row(intArrayOf(0,1,2,3,4), intArrayOf(0,1,2,2,1), intArrayOf(0,4,1,3,2)),
            row(intArrayOf(1,2,3,4,0), intArrayOf(0,1,2,3,0), intArrayOf(0,1,2,3,4)),
            row(intArrayOf(1), intArrayOf(0), intArrayOf(1)),
        ) { nums, index, result ->
            createTargetArrayInAGivenOrder(nums, index) shouldBe result
        }
    }
}