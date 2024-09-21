import io.kotlintest.shouldBe
import org.example.Palindrome
import org.junit.jupiter.api.Test

class PalindromeTest {
    @Test
    fun `Test Case 1`() {
        val palindrome = Palindrome()
        palindrome.isPalindrome(121) shouldBe true
    }

    @Test
    fun `Test Case 2`() {
        val palindrome = Palindrome()
        palindrome.isPalindrome(-121) shouldBe false
    }

    @Test
    fun `Test Case 3`() {
        val palindrome = Palindrome()
        palindrome.isPalindrome(10) shouldBe false
    }
}