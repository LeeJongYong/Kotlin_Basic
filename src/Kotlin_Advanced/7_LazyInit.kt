package Kotlin_Advanced

// 참고
// https://velog.io/@haanbink/Kotlin-%EC%A7%80%EC%97%B0%EC%B4%88%EA%B8%B0%ED%99%94lateinit-lazy
class HelloBot{
//    var greeting: String? = null
    // by lazy 키워드를 사용하여 지연초기화를 사용할 수 있다.
    val greeting: String by lazy {
        // 사용 시점 1회만 초기화 로직이 동작한다.
        // "초기화 동작" 문구는 최초 초기화 때만 출력되고 이후에는 출력되지 않는다.
        println("초기화 동작")
        getHello()
    }

    fun sayHello() = println(greeting)

}

fun getHello() = "안녕"

fun main() {
    val helloBot = HelloBot()

    for(i in 1..5){
        Thread{
            helloBot.sayHello()
        }.start()
    }
}