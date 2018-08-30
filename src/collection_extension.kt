inline val <reified T> Iterable<T>.each: T
    get() {
        val iterator = this.iterator()

        val clazz = T::class.java

        iterator.forEach {  }

        return iterator.next()
    }