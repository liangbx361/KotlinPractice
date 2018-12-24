package `null`

/**
* Created by liangbx on 2018/8/13.
*/

fun main(args: Array<String>) {
    // if not null 缩写
    val a = "Kotlin"
    // 编译报错
    // a = null
    println(a.length)

    // 声明b为可空类型
    val b: String? = null
    println(b?.length)

    // 只对非空值进行操作
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        // 输出 A 并忽略 null
        item?.let { println(it) }
    }

    // 完整的非空判断
    val l: Int = b?.length ?: -1
    // 空值返回 -1
    val j: Int = b?.length ?: -1

    // 尝试将String 类型转换为 Int, 如果使用返回null
    val aInt: Int? = a as? Int
    println(aInt)

    // 获取不为null的list
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()

    // 使用!!操作符，强制抛出NPE
    val k = b!!.length
}
