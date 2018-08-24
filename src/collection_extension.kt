val <T> Iterable<T>.each: T
    get() {
        val iterator = this.iterator()
        return iterator.next()
    }