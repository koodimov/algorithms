package mov.kudy.linked_list

fun hasCycle(head: ListNode?): Boolean {
    if (head?.next == null) return false

    var achilles = head.next
    var tortoise = head

    while (achilles != tortoise && achilles != null) {
        achilles = achilles.next?.next
        tortoise = tortoise?.next
    }

    return achilles == tortoise
}