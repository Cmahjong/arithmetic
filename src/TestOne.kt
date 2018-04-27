object TestOne {
    @JvmStatic
    fun main(argus: Array<String>) {
        print((1..999).filter { it % 3 == 0 || it % 5 == 0 }.sum())
    }
}