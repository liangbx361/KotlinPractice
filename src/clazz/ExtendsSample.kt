package clazz

/**
 * Created by liangbx on 2018/8/10.
 * 继承使用 :
 * 被继承的类和重写的方法需要使用 open 声明
 */
open class Fruit {
    open fun shape() {}
}

class Apple : Fruit() {
    override fun shape() {
        super.shape()
    }
}



