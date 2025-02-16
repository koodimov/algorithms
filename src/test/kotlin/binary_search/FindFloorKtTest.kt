package binary_search

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.binary_search.findFloor
import org.junit.jupiter.api.Test

class FindFloorKtTest {

    @Test
    fun returnFloorForArrayAndTarget(): Unit = runBlocking {
        forAll(
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 34, 7),
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), -10, -1),
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 25, 7),
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 20, 6),
            row(intArrayOf(1, 3, 4, 6, 8, 12, 15, 25, 78), 2, 0),
            row(intArrayOf(), 1, -1),
            row(intArrayOf(0), 0, 0),
            row(intArrayOf(0), 1, 0),
            row(intArrayOf(0), -1, -1),
        ) { nums, target, result ->
            findFloor(nums, target) shouldBe result
        }
    }
}