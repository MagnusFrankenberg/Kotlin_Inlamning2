package AOC_2022.Day3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day3_MyNewSolutionKtTest {

    @Test
    fun a_SumPoints() {
        val resultA = A_SumPoints(list2)
        assertEquals(7597,resultA)
    }

    @Test
    fun b_SumPoints() {
        val resultB = B_SumPoints(list2)
        assertEquals(2607,resultB)
    }
}