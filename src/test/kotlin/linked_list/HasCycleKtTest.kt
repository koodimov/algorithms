package linked_list

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.linked_list.hasCycle
import org.junit.jupiter.api.Test

class HasCycleKtTest {
    @Test
    fun `should find a cycle`(): Unit = runBlocking {
        forAll(
            row(linkedListOf(), false),
            row(linkedListOf(3, 2, 0, -4)?.withCycleOn(1), true),
            row(linkedListOf(1,2)?.withCycleOn(0), true),
            row(linkedListOf(1)?.withCycleOn(-1), false)
        ) { list, result ->
            hasCycle(list) shouldBe result
        }
    }
}