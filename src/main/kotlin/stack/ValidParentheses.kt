package mov.kudy.stack

import java.util.LinkedList

fun validParentheses(s: String): Boolean {
    val pStack = LinkedList<Char>()
    s.forEach {
        when (it) {
            '(', '{', '[' -> pStack.addFirst(it)
            ')' -> if (pStack.removeFirstOrNull() != '(') return false
            '}' -> if (pStack.removeFirstOrNull() != '{') return false
            ']' -> if (pStack.removeFirstOrNull() != '[') return false
        }
    }

    return pStack.isEmpty()
}
