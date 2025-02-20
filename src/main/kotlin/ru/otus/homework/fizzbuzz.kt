package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    var i = 0
    val arrInt = Array<Int>(n, {i++})
    val arrStr  = Array<String>(n, {""})

    i = 0
    for (elem in arrInt) {
        if ((elem % 3) == 0) {
            arrStr[i] += "Fizz"
        }
        if ((elem % 5) == 0) {
            arrStr[i] += "Buzz"
        }
        if (arrStr[i] == "") {
            arrStr[i] = "$elem"
        }
        i++
    }
    return arrStr
}