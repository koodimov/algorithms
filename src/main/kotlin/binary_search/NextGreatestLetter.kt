package mov.kudy.binary_search

fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    var left = 0
    var right = letters.size - 1

    while (left <= right) {
        val mid = (right - left) / 2 + left

        if (target < letters[mid]) {
            right = mid - 1
        } else
            left = mid + 1
    }

    return letters[left % letters.size]
}