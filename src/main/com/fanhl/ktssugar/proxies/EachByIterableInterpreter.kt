package com.fanhl.ktssugar.proxies

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * 专门用来代理 Iterable.foreach{}
 */
class EachByIterableInterpreter<out T>(private val iterable: Iterable<T>) : InvocationHandler {

    @Throws(Throwable::class)
    override fun invoke(proxy: Any?, method: Method?, args: Array<Any>?): Any? {
//        println("--before running...")
        var result: Any? = null
        iterable.forEach {
            result = if (args != null) {
                method?.invoke(it, args)
            } else {
                method?.invoke(it)
            }
        }
//        println("--after running...")

        return result
    }
}
