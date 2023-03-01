package TomteHierarki

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TomteHierarkiTest {

    @Test
    fun findSubordinatesTest() {

        val th = TomteHierarki()
        th.createTree()

        val result1 = th.findAllSubordinates("Tomten").toString()
        assertEquals("[Glader, Butter, Tröger, Trötter, Blyger, Skumtomten, Dammråttan, Rådjuret, Nyckelpigan, Haren, Räven, Gråsuggan, Myran, Bladlusen]",result1)

        val result2 = th.findAllSubordinates("Glader").toString()
        assertEquals("[Tröger, Trötter, Blyger, Skumtomten, Dammråttan]",result2)

        val result3 = th.findAllSubordinates("Butter").toString()
        assertEquals("[Rådjuret, Nyckelpigan, Haren, Räven, Gråsuggan, Myran, Bladlusen]",result3)

        val result4 = th.findAllSubordinates("Trötter").toString()
        assertEquals("[Skumtomten, Dammråttan]",result4)

        val result5 = th.findAllSubordinates("Skumtomten").toString()
        assertEquals("[Dammråttan]",result5)

        val result6 = th.findAllSubordinates("Räven").toString()
        assertEquals("[Gråsuggan, Myran, Bladlusen]",result6)

        val result7 = th.findAllSubordinates("Myran").toString()
        assertEquals("[Bladlusen]",result7)
    }
}