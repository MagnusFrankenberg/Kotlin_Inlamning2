package AOC_2022.Day3

import Day3.A_sumOfPoints
import Day3.B_calcPoints
import Day3.B_getGroupChars
import Day3.list
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day3KtTest {

    @Test
    fun a_sumOfPoints() {
        val resultA= A_sumOfPoints(list)
        assertEquals(7597,resultA)
    }

    @Test
    fun b_calcPoints() {
        val resultB = B_calcPoints(B_getGroupChars(list))
        assertEquals(2607,resultB)
    }
}