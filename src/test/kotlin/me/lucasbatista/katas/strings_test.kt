package me.lucasbatista.katas

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringsTest {
    @Test
    fun countDuplicatesTest() {
        assertEquals(0, "abc123?".countDuplicates())
        assertEquals(1, "aac123?".countDuplicates())
        assertEquals(2, "aac123??".countDuplicates())
        assertEquals(3, "aac1123??".countDuplicates())
        assertEquals(4, "aac11_2_3??".countDuplicates())
    }

    @Test
    fun findFirstNonRepeatedCharacterTest() {
        assertEquals('b', "baacct".findFirstNonRepeatedCharacter())
        assertEquals('?', "aa?cqqcbb!".findFirstNonRepeatedCharacter())
        assertEquals('o', "aa??cbc_b__bo".findFirstNonRepeatedCharacter())
        assertEquals(null, "!!".findFirstNonRepeatedCharacter())
    }

    @Test
    fun reverseLettersAndWordsTest() {
        assertEquals("!dlrow olleh", "hello world!".reverseLettersAndWords())
        assertEquals("esac_kcans", "snack_case".reverseLettersAndWords())
        assertEquals("esaClemaC", "CamelCase".reverseLettersAndWords())
    }

    @Test
    fun containsOnlyDigitsTest() {
        assertTrue { "1234".containsOnlyDigits() }
        assertFalse { "12-34".containsOnlyDigits() }
        assertFalse { "12 34".containsOnlyDigits() }
        assertFalse { " 1234".containsOnlyDigits() }
        assertFalse { "1234 ".containsOnlyDigits() }
        assertFalse { "12a34".containsOnlyDigits() }
    }

    @Test
    fun countVowelsAndConsonantsTest() {
        assertEquals(5, "a e i o u".countVowelsAndConsonants())
        assertEquals(3, "bcd".countVowelsAndConsonants())
        assertEquals(7, "aee * oou ? i".countVowelsAndConsonants())
        assertEquals(4, "!ab_cd!".countVowelsAndConsonants())
    }

    @Test
    fun countOccurrencesTest() {
        assertEquals(1, "a_!a?açDa".countOccurrences('!'))
        assertEquals(2, "a a".countOccurrences('a'))
        assertEquals(4, " a a a ".countOccurrences(' '))
    }

    @Test
    fun toNumberTest() {
        assertEquals(1000000000000000000L, "1000000000000000000".toNumber())
        assertEquals(1.5f, "1.5f".toNumber())
        assertEquals(1.0, "1.0".toNumber())
        assertEquals(-1, "-1".toNumber())
    }

    @Test
    fun removeWhiteSpacesTest() {
        assertEquals("HelloWorld", removeWhiteSpaces("Hello World"))
        assertEquals("HelloWorld", removeWhiteSpaces(" Hello World "))
        assertEquals("HelloWorld", removeWhiteSpaces("H e l l o  W o r l d"))
    }

    @Test
    fun joinWIthDelimiterTest() {
        assertEquals("hello_world", joinWithDelimiter(listOf("hello", "world"), '_'))
        assertEquals("hello.world.com", joinWithDelimiter(listOf("hello", "world", "com"), '.'))
    }

    @Test
    fun permuteTest() {
        assertEquals(listOf("ab", "ba"), "ab".permute())
        assertEquals(listOf("abc", "acb", "bac", "bca", "cab", "cba"), "abc".permute())
    }

    @Test
    fun isPalindromeTest() {
        assertTrue { "ana".isPalindrome() }
        assertTrue { "91019".isPalindrome() }
        assertTrue { "racecar".isPalindrome() }
        assertFalse { "car".isPalindrome() }
    }

    @Test
    fun removeDuplicatesTest() {
        assertEquals("abcd", "aabcd".removeDuplicates())
        assertEquals("1234", "11234".removeDuplicates())
        assertEquals("abc_1?23", "abbc__1?123?".removeDuplicates())
    }

    @Test
    fun removeCharTest() {
        assertEquals("abcd", "ab_cd".removeChar('_'))
        assertEquals("abcdefghi", "abc.def.ghi".removeChar('.'))
    }

    @Test
    fun findMostFrequentCharTest() {
        assertEquals('c', "abbcccd".findMostFrequentChar())
        assertEquals('.', "a.b.c.d.e.f".findMostFrequentChar())
        assertEquals(' ', "a  bc def".findMostFrequentChar())
        assertEquals('_', "a____c__d_f".findMostFrequentChar())
    }

    @Test
    fun sortArraysTest() {
        var elements = mutableListOf("123", "1234", "1", "12")
        elements = sortArrays(elements)
        assertEquals(elements[0], "1")
        assertEquals(elements[3], "1234")
    }
}
