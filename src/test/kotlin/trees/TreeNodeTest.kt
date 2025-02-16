package trees

import io.kotest.matchers.shouldBe
import mov.kudy.trees.TreeNode.Companion.toTreeNode
import mov.kudy.trees.toArray
import org.junit.jupiter.api.Test

class TreeNodeTest {

    @Test
    fun `should create tree node from array and convert back to array`() {
        // given
        val givenArray = intArrayOf(4,2,7,1,3,6,9)

        // when
        val result = givenArray.toTreeNode()

        // then
        result.toArray() shouldBe givenArray
    }
}