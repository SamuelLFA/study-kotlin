// https://www.hackerrank.com/challenges/sock-merchant/problem

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    val socksMapByColor = LinkedHashMap<Int, Int>()
    ar.forEach { item -> run {
        if (!socksMapByColor.containsKey(item)) {
            socksMapByColor.put(item, 1)
        } else {
            socksMapByColor.replace(item, socksMapByColor[item]!! + 1)
        }
    } }
    var pairs = 0
    socksMapByColor.forEach { sock ->
        pairs += sock.value / 2
    }
    return pairs
}

// input01 = 3
// cat input_01.txt | java -jar main.jar
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
