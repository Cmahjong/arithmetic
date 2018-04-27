object FourTest {
    @JvmStatic
    fun main(argus: Array<String>) {
        var sum = 2L
        var countSum = 0L
        var tag  = true
        while (true) {
            sum++
            if (!tag) {
                break
            }
            if (sum % 2 == 0L) {
                var end = sum / 2L
                var index = sum - 1
                var count = 0
                while (true) {
                    count++
                    if (index > end) {
                        index -= (sum - index)
                    } else if (index < end) {
                        index += (index - 1)
                    } else {
                        if (count == 60) {
                            println(count)
                            countSum+=sum
                            println(countSum)

                        }

                        break
                    }
                }
            }

        }


    }
}