package binary_search

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.binary_search.nextGreatestLetter
import org.junit.jupiter.api.Test

class NextGreatestLetterKtTest {
    @Test
    fun `return greatest letter after target`(): Unit = runBlocking {
        forAll(
            row(charArrayOf('c', 'f', 'j'), 'a', 'c'),
            row(charArrayOf('c', 'f', 'j'), 'c', 'f'),
            row(charArrayOf('x', 'x', 'y', 'y'), 'z', 'x'),
        ) { letters, target, result ->
            nextGreatestLetter(letters, target) shouldBe result
        }
    }
}