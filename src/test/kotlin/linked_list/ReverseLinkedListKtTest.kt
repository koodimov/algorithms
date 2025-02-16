package linked_list

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.linked_list.reverseLinkedList
import mov.kudy.linked_list.reverseLinkedListRecursive
import org.junit.jupiter.api.Test

class ReverseLinkedListKtTest {

    @Test
    fun `should receive the list and return reversed`(): Unit = runBlocking {
        forAll(
            row(null, null),
            row(linkedListOf(0), linkedListOf(0)),
            row(linkedListOf(1, 2, 3), linkedListOf(3, 2, 1)),
            row(linkedListOf(1, 2), linkedListOf(2, 1)),
            row(linkedListOf(1, 2, 3, 4, 5), linkedListOf(5, 4, 3, 2, 1)),
            row(linkedListOf(), linkedListOf())
        ) { input, expected ->
            (reverseLinkedList(input) iterativeEquals expected) shouldBe true
        }
    }

    @Test
    fun `should receive the list and return reversed - recursive`(): Unit = runBlocking {
        forAll(
            row(null, null),
            row(linkedListOf(0), linkedListOf(0)),
            row(linkedListOf(1, 2, 3), linkedListOf(3, 2, 1)),
            row(linkedListOf(1, 2), linkedListOf(2, 1)),
            row(linkedListOf(1, 2, 3, 4, 5), linkedListOf(5, 4, 3, 2, 1)),
            row(linkedListOf(), linkedListOf())
        ) { input, expected ->
            (reverseLinkedListRecursive(input) iterativeEquals expected) shouldBe true
        }
    }
}
