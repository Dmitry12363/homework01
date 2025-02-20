package ru.otus.homework

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    var i = 0
    var j = 1

    if (numbers.size < 2)
        throw  IllegalArgumentException("size < 2")
    while (i <= numbers.size-2) {
        while (j <= numbers.size-1) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(numbers[i], numbers[j])
            }
            ++j
        }
        ++i
        j = i + 1
    }
    throw IllegalArgumentException("Not found")
}