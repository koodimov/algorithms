package mov.kudy.linked_list

fun middleOfLinkedList(head: ListNode?): ListNode? {
    var fast = head
    var slow = head

    var click = true
    while (fast != null) {
        fast = fast.next
        click = !click
        if (click) slow = slow?.next
    }

    return slow
}