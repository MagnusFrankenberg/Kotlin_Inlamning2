package AOC_2022.Day6

import Day6.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day6KtTest {

    @Test
    fun countCharsToMarkerTest() {
        val resultA = countCharsToMarker(list,4)
        val resultB = countCharsToMarker(list,14)

        assertEquals(1566,resultA)
        assertEquals(2265,resultB)
    }
}