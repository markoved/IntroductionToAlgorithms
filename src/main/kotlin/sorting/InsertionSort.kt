package org.example.sorting

import org.example.utils.Utils.swap

object InsertionSort {
    fun sort(array: Array<Int>) {
        for (i in 1..< array.size) {
            var j = i
            while (j > 0 && array[j] < array[j - 1]) {
                array.swap(j, j - 1)
                j--
            }
        }
    }
}