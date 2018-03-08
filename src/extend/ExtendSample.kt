package extend

/**
 * Created by liangbx on 2018/3/8.
 * 扩展函数是允许对一个类的方法进行扩充，添加新方法（不需要JAVA中的继承写法）
 * 缺点：不能覆盖原有的方法
 */
fun main(args: Array<String>) {
    A().setName("dog")
    A().setName()
    A().setAge(10)

    // 扩展相同方法（无效）
    fun A.setName(name: String) {
        println("extend name is $name")
    }
    A().setName("dog")
}

class A {

    fun setName(name : String) {
        println("name is $name");
    }
}

// 扩展新函数
fun A.setAge(age : Int) {
    println("age is $age")
}

// 扩展同名函数
fun A.setName() {
    println("name is extend")
}


