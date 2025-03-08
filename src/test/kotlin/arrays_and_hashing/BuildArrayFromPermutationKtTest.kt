package arrays_and_hashing

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.arrays_and_hashing.buildArrayFromPermutation
import org.junit.jupiter.api.Test

class BuildArrayFromPermutationKtTest {
    @Test
    fun `build array from permutation`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(0, 2, 1, 5, 3, 4), intArrayOf(0, 1, 2, 4, 5, 3)),
            row(intArrayOf(5, 0, 1, 2, 3, 4), intArrayOf(4, 5, 0, 1, 2, 3))
        ) { input, result ->
            buildArrayFromPermutation(input) shouldBe result
        }
    }
}