package mov.kudy.linked_list

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val resultHead = ListNode(0)
    var curHead: ListNode? = resultHead

    var cur1 = list1
    var cur2 = list2

    while (cur1 != null && cur2 != null) {
        if (cur1.`val` < cur2.`val`) {
            curHead?.next = cur1
            cur1 = cur1.next
        } else {
            curHead?.next = cur2
            cur2 = cur2.next
        }
        curHead = curHead?.next
    }

    while (cur1 != null) {
        curHead?.next = cur1
        cur1 = cur1.next
        curHead = curHead?.next
    }

    while (cur2 != null) {
        curHead?.next = cur2
        cur2 = cur2.next
        curHead = curHead?.next
    }

    return resultHead.next
}
