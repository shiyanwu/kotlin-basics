package com.syw.courses.course004

/**
 * 由于不同的表示方式，较小类型并不是较大类型的子类型，较小的类型不能隐式转换为较大的类型。
 * 这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。
 */
fun main(args: Array<String>) {

    val b: Byte = 1 // OK, 字面值是静态检测的
    val i: Int = b.toInt() // OK (这里不会隐式的进行转换)

    //有些情况下也是可以使用自动类型转化的，前提是可以根据上下文环境推断出正确的数据类型而且数学操作符会做相应的重载。
    val l = 1L + 3 // Long + Int => Long

    /**
     * 对于Int和Long类型，还有一系列的位操作符可以使用，分别是：
     * shl(bits) – 左移位 (Java’s <<)
     * shr(bits) – 右移位 (Java’s >>)
     * ushr(bits) – 无符号右移位 (Java’s >>>)
     * and(bits) – 与
     * or(bits) – 或
     * xor(bits) – 异或
     * inv() – 反向
     */

    /**
     * 和 Java 不一样，Kotlin 中的 Char 不能直接和数字操作，Char 必需是单引号''包含起来的。
     * 比如普通字符 '0'，'a'。
     * 字符字面值用单引号括起来: '1'。 特殊字符可以用反斜杠转义。 支
     * 持这几个转义序列：\t、 \b、\n、\r、\'、\"、\\ 和 \$。
     * 编码其他字符要用 Unicode 转义序列语法：'\uFF00'。
     * 当需要可空引用时，像数字、字符会被装箱。装箱操作不会保留同一性。
     */

    /**
     * 显式的将字符串转换为Int数字
     */
    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // 显式转换为数字
    }

    /**
     * 布尔用 Boolean 类型表示，它有两个值：true 和 false。
     * 若需要可空引用布尔会被装箱。
     * 内置的布尔运算有：
     * || – 短路逻辑或
     * && – 短路逻辑与
     * ! - 逻辑非
     */


    /**
     * 数组用类 Array 实现，并且还有一个 size 属性及 get 和 set 方法，由于使用 [] 重载了 get 和 set 方法，所以我们可以通过下标很方便的获取或者设置数组对应位置的值。
     * 注意: 与 Java 不同的是，Kotlin 中数组是不型变的（invariant）。
     * 数组的创建两种方式：一种是使用函数arrayOf()；另外一种是使用工厂函数。
     * 如下所示，我们分别是两种方式创建了两个数组：
     */

    //[1,2,3]
    val arr1 = arrayOf(1, 2, 3)
    //[0,2,4]
    val arr2 = Array(3, { i -> (i * 2) })

    println(arr1[0])    // 输出结果：1
    println(arr2[1])    // 输出结果：2

    /**
     * 除了类Array，还有ByteArray, ShortArray, IntArray，用来表示各个类型的数组，省去了装箱操作，因此效率更高，其用法同Array一样
     */
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]

    /**
     * 和 Java 一样，String 是可不变的。方括号 [] 语法可以很方便的获取字符串中的某个字符，也可以通过 for 循环来遍历：
     */

    //Kotlin 支持三个引号 """ 扩起来的字符串，支持多行字符串，比如：
    val text = """
    多行字符串
    多行字符串
    """
    println(text)   // 输出有一些前置空格

    /**
     * String 可以通过 trimMargin() 方法来删除多余的空白。
     */
    val text2 = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text2)    // 前置空格删除了

    /**
     * 默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")。
     */
    val text3 = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin(">")
    println(text3)

}
