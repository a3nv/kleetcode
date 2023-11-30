package educative.twopointers

fun findSumOfThree(nums: IntArray, target: Int): Boolean {
    nums.sort()
    for (i in nums.indices) {
        if (i > nums.size - 3) {
            break
        }
        var low = i + 1
        var high = nums.size - 1
        while (low < high) {
            val currentSum = nums[i] + nums[low] + nums[high]
            when {
                target == currentSum -> return true
                currentSum < target -> low++
                else -> high--
            }
        }
    }
    return false
}


fun main(args: Array<String>) {
    println(findSumOfThree(intArrayOf(1, -1, 0), -1)); // false
    println(findSumOfThree(intArrayOf(3, 7, 1, 2, 8, 4, 5), 10)); //true
    println(findSumOfThree(intArrayOf(3, 7, 1, 2, 8, 4, 5), 21)); //false
    println(findSumOfThree(intArrayOf(-1, 2, 1, -4, 5, -3), -8)); //true
    println(findSumOfThree(intArrayOf(-1, 2, 1, -4, 5, -3), 0)); //true
}