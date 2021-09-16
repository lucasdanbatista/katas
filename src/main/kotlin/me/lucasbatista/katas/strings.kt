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

// P007: Write a program that converts the given String (representing a number) into an int, long, float or double
fun toNumber(input: String): Number =
    if (input.contains('f')) input.toFloatOrNull() ?: throw NumberFormatException()
    else input.toIntOrNull() ?: input.toLongOrNull() ?: input.toDoubleOrNull() ?: throw NumberFormatException()

// P008: Write a program that removes all white spaces from the given string.
fun removeWhiteSpaces(input: String) = input.filter { !it.isWhitespace() }

// P009: Write a program that joins the given strings by the given delimiter.
fun joinWithDelimiter(inputs: List<String>, delimiter: Char): String {
    var joined = ""
    inputs.forEach { joined = if (joined.isEmpty()) joined.plus(it) else joined.plus(delimiter + it) }
    return joined
}
