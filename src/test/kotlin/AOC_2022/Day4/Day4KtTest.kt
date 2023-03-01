package AOC_2022.Day4

import Day4.*
import Day4.list
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day4KtTest {

    @Test
    fun a_isFullyContained() {
        val resultA = A_isFullyContained(splitLineToInts(list)).filter { it==true }.count()
        assertEquals(573,resultA)
    }

    @Test
    fun b_isFullyOrPartlyContained() {
        val resultB = B_isFullyOrPartlyContained(splitLineToInts(list)).filter { it==true }.count()
        assertEquals(867,resultB)
    }
}