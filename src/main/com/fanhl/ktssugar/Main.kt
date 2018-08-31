package com.fanhl.ktssugar

fun main(args: Array<String>) {
    val list = listOf(A("a"), A("c"), A("c"))

    list.each.print()
}

private fun Int.println() {
    println(this)
}

interface IA{
    fun print()
}

class A(val s: String = "none"):IA {
    override fun print() {
        println(s)
    }
}