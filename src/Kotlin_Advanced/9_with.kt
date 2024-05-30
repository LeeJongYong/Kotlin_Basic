package Kotlin_Advanced

/*
* with
* 1. this 키워드 사용
* 2. 함수 결과 반환 O
* 3. 접근 객체의 내부 함수 사용 가능
* */

fun main(){
    val str = "안녕하세요"
    val length: Int = with(str){
        println("length = $length")
        length
    }
    println(length)
}