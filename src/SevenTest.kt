object SevenTest {
    @JvmStatic
    fun main(argus: Array<String>) {
        var count = 1L
        var count1 = 2L
        var tag=false
        while (true) {
            count1++
            for (i in 2 until count1) {
                if (count1 % i == 0L) {
                    tag = false
                    break
                } else {
                    tag=true
                }
            }
            if (tag) {
                count++
            }
            if (count == 10001L) {
                print(count1)
                return
            }

        }

    }
}