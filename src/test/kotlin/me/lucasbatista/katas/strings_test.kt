package me.lucasbatista.katas

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringsTest {
    @Test
    fun countDuplicatesTest() {
        assertEquals(0, countDuplicates("abc123?"))
        assertEquals(1, countDuplicates("aac123?"))
        assertEquals(2, countDuplicates("aac123??"))
        assertEquals(3, countDuplicates("aac1123??"))
        assertEquals(4, countDuplicates("aac11_2_3??"))
    }

    @Test
    fun findFirstNonRepeatedCharacterTest() {
        assertEquals('b', findFirstNonRepeatedCharacter("baacct"))
        assertEquals('?', findFirstNonRepeatedCharacter("aa?cqqcbb!"))
        assertEquals('o', findFirstNonRepeatedCharacter("aa??cbc_b__bo"))
        assertEquals(null, findFirstNonRepeatedCharacter("!!"))
    }

    @Test
    fun reverseLettersAndWordsTest() {
        assertEquals("!dlrow olleh", reverseLettersAndWords("hello world!"))
        assertEquals("esac_kcans", reverseLettersAndWords("snack_case"))
        assertEquals("esaClemaC", reverseLettersAndWords("CamelCase"))
    }

    @Test
    fun containsOnlyDigitsTest() {
        assertTrue { containsOnlyDigits("1234") }
        assertFalse { containsOnlyDigits("12-34") }
        assertFalse { containsOnlyDigits("12 34") }
        assertFalse { containsOnlyDigits(" 1234") }
        assertFalse { containsOnlyDigits("1234 ") }
        assertFalse { containsOnlyDigits("12a34") }
    }

    @Test
    fun countVowelsAndConsonantsTest() {
        assertEquals(5, countVowelsAndConsonants("a e i o u"))
        assertEquals(3, countVowelsAndConsonants("bcd"))
        assertEquals(7, countVowelsAndConsonants("aee * oou ? i"))
        assertEquals(4, countVowelsAndConsonants("!ab_cd!"))
    }

    @Test
    fun countOccurrencesTest() {
        assertEquals(1, countOccurrences("a_!a?açDa", '!'))
        assertEquals(2, countOccurrences("a a", 'a'))
        assertEquals(4, countOccurrences(" a a a ", ' '))
    }
}
