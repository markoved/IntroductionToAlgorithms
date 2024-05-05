package sorting

import org.example.sorting.InsertionSort
import org.example.utils.Utils.isSorted
import kotlin.test.Test

class InsertionSortTest {

    private val testArrays = arrayOf(
        arrayOf(0),
        arrayOf(1, 2),
        arrayOf(2, 1),
        arrayOf(1, 2, 3),
        arrayOf(3, 1, 2),
        arrayOf(4, 7, 2, 1, 7, 8, 0, 34, 11, 34),
        arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0),
        arrayOf(1, 1, 1, 1, 1, 1),
        arrayOf(345, 73476, 12435, 1234, 865, 87, 345, 11, 213)
    )

    @Test
    fun insertionSortTest() {
        for (array in testArrays) {
            InsertionSort.sort(array)
            assert(array.isSorted()) {
                println("Array ${array.toList()} is not sorted!")
            }
        }
    }
}