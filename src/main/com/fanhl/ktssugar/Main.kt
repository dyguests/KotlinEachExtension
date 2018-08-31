package com.fanhl.ktssugar

fun main(args: Array<String>) {
    listOf<IA>(A("a"), A("b"), A("c")).each.print()
}

interface IA {
    fun print()
}

class A(val s: String = "none") : IA {
    override fun print() {
        println(s)
    }
}