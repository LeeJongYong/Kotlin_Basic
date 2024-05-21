// Kotlin의 class는 기본적으로 final로 상속이 불가하다
// 상속을 해주기 위해선 앞에 open 키워드를 사용해주어야 한다.
open class Dog {
    open var age: Int = 0

    open fun bark(){
        println("멍멍!")
    }
}

// :(콜론) 뒤에 상속받을 클래스를 선언하면 상속된다.
// class 뒤에 () 안의 선언할 경우 초기 값이 된다.
open class Bulldog(override var age: Int = 0): Dog() {

    // override 된 프로퍼티나 함수는 자동으로 open 상태가 된다.
    // 상속받은 클래스에서 override를 못하게 하려면 final 키워드를 선언해줘야 한다.
    override fun bark() {
        println("왈!!!왈!!!")
    }
}

class ChildBulldog: Bulldog(){
    override var age: Int = 0

    override fun bark() {
        // super 키워를 사용하면 상위 클래스의 프로퍼티, 함수를 재사용할 수 있다.
        super.bark()
    }
}

// abstract 키워드를 사용하여 추상 클래스 선언이 가능하다.
abstract class Developer {
    // 프로퍼티, 함수에 abstract 키워드를 사용하여 하위 클래스에 강제성을 부여할 수 있다.
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int = 0): Developer(){

    override fun code(language: String) {
        println("my coding language is $language")
    }
}

fun main(){

    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val dog2 = ChildBulldog()
    println(dog2.age)
    dog2.bark()

    val backendDeveloper = BackendDeveloper()
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")

}
