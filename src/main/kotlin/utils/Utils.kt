package org.example.utils

object Utils {

    fun <T: Comparable<T>> Array<T>.isSorted(): Boolean {
        var i = 1
        while (i < this.size && this[i] >= this[i - 1]) i++
        return i == this.size
    }

    fun <T> Array<T>.swap(i: Int, j: Int) {
        val temp = this[i]
        this[i] = this[j]
        this[j] = temp
    }
}