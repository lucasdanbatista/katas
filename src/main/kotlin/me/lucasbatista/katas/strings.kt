package me.lucasbatista.katas

// P001: Write a program that counts duplicate characters from a given string.
fun String.countDuplicates(): Int {
    val nonRepeatedChars = HashSet<Char>()
    this.forEach(nonRepeatedChars::add)
    var duplicates = 0
    nonRepeatedChars.forEach { if (this.count { ch -> ch == it } > 1) duplicates++ }
    return duplicates
}

// P002: Write a program that returns the first non-repeated character from a given string.
fun String.findFirstNonRepeatedCharacter(): Char? {
    this.forEach { if (this.count { ch -> ch == it } == 1) return it }
    return null
}

// P003: Write a program that reverses the letters of each word and the words themselves.
fun String.reverseLettersAndWords() = this.reversed()

// P004: Write a program that checks whether the given string contains only digits.
fun String.containsOnlyDigits() = this.all { it.isDigit() }

// P005: Write a program that counts the vowels and consonants amount in a given string.
fun String.countVowelsAndConsonants() = this.filter { it.isLetter() && !it.isWhitespace() }.length

// P006: Write a program that counts the occurrences of a certain character in a given string.
fun String.countOccurrences(ch: Char) = this.count { it == ch }

// P007: Write a program that converts the given String (representing a number) into an int, long, float or double
fun String.toNumber(): Number =
    if (this.contains('f')) this.toFloatOrNull() ?: throw NumberFormatException()
    else this.toIntOrNull() ?: this.toLongOrNull() ?: this.toDoubleOrNull() ?: throw NumberFormatException()

// P008: Write a program that removes all white spaces from the given string.
fun removeWhiteSpaces(input: String) = input.filter { !it.isWhitespace() }

// P009: Write a program that joins the given strings by the given delimiter.
fun joinWithDelimiter(inputs: List<String>, delimiter: Char): String {
    var joined = ""
    inputs.forEach { joined = if (joined.isEmpty()) joined.plus(it) else joined.plus(delimiter + it) }
    return joined
}

// P010: Write a program that generates all the permutations of a given string.
fun String.permute(): List<String> {
    val result = ArrayList<String>()
    fun permute(prefix: String, input: String) {
        if (input.isEmpty()) result.add(prefix)
        else for (i in input.indices) permute(
            prefix + input[i],
            input.substring(0, i) + input.substring(i + 1, input.length)
        )
    }
    permute("", this)
    return result
}

// P011: Write a program that determines whether the given string is a palindrome or not.
fun String.isPalindrome() = this.reversed() == this

// P012: Write a program that removes the duplicate characters from the given string.
fun String.removeDuplicates() = this.toCollection(mutableSetOf()).joinToString("")

// P013: Write a program that removes the given character from the given string.
fun String.removeChar(ch: Char) = this.replace(ch.toString(), "")
