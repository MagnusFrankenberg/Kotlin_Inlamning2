package AOC_2022.Day5

import Day5.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day5KtTest {

    @Test
    fun readStringTest() {
        val result = readString("move 8 from 5 to 9")
        assertEquals(8,result[0])
        assertEquals(5,result[1])
        assertEquals(9,result[2])
    }

    @Test
    fun a_makeAllMovesTest() {
        A_makeAllMoves(list)
        val resultA = myMap.map{ m->m.value.takeLast(1)}.flatten().toList().toString()
        assertEquals("[V, J, S, F, H, W, G, F, T]",resultA)
    }

    @Test
    fun b_makeAllMovesTest() {
        B_makeAllMoves(list)
        val resultB = myMap.map{ m->m.value.takeLast(1)}.flatten().toList().toString()
        assertEquals("[L, C, T, Q, F, B, V, Z, V]",resultB)
    }
}