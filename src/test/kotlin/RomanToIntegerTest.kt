import io.kotlintest.shouldBe
import org.example.RomanToInteger
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanToIntegerTest {
    @Nested
    inner class RomanToInt {
        @ParameterizedTest
        @CsvSource(value = ["I, 1", "V, 5", "X, 10", "L, 50", "C, 100", "D, 500", "M, 1000"])
        fun `Test Case 1`(roman: String, int: Int) {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToInt(roman) shouldBe int
        }

        @Test
        fun `Test Case 2`() {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToInt("LVIII") shouldBe 58
        }

        @Test
        fun `Test Case 3`() {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToInt("MCMXCIV") shouldBe 1994
        }

        @Test
        fun `Test Case 4`() {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToInt("MMMCMXCIX") shouldBe 3999
        }
    }

    @Nested
    inner class RomanToIntOptimized {
        @ParameterizedTest
        @CsvSource(value = ["I, 1", "V, 5", "X, 10", "L, 50", "C, 100", "D, 500", "M, 1000"])
        fun `Test Case 1`(roman: String, int: Int) {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToIntOptimized(roman) shouldBe int
        }

        @Test
        fun `Test Case 2`() {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToIntOptimized("LVIII") shouldBe 58
        }

        @Test
        fun `Test Case 3`() {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToIntOptimized("MCMXCIV") shouldBe 1994
        }

        @Test
        fun `Test Case 4`() {
            val romanToInteger = RomanToInteger()
            romanToInteger.romanToIntOptimized("MMMCMXCIX") shouldBe 3999
        }
    }
}