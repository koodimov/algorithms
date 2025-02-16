package linked_list

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.linked_list.mergeTwoLists
import org.junit.jupiter.api.Test

class MergeTwoListsKtTest {
    @Test
    fun `should merge two lists`(): Unit = runBlocking {
        forAll(
            row(linkedListOf(1, 2, 4), linkedListOf(1, 3, 4), linkedListOf(1, 1, 2, 3, 4, 4)),
            row(linkedListOf(1, 2, 4, 5, 6), linkedListOf(1, 3, 4), linkedListOf(1, 1, 2, 3, 4, 4, 5, 6)),
            row(linkedListOf(1, 2, 4), linkedListOf(1, 3, 4, 8, 9), linkedListOf(1, 1, 2, 3, 4, 4, 8, 9)),
            row(linkedListOf(), linkedListOf(), linkedListOf()),
            row(linkedListOf(), linkedListOf(0), linkedListOf(0)),
        ) { list1, list2, result ->
            (mergeTwoLists(list1, list2) iterativeEquals result) shouldBe true
        }
    }
}
