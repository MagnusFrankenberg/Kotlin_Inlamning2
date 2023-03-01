package AOC_2022.Day7

import Day7.*
import org.junit.jupiter.api.*

internal class Day7KtTest {

    @Test
    fun createTreeTest() {
        //testar createTree-funktionen
        val result = createTree(list)
        Assertions.assertEquals("fmfnpm", result.directories[0].name)
        Assertions.assertEquals("gwlwp", result.directories[1].name)
        Assertions.assertEquals("hchp", result.directories[2].name)
        Assertions.assertEquals("fgtqvq", result.directories[0].directories[0].name)
    }

    @Test
    fun findAllDirectoriesTest() {
        //testar findAllDirectories-funktionen
        val root = createTree(list)
        val result2 = findAllDirectories(root)
        Assertions.assertEquals("/", result2[0].name)
        Assertions.assertEquals("fmfnpm", result2[1].name)
        Assertions.assertEquals("gwlwp", result2[2].name)
        Assertions.assertEquals("hchp", result2[3].name)
    }

    @Test
    fun resultPartATest() {
        val root = createTree(list)
        val resultA = findAllDirectories(root).map{it.size}.filter{ i->i<=100000}.sum()
        Assertions.assertEquals(1491614, resultA)
    }


    @Test
    fun b_findDirectoryToDeleteTest() {
        val root = createTree(list)
        val dirlist = findAllDirectories(root)
        val resultB = B_findDirectoryToDelete(dirlist)
        Assertions.assertEquals(6400111, resultB)

    }
}