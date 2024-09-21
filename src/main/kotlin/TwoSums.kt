package org.example

class TwoSums {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var j = 1
        for(i in nums.indices) {
            val complement = target - nums[i]
            val temp = nums.toList().subList(i+1, nums.size) // temporary list to keep track of the elements in nums, excluding the current element
            if (complement in temp)
                return intArrayOf(i, temp.indexOf(complement)+j) // in temp, the index of an element varies by j compared to its actual index in nums as temp is a sublist with one element less each time. Thus j is initialized to 1
            else
                j++
        }
        return intArrayOf()
    }
}