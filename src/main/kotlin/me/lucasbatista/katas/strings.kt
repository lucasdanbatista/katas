package me.lucasbatista.katas

// P001: Write a program that counts duplicate characters from a given string.
fun countDuplicates(input: String): Int {
    val chars = HashSet<Char>()
    input.forEach(chars::add)
    var duplicates = 0
    chars.forEach { if (input.count { ch -> ch == it } > 1) duplicates++ }
    return duplicates
}
