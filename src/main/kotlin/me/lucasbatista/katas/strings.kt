package me.lucasbatista.katas

// P001: Write a program that counts duplicate characters from a given string.
fun countDuplicates(input: String): Int {
    val nonRepeatedChars = HashSet<Char>()
    input.forEach(nonRepeatedChars::add)
    var duplicates = 0
    nonRepeatedChars.forEach { if (input.count { ch -> ch == it } > 1) duplicates++ }
    return duplicates
}

// P002: Write a program that returns the first non-repeated character from a given string.
fun findFirstNonRepeatedCharacter(input: String): Char? {
    input.forEach { if (input.count { ch -> ch == it } == 1) return it }
    return null
}

// P003: Write a program that reverses the letters of each word and the words themselves.
fun reverseLettersAndWords(input: String) = input.reversed()

// P004: Write a program that checks whether the given string contains only digits.
fun containsOnlyDigits(input: String) = input.all { it.isDigit() }

// P005: Write a program that counts the vowels and consonants amount in a given string.
fun countVowelsAndConsonants(input: String) = input.filter { it.isLetter() && !it.isWhitespace() }.length

// P006: Write a program that counts the occurrences of a certain character in a given string.
fun countOccurrences(input: String, char: Char) = input.count { it == char }

