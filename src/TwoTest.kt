object TwoTest {
    @JvmStatic
    fun main(argus: Array<String>) {
        var startOne = 1L
        var startTwo = 2L
        var count = startTwo
        var end = startOne + startTwo
        while (true) {
            if (end > 4000000) {
                break
            }
            if (end % 2L == 0L) {
                count += end
            }
            startOne = startTwo
            startTwo = end
            end = startOne + startTwo
        }
        print(count)
    }
}