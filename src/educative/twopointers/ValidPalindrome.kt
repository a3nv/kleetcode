package educative.twopointers

fun isPalindrome(s: String): Boolean {
    val len = s.length
    for (i in 0 until len / 2) {
        if (s[i] != s[len - 1 - i]) {
            return false
        }
    }
    return true
}

fun isPalindrome2(s: String): Boolean {
    return (0 until s.length / 2).all { i -> s[i] == s[s.length - 1 - i] }
}

fun main(args: Array<String>) {
    println(isPalindrome("kayak"))
    println(isPalindrome("hello"))
    println(isPalindrome("RACEACAR"))
    println(isPalindrome("A"))
    println(isPalindrome("ABCDABCD"))
    println("_")
    println(isPalindrome2("kayak"))
    println(isPalindrome2("hello"))
    println(isPalindrome2("RACEACAR"))
    println(isPalindrome2("A"))
    println(isPalindrome2("ABCDABCD"))
}
