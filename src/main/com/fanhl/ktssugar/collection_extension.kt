package com.fanhl.ktssugar

import com.fanhl.ktssugar.proxies.LinProxies

inline val <reified T> Iterable<T>.each: T
    get() {
        return LinProxies.create_each_proxy(T::class.java, this)
    }
