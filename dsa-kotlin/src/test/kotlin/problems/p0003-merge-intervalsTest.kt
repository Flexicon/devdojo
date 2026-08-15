package problems

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class p0003MergeIntervalsTest {
    @Test
    fun mergesOverlappingIntervals() {
        val input = listOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10))
        val actual = mergeIntervals(input)

        assertEquals(2, actual.size)
        assertContentEquals(intArrayOf(1, 6), actual[0])
        assertContentEquals(intArrayOf(8, 10), actual[1])
    }

    @Test
    fun mergesTouchingIntervals() {
        val actual = mergeIntervals(listOf(intArrayOf(1, 2), intArrayOf(2, 4)))

        assertEquals(1, actual.size)
        assertContentEquals(intArrayOf(1, 4), actual[0])
    }

    @Test
    fun handlesEmptyInput() {
        assertEquals(emptyList(), mergeIntervals(emptyList()))
    }
}
