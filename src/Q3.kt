object Q3 {
    @JvmStatic
    fun main(argus: Array<String>) {
        var n = 600851475143
        var result = 2
        while (n > result) {
            if (n % result == 0L) {
                n /= result
            } else {
                result++
            }
        }
        print(n)
    }
}