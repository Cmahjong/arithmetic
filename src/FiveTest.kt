object FiveTest {
    @JvmStatic
    fun main(argus: Array<String>) {
        var sum = 20L
        var tag=true
        while (true) {
            if (!tag) {
                print(sum)
                return
            }
            sum++
            for (i in 1L..20L) {
                if (sum % i == 0L) {
                     tag=false
                } else {
                    tag=true
                    break
                }
            }
        }
    }
}