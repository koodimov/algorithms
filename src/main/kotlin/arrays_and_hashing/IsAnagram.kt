package mov.kudy.arrays_and_hashing

fun isAnagram(s: String, t: String): Boolean {
    if (s.isEmpty() || s.length != t.length) return false

    val sMap = hashMapOf<Char, Int>()
    val tMap = hashMapOf<Char, Int>()

    s.forEach {
        sMap[it] = sMap.getOrDefault(it, 0) + 1
    }
    t.forEach {
        tMap[it] = tMap.getOrDefault(it, 0) + 1
    }

    return sMap == tMap
}

fun isAnagram2(s: String, t: String): Boolean {
    if (s.isEmpty() || s.length != t.length) return false

    val freq = IntArray(26)

    s.forEach {
        val charNum = it - 'a'
        freq[charNum]++
    }

    t.forEach {
        val charNum = it - 'a'
        freq[charNum]--
    }

    val result = freq.firstOrNull {
        it != 0
    }
    return result == null
}
