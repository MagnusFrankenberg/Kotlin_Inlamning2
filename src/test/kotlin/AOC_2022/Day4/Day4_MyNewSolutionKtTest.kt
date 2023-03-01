package AOC_2022.Day4

import Day4.*
import Day4.list2
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day4_MyNewSolutionKtTest {

    @Test
    fun a_isFullyContained2() {
        val resultA = A_isFullyContained2(list2)
        assertEquals(573,resultA)
    }

    @Test
    fun b_isFullyOrPartlyContained2() {
        val resultB = B_isFullyOrPartlyContained2(list2)
        assertEquals(867,resultB)
    }
}