package two_pointers

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.two_pointers.validPalindrome
import org.junit.jupiter.api.Test

class ValidPalindromeKtTest {

    @Test
    fun `should validate palindrome from params`(): Unit = runBlocking {
        forAll(
            row("aba", true),
            row("A man, a plan, a canal: Panama", true),
            row("race a car", false),
            row(" ", true)
        ) { s, result ->
            validPalindrome(s) shouldBe result
        }
    }
}