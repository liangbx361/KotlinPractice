package clazz

/**
 * JavaBean 的实现
 */
data class pojo(var name: String, var age: Int)

fun main(args: Array<String>) {
    val bean = pojo("a", 10)
    // 自动生成toString方法
    println(bean)

    println(bean.age)
    println(bean.name)
}
