package com.fanhl.ktssugar

fun main(args: Array<String>) {
    val list = listOf(A("a"), A("c"), A("c"))

    list.each.print()
}

private fun Int.println() {
    println(this)
}

class A(val s: String = "none") {
    fun print() {
        println(s)
    }
}