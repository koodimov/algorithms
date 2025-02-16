package mov.kudy.two_pointers

fun validPalindrome(s: String): Boolean {
    val filtered = s
        .filter { it.isLetterOrDigit() }
        .lowercase()
        .toCharArray()

    if (filtered.isEmpty()) return true

    for (i: Int in 0 .. filtered.size / 2) {
        val left = filtered[i]
        val right = filtered[filtered.size - 1 - i]

        if (left != right) return false
    }

    return true
}

fun validPalindrome2(s: String): Boolean {
    // optimized
    // when isLeterOrDigit then i+ ,, j--
    // compare in the same while cycle
    return false
}