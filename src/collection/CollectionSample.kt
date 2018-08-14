package collection

/**
* Created by liangbx on 2018/8/14.
*/
fun main(args: Array<String>) {
    // List、Set、Map 包含可变和不可变两种类型

    // 只读
    val readOnlyList : List<Int> = listOf(1, 2, 3)
    println(readOnlyList)
    println(readOnlyList[0])

    // 可写
    val writeableList : MutableList<Int> = mutableListOf()
    writeableList.add(1)
    writeableList.add(2)
    writeableList.add(3)
    writeableList.removeAt(1)
    println(writeableList)

    // 不可重复的数据集合
    val readOnlySet : Set<Int> = hashSetOf(1, 2, 3, 1, 2, 3)
    println(readOnlySet.size)

    val writeableSet : MutableSet<Int> = mutableSetOf(1, 2, 3, 1, 2, 3)
    writeableSet.remove(1)
    println(writeableSet)

    //
    val readOnlyMap : HashMap<String, Int> = hashMapOf("1" to 1, "2" to 2, "3" to 3)
    println(readOnlyMap["1"])

    val writeableMap : MutableMap<String, Int> = mutableMapOf("1" to 1, "2" to 2, "3" to 3)
    writeableMap.remove("2")
    println(writeableList)
}