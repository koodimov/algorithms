package arrays_and_hashing

import io.kotest.matchers.shouldBe
import mov.kudy.arrays_and_hashing.containsDuplicate
import org.junit.jupiter.api.Test

class ContainsDuplicateKtTest {
    @Test
    fun `when contain duplicates then return true`() {
        // given
        val given = intArrayOf(1,1,2,3,4)
        // when
        val result = containsDuplicate(given)
        // then
        result shouldBe true

    }

    @Test
    fun `when does not contain duplicates then return false`() {
        // given
        val given = intArrayOf(1,2,3,4,5)
        // when
        val result = containsDuplicate(given)
        // then
        result shouldBe false
    }
}
