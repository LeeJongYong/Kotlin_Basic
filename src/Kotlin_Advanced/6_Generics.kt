package Kotlin_Advanced

// 참고
// https://jaeyeong951.medium.com/kotlin-in-n-out-variance-%EB%B3%80%EC%84%B1-69204cbf27a1

// out 키워드를 사용하여 공변성을 구현할 수 있다.
// 공변성: 실제 클래스 계층 그대로 하위 타입 관계를 유지한 채 사용할 수 있게 해준다.
class MyGeneric<out T> (val t: T) {

}

fun main(args: Array<String>) {
    // 제네릭을 이용한 인스턴스를 만들기 위해서는 typeArgument를 제공해야한다.
//    val generics = MyGeneric<String>("테스트")

    // 생성자에서 먼저 type이 선언되어 있으면 컴파일러가 해당 type을 인식 할 수 있다.(생략가능)
//    val generics = MyGeneric("테스트")

    // 변수 타입에 제네릭을 사용한 케이스
//    val list1: MutableList<String> = mutableListOf()

    //typeArgument를 생성자에서 추가
//    val list2 = mutableListOf<String>()

    // star projection
    // 어떤 type이 들어올 지 알 수 없을 때 안전하게 사용하기 위해 사용하며
    // 한번 타입이 정해지면 이후에는 해당 타입만 받을 수 있다.
//    val list3: List<*> = listOf("테스트")
//    val list4: List<*> = listOf(1,2,3,4)

    // PECS(Producer-Extends, Cusumer-Super)
    // 공변성은 Java Generic의 Extends 코틀린에서는 out
    // 반공변성은 Java Generic의 Super 코틀린에서는 in
    val generics = MyGeneric<String>("테스트")
    val charGenerics: MyGeneric<CharSequence> = generics

    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1","2"), mutableListOf<String>("3","4"))
}

// in 키워드를 사용하면 반공변성을 구현할 수 있다.
// 반공변성: 실제 클래스 계층으로는 하위 클래스가 반대로 상위 클래스가 되는 개념
class Bag<T>{
    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ){
        to.addAll(from)
    }
}