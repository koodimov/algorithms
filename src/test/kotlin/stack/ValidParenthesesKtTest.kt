package stack

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.stack.validParentheses
import org.junit.jupiter.api.Test

class ValidParenthesesKtTest {

    @Test
    fun checkWithParams(): Unit = runBlocking {
        forAll(
            row("()", true),
            row("()[]{}", true),
            row("(]", false),
            row("([])", true)
        ) { s, result ->
            validParentheses(s) shouldBe result
        }
    }
}