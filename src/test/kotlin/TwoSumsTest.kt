import io.kotlintest.shouldBe
import org.example.TwoSums
import org.junit.jupiter.api.Test

class TwoSumsTest {
    @Test
    fun `Test Case 1`() {
        val twoSums = TwoSums()
        val result = twoSums.twoSum(intArrayOf(2, 7, 11, 15), 9)

        result shouldBe intArrayOf(0, 1)
    }

    @Test
    fun `Test Case 2`() {
        val twoSums = TwoSums()
        val result = twoSums.twoSum(intArrayOf(3,2,4), 6)

        result shouldBe intArrayOf(1,2)
    }

    @Test
    fun `Test Case 3`() {
        val twoSums = TwoSums()
        val result = twoSums.twoSum(intArrayOf(3,3), 6)

        result shouldBe intArrayOf(0, 1)
    }

    @Test
    fun `Test Case 4`() {
        val twoSums = TwoSums()
        val result = twoSums.twoSum(intArrayOf(-1,-2,-3,-4,-5), -8)

        result shouldBe intArrayOf(2,4)
    }
}