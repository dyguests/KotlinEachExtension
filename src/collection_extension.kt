import java.lang.reflect.Proxy

inline val <reified T> Iterable<T>.each: T
    get() {
        val iterator = this.iterator()

        val clazz = T::class.java

        iterator.forEach { }

//        Proxy.newProxyInstance(clazz.classLoader)



        return clazz.newInstance()
    }

