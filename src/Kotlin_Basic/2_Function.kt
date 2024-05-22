package Kotlin_Basic

// Java 스타일
fun sum(a:Int, b:Int) : Int {
    return a+b
}

// 표현식 스타일
fun sum2(a:Int, b:Int) : Int = a+b

// 표현식 스타일  - 리턴타입X
fun sum3(a:Int, b:Int) = a+b

// return을 사용할 경우 리턴타입을 선언해줘야 한다.
fun sum4(a:Int, b:Int) {
//    return a+b
}

// 리턴타입이 없는 경우 Unit 타입을 반환한다.
// Java의 void와 유사
fun printSum(a:Int, b:Int) {
    println("$a + $b = ${a+b}")
}

// 디폴트 param    - param이 없을경우 디폴트 파람을 사용한다.
fun defaultParam(msg : String = "Kotlin을 시작합니다.") {
    println(msg)
}

/*fun main() {
    defaultParam()
    defaultParam("예스예스 Kotlin")
}*/

fun log(level: String = "Info" ,message: String) {
    println("[$level]$message")
}

fun main() {
    log(message = "인포 로그")
    log(level = "DEBUG", message = "디버그 로그")
    log(level = "WARN", "워닝 로그")
    log("ERROR", "에러 로그")

}