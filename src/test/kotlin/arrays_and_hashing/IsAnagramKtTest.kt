package arrays_and_hashing

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.arrays_and_hashing.isAnagram
import mov.kudy.arrays_and_hashing.isAnagram2
import org.junit.jupiter.api.Test

class IsAnagramKtTest {

    @Test
    fun `should be result for given parameters`(): Unit = runBlocking {
        forAll(
            row("", "", false),
            row("abc", "abc", true),
            row("abc", "cba", true),
            row("anagram", "nagaram", true),
            row("cat", "rat", false),
            row("ccat", "atcc", true),
            row("cc", "cc", true),
            row("ca", "a", false),
            row("c", "ag", false),
        ) { a, b, result ->
            isAnagram(a, b) shouldBe result
        }
    }

    @Test
    fun `should be result for given parameters 2`(): Unit = runBlocking {
        forAll(
            row("", "", false),
            row("abc", "abc", true),
            row("abc", "cba", true),
            row("anagram", "nagaram", true),
            row("cat", "rat", false),
            row("ccat", "atcc", true),
            row("cc", "cc", true),
            row("ca", "a", false),
            row("c", "ag", false),
        ) { a, b, result ->
            isAnagram2(a, b) shouldBe result
        }
    }
}