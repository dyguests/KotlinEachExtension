package com.fanhl.ktssugar.proxies

import java.lang.reflect.Proxy

object LinProxies {
    /**
     * 生成一个用来实现 Iterable#foreach{}的proxy
     */
    @Suppress("UNCHECKED_CAST")
    fun <T> createEachProxy(clazz: Class<T>, iterable: Iterable<T>): T {
        val handler = EachByIterableInterpreter(iterable)
        return Proxy.newProxyInstance(
                clazz.classLoader,
                arrayOf(clazz::class.java),
                handler
        ) as T
    }

}
