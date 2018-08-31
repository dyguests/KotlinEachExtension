package com.fanhl.ktssugar.proxies

import com.fanhl.ktssugar.IA
import java.lang.reflect.Proxy

object LinProxies {
    /**
     * 生成一个用来实现 Iterable#foreach{}的proxy
     */
    @Suppress("UNCHECKED_CAST")
    fun <T> createEachProxy(clazz: Class<T>, iterable: Iterable<T>): T {
        val handler = EachByIterableInterpreter(iterable)
        val newProxyInstance = Proxy.newProxyInstance(
                clazz.classLoader,
                arrayOf(IA::class.java),
//                arrayOfNulls<Class<*>>(0),
                handler
        )

        return newProxyInstance as T
    }

}
