package leetcode

fun containDuplicate(nums: IntArray): Boolean {
    val set = nums.toSet()
    return set.size != nums.size
}

fun containsDuplicateLoop(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (i in nums) {
        if (set.contains(i)) {
            return true
        }
        set.add(i)
    }
    return false
}