import org.junit.Test
import org.junit.Assert.assertEquals

class CalculatorTests {

    @Test
    fun testAddition() {
        assertEquals(4.0, add(2.0, 2.0), 0.001)
        assertEquals(20.0, add(16.0, 4.0), 0.001)
    }

    @Test
    fun testSubtraction() {
        assertEquals(2.0, subtract(4.0, 2.0), 0.001)
        assertEquals(7.0, subtract(37.0, 30.0), 0.001)
    }

    @Test
    fun testMultiplication() {
        assertEquals(8.0, multiply(4.0, 2.0), 0.001)
        assertEquals(81.0, multiply(40.5, 2.0), 0.001)
    }

    @Test
    fun testDivision() {
        assertEquals(2.0, divide(4.0, 2.0), 0.001)
        assertEquals(3.0, divide(9.0, 3.0), 0.001)
    }

    @Test
    fun testPower() {
        assertEquals(16.0, power(4.0, 2.0), 0.001)
        assertEquals(16.0, power(2.0, 4.0), 0.001)
    }

    @Test
    fun testModulus() {
        assertEquals(1.0, modulus(7.0, 3.0), 0.001)
        assertEquals(2.3, modulus(11.3, 3.0), 0.001)
    }

    @Test
    fun testFactorial() {
        assertEquals(120, factorial(5))
        assertEquals(1, factorial(0))
    }

    @Test
    fun testSquareRoot() {
        assertEquals(2.0, nthRoot(4.0), 0.001)
        assertEquals(6.0, nthRoot(36.0), 0.001)
    }

    @Test
    fun testNthRoot() {
        assertEquals(2.0, nthRoot(8.0, 3.0), 0.001)
        assertEquals(5.0, nthRoot(625.0, 4.0), 0.001)
    }
}