package Kotlin_Advanced

// 참고(Pair 사용하면 안 되는 이유)
// https://velog.io/@wjdcogus6/Kotlin-Pair-%EB%82%98%EB%A7%8C-%EB%AA%B0%EB%9E%90%EC%9D%84%EC%A7%80%EB%8F%84-%EB%AA%A8%EB%A5%B4%EB%8A%94-%EC%9D%B4%EC%95%BC%EA%B8%B0

// f((1,2)) = 1 + 2 = 3
// f(1,2) = 1 + 2 = 3

//data class Tuple(val a: Int, val b: Int)
//fun plus(tuple: Tuple) = tuple.a + tuple.b

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main(){
//    println(plus(1,2))

//    var plus = plus(Tuple(1,5))
//    println(plus)

    val plus = plus(Pair(1,4))
    println(plus)

    val pair = Pair("A",3)
//    pair.first = "B"              -- pair Function의 인자 값은 val(불변)이다.

    val newPair = pair.copy(first = "B")
    println(newPair)

    // component로 인자값 접근이 가능하다.
    val second = newPair.component2()
    println(second)

    // toList()는 immutable로 값 변경이 불가하다.
    val listPair = newPair.toList()
//    listPair.add()

    // Triple도 Pair와 같이 불변성 속성을 갖고 있다.
    val triple = Triple("A","B","C")
    println(triple)
    triple.first
    triple.second
    triple.third

    val newTriple = triple.copy(third = "Z")

    newTriple.component3()

    // 구조분해 할당 -- 튜플의 값을 한번에 여러개 변수로 초기화 할 수 있는 문법.
    val (a, b, c) = newTriple
    println("$a, $b, $c")

    val map = mutableMapOf("이종용" to "개발자")
    val map2 = mutableMapOf(Pair("이종용", "백엔드개발자"))
    for((key,value) in map2){
        println("${key}는 ${value}이다")
    }
}