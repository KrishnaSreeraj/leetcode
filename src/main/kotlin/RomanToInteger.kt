package org.example

class RomanToInteger {
    fun romanToInt(s: String): Int {
        val roman = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        val groups = mapOf("IV" to 4, "IX" to 9, "XL" to 40, "XC" to 90, "CD" to 400, "CM" to 900)
        if (s.length == 1)
            return roman[s[0]] ?: 0
        val subGroups = generateGroups(s, groups)
        var value = 0
        subGroups.map {
            if (it in groups.keys)
               value += groups[it]!!
            else {
                    value += roman[it[0]]!!
                    for (i in 1..<it.length) {
                        if (roman[it[i]]!! <= roman[it[i-1]]!!)
                            value += roman[it[i]]!!
                    }
            }
        }
        return value
    }

    private fun generateGroups(s: String, groups: Map<String, Int>): List<String> {
        var str = s
        val identifiedGroups = arrayListOf<String>()
        for (group in groups.keys) {
            if (group in str) {
                str=str.replaceFirst(group, "")
                identifiedGroups.add(group)
            }
        }
        return groupStrings(str, mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)) + identifiedGroups
    }


    private fun groupStrings(s: String, roman: Map<Char, Int>): List<String> {
        var i = 0
        var k : Int
        var j : Int
        val sub = arrayListOf<String>()
        while (i<s.length) {
            k = i
            j = i+1
            while (j<s.length && s[k] < s[j]) {
                k++
                j++
            }
            sub.add(s.substring(i, j))
            i = j
        }
        return sub
    }
}
