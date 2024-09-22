import io.kotlintest.shouldBe
import org.example.LongestCommonPrefix
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {
    @Test
    fun `Test Case 1`() {
        val longestCommonPrefix = LongestCommonPrefix()
        longestCommonPrefix.longestCommonPrefix(arrayOf("flower","flow","flight")) shouldBe "fl"
    }

    @Test
    fun `Test Case 2`() {
        val longestCommonPrefix = LongestCommonPrefix()
        longestCommonPrefix.longestCommonPrefix(arrayOf("dog","racecar","car")) shouldBe ""
    }
}