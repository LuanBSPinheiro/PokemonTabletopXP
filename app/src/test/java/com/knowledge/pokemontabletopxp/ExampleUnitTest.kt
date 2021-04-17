package com.knowledge.pokemontabletopxp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        var pokemonxp = 17
        val pokemonlv = when {
               pokemonxp <= 10 -> 1
               pokemonxp <= 20 -> 2
               pokemonxp <= 30 -> 3
            else -> 4
        }

        println(pokemonlv)


        assertEquals(4, 2 + 2)
    }
}