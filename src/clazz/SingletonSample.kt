package clazz

import extend.User

/**
 * Created by liangbx on 2018/8/10.
 * 参考：http://johnnyshieh.me/posts/kotlin-singleton-pattern/
 */
/**
 * 懒汉模式创建(线程安全)
 */
object Singleton1 {
    fun getInstance() : User {
        return User();
    }
}

/**
 * 饿汉模式创建(线程安全)
 */
class Singleton2 private constructor() {
    companion object {
        val instance: Singleton2 by lazy { Singleton2() }
    }
}

fun main(args: Array<String>) {
    Singleton1.getInstance().setName("xx")
}