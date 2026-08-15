package problems

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class p0002ValidParenthesesTest {
    @Test
    fun acceptsNestedBrackets() {
        assertTrue(isValidParentheses("([]{})"))
    }

    @Test
    fun rejectsMismatchedOrder() {
        assertFalse(isValidParentheses("([)]"))
    }

    @Test
    fun handlesEmptyInput() {
        assertTrue(isValidParentheses(""))
    }

    @Test
    fun rejectsAnUnclosedBracket() {
        assertFalse(isValidParentheses("{"))
    }
}
