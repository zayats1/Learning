package lab9

import kotlin.random.Random


const val NUMBER_LIMIT = 1000

const val FIRST_ITEM_INDEX = 6;
const val QUANTITY = 4


fun main() {
    println("An Array")

    val arr = IntArray(16) {
        Random.nextInt() % NUMBER_LIMIT
    }

    println(arr.joinToString())

    println("I selected $QUANTITY items from the array at index: $FIRST_ITEM_INDEX to other array")

    val arr2 = arr.copyOfRange(FIRST_ITEM_INDEX, FIRST_ITEM_INDEX + QUANTITY)

    println(arr2.joinToString())
}