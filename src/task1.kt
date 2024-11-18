/**
 * 1. Дана строка из скобок "{([])}". Проверить наличие у каждой открывающейся скобки на своей позиции –
 * закрывающейся на своей, соблюдая принцип «симметричности».
 * Т.е. в данном случае при проверке программы должно выйти true, т.к. соответствие прослеживается.
 * Если допустим, строка будет такого плана "{([))}","{{[])}» – это false.
 */

fun main() {
    val stack = mutableListOf<Char>()
    val list = listOf(Pair('{', '}'), Pair('(', ')'), Pair('[', ']'))
    val string = "{([])}"
    var check = false

    for (char in string) {
        for (pair in list) {
            if (pair.first == char) {
                stack.add(char)
                break
            }
            else if (pair.second == char) {
                if (stack.isEmpty() || stack.last() != pair.first) {
                    check = false
                    break
                }
                stack.removeLast()
                break
            }
        }

        if (stack.isEmpty()) {
            check = true
        }
    }

    println(check)
}