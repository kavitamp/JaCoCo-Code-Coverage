package com.android.jacococodecoverage

import com.android.jacococodecoverage.utility.CalculatorMethods
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalculatorMethodsUnitTest {
    private val calculatorMethods = CalculatorMethods()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, calculatorMethods.add(2,2))
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(0, calculatorMethods.subtract(2,2))
    }

    @Test
    fun multiplication_isInCorrect() {
        assertNotEquals(8, calculatorMethods.multiply(2,2))
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(4, calculatorMethods.multiply(2,2))
    }
}