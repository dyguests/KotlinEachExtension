fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)

    list.forEach { it.println() }

    list.each.println()
    list each ::println
}

private infix fun <E> List<E>.each(block: E.() -> Unit) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun Int.println() {
    println(this)
}
