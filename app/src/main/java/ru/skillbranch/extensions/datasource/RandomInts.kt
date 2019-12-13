package ru.skillbranch.extensions.datasource

import kotlin.random.Random

class RandomInts {

    fun next(): Int = Random.nextInt()
}

// хотим складывать только четные числа которые берем из генератора 30:23

fun RandomInts.getEven(): Int? =
    next().takeIf { it % 2 == 0 }

fun sampleRandom() {
    val gen = RandomInts()

    val a: Int? = gen.getEven()
    val b = gen.getEven()
    val c = gen.getEven()

    val result = a + b + c
}