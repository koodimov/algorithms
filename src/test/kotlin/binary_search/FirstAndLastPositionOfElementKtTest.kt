package binary_search

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.binary_search.firstAndLastPositionOfElement
import org.junit.jupiter.api.Test

class FirstAndLastPositionOfElementKtTest {
    @Test
    fun `should find first and last position of the element in sorted array`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(5, 7, 7, 8, 8, 10), 8, intArrayOf(3, 4)),
            row(intArrayOf(5, 7, 7, 8, 8, 10), 6, intArrayOf(-1, -1)),
            row(intArrayOf(5, 7), 0, intArrayOf(-1, -1))
        ) { nums, target, result ->
            firstAndLastPositionOfElement(nums, target) shouldBe result
        }
    }
}