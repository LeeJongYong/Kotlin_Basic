package Kotlin_Basic

fun main() {
    //  Kotlin 변수 선언
    val a : Int = 1
    val b = 2

    val c : Int
    c = 3

    // val(value)       - 불변변수
    // var(variable)    - 가변변수

    val e : String = "Hello"
    //e = "World"       - 불변변수이므로 값 변경X

    var f = 123
    //f = "World"       - 가변변수여도 데이터 타입이 다르면 값 변경X

    println("Top level : " + z)

}


// 탑 레벨 변수  - 클래스 밖에서도 선언가능
var z = 24