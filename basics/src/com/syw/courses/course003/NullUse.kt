package com.syw.courses.course003

fun main(args: Array<String>) {

    /**
     * Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，有两种处理方式，字段后加!!像Java一样抛出空异常，另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
     */

    //类型后面加?表示可为空
    var age: String? = null

    //这种写法会抛出空指针异常
    val ages = age!!.toInt()

    //为空时返回null
    val age1 = age?.toInt()

    //为空时返回-1
    val age2 = age?.toInt() ?: -1


}

/**
 * 当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null
 */
fun parseInt(str: String): Int? {
    // ...
    return 0
}