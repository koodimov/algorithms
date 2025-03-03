package linked_list

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.linked_list.middleOfLinkedList
import org.junit.jupiter.api.Test

class MiddleOfLinkedListKtTest {
    @Test
    fun `find the middle of the linked list`(): Unit = runBlocking {
        forAll(
            row(linkedListOf(1,2,3,4,5), linkedListOf(3,4,5)),
            row(linkedListOf(1,2,3,4,5,6), linkedListOf(4,5,6))
        ) { input, result ->
            middleOfLinkedList(input) shouldBe result
        }
    }
}
