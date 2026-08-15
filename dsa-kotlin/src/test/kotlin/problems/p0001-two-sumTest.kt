package problems

import kotlin.test.Test
import kotlin.test.assertEquals

class p0001TwoSumTest {
    @Test
    fun findsExamplePair() {
        assertEquals(Pair(0, 1), twoSum(listOf(2, 7, 11, 15), 9))
    }

    @Test
    fun handlesDuplicateValues() {
        assertEquals(Pair(0, 1), twoSum(listOf(3, 3), 6))
    }

    @Test
    fun handlesNegativeValues() {
        assertEquals(Pair(1, 2), twoSum(listOf(4, -5, 2, 9), -3))
    }
}
