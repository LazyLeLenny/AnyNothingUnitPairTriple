/**
 * 2. Дан массив целых чисел val array = intArrayOf(1, 2, 3).
 * Вывести в консоль максимальное количество перестановок элементов массива. Т.е. результат будет следующим:
 * [1, 2, 3]
 * [1, 3, 2]
 * [2, 1, 3]
 * [2, 3, 1]
 * [3, 2, 1]
 * [3, 1, 2]
 */

fun main() {
    val array = intArrayOf(1, 2, 3)
    val permutations = array.permute()
    permutations.forEach { println(it) }
}

fun IntArray.permute(): List<List<Int>> {
    if (size == 1) return listOf(toList())

    return flatMap { num ->
        (this.filter { it != num }.toIntArray()).permute().map { listOf(num) + it }
    }
}


