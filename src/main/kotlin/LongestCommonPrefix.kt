package org.example

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]
        var newPrefix = ""
        for (i in 1..<strs.size) {
            val str2 = strs[i]
            val len = if (prefix.length < str2.length) prefix.length else str2.length
            for (j in 0..<len) {
                if (prefix[j] == str2[j]) {
                    newPrefix+=prefix[j]
                }
                else break
            }
            if (newPrefix == "")
                return newPrefix
            prefix = newPrefix
            newPrefix = ""
        }
        return prefix
    }
}
