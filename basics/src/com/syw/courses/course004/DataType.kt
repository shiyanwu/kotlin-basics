package com.syw.courses.course004

/**
 * Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。
 * 不同于Java的是，字符不属于数值类型，是一个独立的数据类型。
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 */

fun main(args: Array<String>) {
    /**
     * 所有类型的字面常量
     * 十进制：123
     * 长整型以大写的 L 结尾：123L
     * 16 进制以 0x 开头：0x0F
     * 2 进制以 0b 开头：0b00001011
     * 注意：8进制不支持
     *
     * Kotlin 同时也支持传统符号表示的浮点数值：
     * Doubles 默认写法: 123.5, 123.5e10
     * Floats 使用 f 或者 F 后缀：123.5f
     */

    //也可以使用下划线使数字常量更易读，表示如下：
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

    /**
     * 比较两个数字
     * kotlin中没有基础数据类型，只有封装的数字类型。
     * 每一个定义的变量，其实kotlin帮你封装了一个对象，这样可以保证不会出现空指针。
     * 数字类型也是一样的，所以在比较两个数字的时候，就有比较数据大小和比较两个对象是否相同的区别了。
     * 在kotlin中，三个等号表示比较对象地址，两个==表示比较两个值的大小
     *
     */
    val a: Int = 10000
    println(a === a) // true，值相等，对象地址相等

    //经过了装箱，创建了两个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    //虽然经过了装箱，但是值是相等的，都是10000
    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
    println(boxedA == anotherBoxedA) // true，值相等

}