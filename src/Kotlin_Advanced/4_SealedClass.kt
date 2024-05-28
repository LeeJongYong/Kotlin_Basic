package Kotlin_Advanced

import org.intellij.lang.annotations.Language

/*
* sealed class는 하위 클래스를 제한된 조건에 따라서 정의해야 한다.
* 제한된 조건 : 같은 패키지 또는 같은 모듈 안에 있을 때만 상속할 수 있다.
* */
//abstract class Developer{
sealed class Developer{
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String): Developer(){
    override fun code(language: String) {
        println("저는 백엔드 개발자이고, 주 언어는 ${language}입니다.")
    }
}

data class FrontendDeveloper(override val name: String): Developer(){
    override fun code(language: String) {
        println("저는 프론트엔드 개발자이고, 주 언어는 ${language}입니다.")
    }
}

// 싱글톤 객체
object DeveloperPool{
    val pool = mutableMapOf<String, Developer>()

    /*
    * 1. sealed class는 컴파일러가 해당 클래스를 상속받은 게 어떤 것들이 있는지 판단하고
    * 그에 따라 조건문 안에서 else를 사용하지 않아도 에러가 발생하지 않는다.
    *
    * 2. sealed class는 하위 클래스가 추가될 때
    * when식 안에서 추가하지 않으면 에러가 발생한다.
    * */
    fun add(developer:Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자입니다.")
//        else -> {
//            println("지원하지 않는 개발자입니다.")
//        }
    }

    fun get(name: String) = pool[name]
}

object OtherDeveloper: Developer(){
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}

fun main(){
    val backendDeveloper = BackendDeveloper("종용")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper("영수")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("종용"))
    println(DeveloperPool.get("영수"))

}