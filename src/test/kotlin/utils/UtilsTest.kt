package utils

import org.example.utils.Utils.isSorted
import kotlin.test.Test
import kotlin.test.assertEquals

class UtilsTest {

    @Test
    fun isSortedTest() {
        assertEquals(arrayOf(0).isSorted(), true)
        assertEquals(arrayOf(1, 2).isSorted(), true)
        assertEquals(arrayOf(1, 2, 3).isSorted(), true)
        assertEquals(arrayOf(0, 5, 6, 88).isSorted(), true)
        assertEquals(arrayOf(-41, -32, -1, 0, 54, 667).isSorted(), true)
        assertEquals(arrayOf(0, 1, 2, 4, 7, 7, 8, 11, 34, 34).isSorted(), true)

        assertEquals(arrayOf(1, 0).isSorted(), false)
        assertEquals(arrayOf(3, 2, 1).isSorted(), false)
        assertEquals(arrayOf(45, 65, 11, 34, 0).isSorted(), false)
        assertEquals(arrayOf(-2345, 12, 513, 34).isSorted(), false)
        assertEquals(arrayOf(33, 33, 89, 33).isSorted(), false)
    }
}