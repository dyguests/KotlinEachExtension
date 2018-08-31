package com.fanhl.ktssugar

fun main(args: Array<String>) {
    val list = listOf<IA>(A("a"), A("b"), A("c"))

    list.each.print()
}

interface IA {
    fun print()
}

class A(val s: String = "none") : IA {
    override fun print() {
        println(s)
    }
}