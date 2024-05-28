package Kotlin_Advanced

import java.time.LocalDateTime

// object 키워드를 사용하는 것만으로 싱클톤 객체를 생성할 수 있다.
object Singleton {
    val a = 1234

    fun printA() = println(a)
}

/*fun main(args: Array<String>) {

    *//*
    * 싱글톤을 호출할 때는
    * 1. Java와 같이 클래스명.프로퍼티명
    * 2. 클래스명.함수
    * 형태로 호출 가능하다.
    * *//*
    println(Singleton.a)
    Singleton.printA()
}*/

object DatetimeUtils {
    val now: LocalDateTime = LocalDateTime.now()

    // const 키워드 사용한 변수를 상수로 선언된다.
    // 상수명은 대문자 명명을 기본으로 한다.
    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean{
        return a == b
    }
}

/*
fun main(args: Array<String>) {

    println(DatetimeUtils.now)
    println(DatetimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DatetimeUtils.same(now, now))
}*/

class MyClass {

    private constructor()

    // companion object 키워드를 사용하여 동반객체를 생성할 수 있다.
    companion object MyCompanion {
        val a = 1234

        fun newInstance() = MyClass()
    }
}

fun main() {
    println(MyClass.a)
    println(MyClass.newInstance())

    // companion 객체는 Companion 키워드를 사용하여 접근할 수 있다.(생략도 가능)
    // 동반객체에 이름(MyCompanion)을 부여하면 접근할 때도 이름을 선언해줘야 한다.(생략도 가능)
    println(MyClass.a)
    println(MyClass.newInstance())
}