package binary_search

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.binary_search.findCeiling
import org.junit.jupiter.api.Test

class FindCeilingKtTest {

    @Test
    fun returnCeilingForArrayAndTarget(): Unit = runBlocking {
        forAll(
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 34, 8),
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 90, -1),
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 25, 7),
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 2, 1),
            row(intArrayOf(), 1, -1),
            row(intArrayOf(0), 0, 0),
            row(intArrayOf(0), 1, -1)
        ) { nums, target, result ->
            findCeiling(nums, target) shouldBe result
        }
    }
}