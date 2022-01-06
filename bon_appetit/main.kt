// https://www.hackerrank.com/challenges/bon-appetit/problem

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill
 *  2. INTEGER k
 *  3. INTEGER b
 */
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    // Write your code here

    val sumItemsMinusAnnaPortion = bill
        .sliceArray(bill.indices.minus(k))
        .reduce { acc, item -> acc + item }

    println(sumItemsMinusAnnaPortion)
    if (sumItemsMinusAnnaPortion / 2 == b) {
        println("Bon Appetit")
    } else {
        println(b - (sumItemsMinusAnnaPortion / 2))
    }
}

// input04 = 781
// cat input_04.txt | java -jar main.jar
fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
