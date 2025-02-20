package ru.otus.homework

fun main() {
    val arr : IntArray = intArrayOf(1, 2, 3, 4, 5)
    val res : IntArray = sumOfTwo(arr, 9)
    print("${res[0]}  ${res[1]}")
}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var i = 0
    var j = 1

    if (numbers.size < 2)
        throw  IllegalArgumentException("size < 2")
    while (i <= numbers.size-2) {
        while (j <= numbers.size-1) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i, j)
            }
            ++j
        }
        ++i
        j = i + 1
    }
    throw IllegalArgumentException("Not found")
}