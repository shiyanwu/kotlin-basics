package com.syw.courses.course005

fun main(args: Array<String>) {
    //if表达式 一个if语句包含一个布尔表达式和一条或者多条语句

    // 传统用法
    var max = 1
    var a = 2
    var b = 4

    if (a < b) max = b

    // 使用 else
    var max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }

    // 作为表达式
    val max3 = if (a > b) a else b

    //我们也可以把 IF 表达式的结果赋值给一个变量。
    val max4 = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }


}