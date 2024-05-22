package Kotlin_Basic

fun main(args:Array<String>){

    // Kotlin은 CheckedException을 강제하지 않음
    Thread.sleep(1)

    // 필요하다면 try..catch를 사용할 수 있음
    try {
        Thread.sleep(10)
    } catch (e: Exception) {
        println("오류 발생!")
    }

    // finally 사용 가능
    try {
        Thread.sleep(10)
    } catch (e: Exception) {
        println("오류 발생!")
    } finally {
        println("finally 실행")
    }

    // try..catch문을 바로 변수에 할당할 수 있다.
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("오류 발생!")
    }
    println(a)

    // 강제로 Exception 발생 가능
//    throw Exception()
//    failFast("오류 발생!")
//    failFast2("오류 발생!")
    // 이전 단계에 Nothing 타입이 있으면 컴파일러가 이후 실행을 보장하지 못한다고 알려준다.
//    println("여기까지 옵니까?!")

    // Elvis 연산자와 Nothing 타입을 동시 사용할 경우 안전 연산자를 사용하지 않아도 된다.
    // Elvis 연산자와 Nothing 타입을 동시 사용할 경우 null이 발생할 수 없다.
//    val b: String? = null
    val b: String? = "null이 아니다!"
    val c = b ?: failFast2("b는 null이다!")

    println(c.length)
}

fun failFast(message: String){
    throw IllegalArgumentException(message)
}
// throw 리턴 시 Nothing 타입 리턴
// 코드가 정상 수행을 보장하지 못할 경우 Nothing을 반환해야한다.
// 함수는 리턴하는게 없을 경우 void와 유사한 unit 타입을 리턴해준다.
fun failFast2(message: String): Nothing {
    throw IllegalArgumentException(message)
}