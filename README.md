# KotlinEachExtension

kotlin syntactic sugar.

list.forEach{it.doXxx()}

能改写成如

list.each.doXxx()

的形式不？

# conclusion

Will,It's works.

    listOf<IA>(A("a"), A("b"), A("c")).each.print()

But `IA` must be interface,sad.

Hope there is a better way.

# base

[New Tricks with Dynamic Proxies in Java 8 (part 2)](https://opencredo.com/dynamic-proxies-java-part-2/)

[Java的动态代理(dynamic proxy)](https://www.cnblogs.com/techyc/p/3455950.html)