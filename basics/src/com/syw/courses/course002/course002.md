
### 包的声明

```kotlin
package com.syw.courses.course002
```
kotlin中的包的声明和java中的声明一样，可以去掉尾部的分号，基本没有区别。

### 函数的声明

```kotlin
fun sum(a: Int, b: Int): Int {  // Int 参数，返回值 Int
    return a + b
}
```
函数定义使用关键字fun，参数格式为： 参数：类型

```kotlin
fun sum2(a: Int, b: Int) = a + b
```
表达式作为函数体，返回类型自动推断

```kotlin
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}
```
无返回值的函数(类似Java中的void)

```kotlin
fun printSum2(a: Int, b: Int) {
    print(a + b)
}
```
如果是返回 Unit类型，则可以省略

```kotlin
fun vars(vararg v:Int){
    for(vt in v){
        println(vt)
    }
}
```
函数的变长参数可以用 vararg 关键字进行标识

### 常量和变量的定义
可变变量定义：var 关键字
> var <标识符> : <类型> = <初始化值>

不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)

> val <标识符> : <类型> = <初始化值>

```kotlin
val a: Int = 1 //定义一个常量
val b = 1   //可以自动推断常量类型
```

```kotlin
var x: Int = 6
var y = 5   //自动类型推断
```

常量与变量都可以没有初始化值,但是在引用前必须初始化
编译器支持自动类型判断,即声明时可以不指定类型,由编译器判断。

### 字符串模板
```kotlin
var m = 1
//模板中的简单名称
val s1 = "m is $m"
```

```kotlin
var n = 2
//模板中可以使用任意表达式
val s2 = "${s1.replace("is", "was")}, but now is $n"

```

### 区间
区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。
区间是为任何可比较类型定义的，但对于整型原生类型，它有一个优化的实现。
```kotlin
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
```




