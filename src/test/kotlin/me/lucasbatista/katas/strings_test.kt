package me.lucasbatista.katas

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringsTest {
    @Test
    fun countDuplicatesTest() {
        assertEquals(0, countDuplicates("abc123?"))
        assertEquals(1, countDuplicates("aac123?"))
        assertEquals(2, countDuplicates("aac123??"))
        assertEquals(3, countDuplicates("aac1123??"))
        assertEquals(4, countDuplicates("aac11_2_3??"))
    }
}
