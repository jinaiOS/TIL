fun main() {
    helloWorld()
    println(add(2, 3))
    hi()
    printStr()
    println(max(2, 5))
}

fun helloWorld() {
    println("Hello World!")
}

fun add(a: Int, b: Int) : Int {
    return a + b
}

fun hi() {
    val a : Int = 10 // 상수
    var b : Int = 9 // 변수
    b += 10

    var name = "jina"
    println(a)
    println(b)
    println(name)
}

fun printStr() {
    val name = "jinaiOS"
    val where = "Seoul"

    println("my name is $name")
    println("${name + where}")
}

fun max(a: Int, b: Int) : Int {
    if(a>b) {
        return a
    } else {
        return b
    }
}