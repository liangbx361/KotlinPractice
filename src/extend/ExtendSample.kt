package extend

/**
 * Created by liangbx on 2018/3/8.
 * 扩展函数是允许对一个类的方法进行扩充，添加新方法（不需要JAVA中的继承写法）
 * 缺点：不能覆盖原有的方法
 */
fun main(args: Array<String>) {
    val user = User()
    user.setName("dog")
    user.setName()
    User().setAge(10)
    User().setName("dog")

    user.ageValue = 18
    println(user.ageValue)
}

class User {
    // 属性也可进行扩展
    var mValue = 0

    fun setName(name : String) {
        println("name is $name")
    }
}

// 扩展新函数
fun User.setAge(age : Int) {
    println("age is $age")
}

// 扩展同名函数
fun User.setName() {
    println("name is extend")
}

// 扩展同步同参数（无效）
fun User.setName(name: String) {
    println("extend name is $name")
}

//扩展属性 添加一个ageValue 属性
var User.ageValue: Int
    get() = mValue
    set(ageValue) {
        mValue = ageValue
    }



