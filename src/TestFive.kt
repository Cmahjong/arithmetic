import sun.rmi.runtime.Log

object TestFive {
    @JvmStatic
    fun main(argus: Array<String>) {
        var max = 0L
        var result=""
        for (i in 999L downTo 100L) {
            for (j in 999L downTo 100L) {
                result= (i*j).toString()
                if (result == result.reversed()) {
                    if ((i * j) > max) {
                        max = (i * j)
                    }

                }
            }
        }
        print(max)
    }
}