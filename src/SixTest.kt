object SixTest {
    @JvmStatic
    fun main(argus: Array<String>) {
        var sum1 = 0L
        var sum2 = 0L
        for (i in 1..100) {
            sum1+=i*i
        }
        for (i in 1..100) {
            sum2+=i
        }
        print(sum2*sum2-sum1)
    }
}