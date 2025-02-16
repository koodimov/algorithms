package linked_list

import mov.kudy.linked_list.ListNode

internal fun linkedListOf(vararg ints: Int): ListNode? {
    var head: ListNode? = null
    var node: ListNode? = null
    ints.forEachIndexed { index, elem ->
        if (index == 0) {
            node = ListNode(ints.first())
            head = node
        } else {
            val current = ListNode(elem)
            node!!.next = current
            node = current
        }
    }
    return head
}

internal fun ListNode.withCycleOn(pos: Int): ListNode {
    if (pos < 0) return this

    var last: ListNode? = this
    var count = 0
    var curPos: ListNode? = null

    while (last?.next != null) {
        if (count++ <= pos) {
            curPos = last
        }
        last = last.next
    }
    last?.next = curPos

    return this
}

internal infix fun ListNode?.iterativeEquals(expected: ListNode?): Boolean {
    if (this == null && expected == null) return true

    var curResult = this
    var curExpected = expected
    while (curResult != null || curExpected != null) {
        if (curResult?.`val` != curExpected?.`val`) return false
        curResult = curResult?.next
        curExpected = curExpected?.next
    }
    return true
}