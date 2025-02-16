package mov.kudy.linked_list

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun equals(other: Any?): Boolean {
        return this === other ||
                (other is ListNode) &&
                `val` == other.`val`
    }

    override fun hashCode(): Int {
        return `val`.hashCode() * 31
    }
}