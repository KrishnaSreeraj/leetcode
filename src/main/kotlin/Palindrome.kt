package org.example

class Palindrome {
    fun isPalindrome(x: Int): Boolean {
        var reverse = 0
        var num = x
        while(num>0) {
            reverse = reverse*10 + num%10
            num/=10
        }
        return x == reverse
    }
}