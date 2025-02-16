package mov.kudy.linked_list

fun reverseLinkedList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var cur = head

    while (cur != null) {
        val next = cur.next
        cur.next = prev
        prev = cur
        cur = next
    }
    return prev
}

fun reverseLinkedListRecursive(head: ListNode?): ListNode? {
    return reverse(null, head, head?.next)
}

private fun reverse(prev: ListNode?, cur: ListNode?, next: ListNode?): ListNode? {
    cur?.next = prev
    if (next == null) {
        return cur
    }
    return reverse(cur, next, next.next)
}