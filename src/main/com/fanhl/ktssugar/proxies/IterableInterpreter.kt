package com.fanhl.ktssugar.proxies

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class IterableInterpreter<out T>(val iterable: Iterable<T>) : InvocationHandler {

    @Throws(Throwable::class)
    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any? {
        return null
    }
}
