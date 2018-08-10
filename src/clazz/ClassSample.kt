package clazz

/**
 * 构造函数跟随在类名的后面
 */
class ClassSample constructor(name: String = "kotlin") {

    // 初始化模块
    init {
        println(name)
    }

    // 次构造方法
    constructor(name: String, age: Int) : this(name) {
        println(age)
    }

    var name : String = ""
}

fun main(args: Array<String>) {

    // 调用默认值 kotlin (不推荐，可读性差)
    ClassSample()

    // 调用默认
    ClassSample("xiaoming")

    // 调用次构造方法
    ClassSample("male", 10)
}