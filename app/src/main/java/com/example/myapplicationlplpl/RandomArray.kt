package com.example.myapplicationlplpl

import kotlin.random.Random

fun main() {

    val amplititudes = IntArray(10) { Random.nextInt(0, 10) }.asList()

    println(amplititudes)

    var count = 0

    amplititudes.forEach {
        if (it > 5)
            count += 1
    }
    println(count)
}