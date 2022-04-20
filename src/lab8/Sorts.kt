package lab8

val numbers = arrayOf(1, 2, 3, 8, -8, 9, 10, 12, -5, -7, 6)

fun selectionSort(array: Array<Int>): Array<Int> {
    val arr = array.clone()

    for (i in arr.indices) {
        var min = arr[i]
        var indexOfMin = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < min) {
                min = arr[j]
                indexOfMin = j
            }
        }
        if (i != indexOfMin) {
            arr[i] = arr[indexOfMin].also { arr[indexOfMin] = arr[i] }
        }
    }

    return arr
}

fun exchangeSort(array: Array<Int>): Array<Int> {  // bubble sort
    val arr = array.clone()

    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                arr[i] = arr[j].also { arr[j] = arr[i] }
            }
        }
    }

    return arr
}


fun main() {

    println("The array")
    println(numbers.joinToString())

    println("Sorted array by selection sort")
    println(selectionSort(numbers).joinToString())

    println("I made sorting functions, that don't modify original array")
    println(numbers.joinToString())

    println("Sorted array by exchange sort")
    println(exchangeSort(numbers).joinToString())

    println()
    println("Built in functions:")
    println("shuffle")
    numbers.shuffle()
    println(numbers.joinToString())

    println("sort")
    numbers.sort()
    println(numbers.joinToString())
}