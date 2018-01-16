package com.syw.courses.course002

// Int 参数，返回值 Int
fun sum(a: Int, b: Int): Int {
    return a + b
}

//表达式作为函数体，返回类型自动推断
fun sum2(a: Int, b: Int) = a + b


//无返回值的函数(类似Java中的void)
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

// 如果是返回 Unit类型，则可以省略
fun printSum2(a: Int, b: Int) {
    print(a + b)
}

//函数的变长参数可以用 vararg 关键字进行标识
fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}

//定义常量和变量
val a: Int = 1
val b = 1   //系统会自动推断类型为Int

//这个地方是会报错的,常量必须初始化
/*val c: Int*/
/*c = 1*/

//声明变量
var x: Int = 6
var y = 5


/**
 * 字符串模板
 * $ 表示一个变量名或者变量值
 * $varName 表示变量值
 * ${varName.fun()} 表示变量的方法返回值:
 */

var m = 1

//模板中的简单名称
val s1 = "m is $m"

var n = 2
//模板中可以使用任意表达式
val s2 = "${s1.replace("is", "was")}, but now is $n"

// 测试
fun main(args: Array<String>) {
    vars(1, 2, 3, 4, 5)  // 输出12345

    //测试lambda表达式
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))  // 输出 3

    println(s1)
    println(s2)

    //区间
    for (i in 1..4) print(i) // 输出“1234”

    for (i in 4..1) print(i) // 什么都不输出

    var j  = 5
    if (j in 1..10) { // 等同于 1 <= i && i <= 10
        println(j)
    }

    // 使用 step 指定步长
    for (i in 1..4 step 2) print(i) // 输出“13”

    for (i in 4 downTo 1 step 2) print(i) // 输出“42”


    // 使用 until 函数排除结束元素
    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
        println(i)
    }
}
