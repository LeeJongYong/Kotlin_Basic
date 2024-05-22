package Kotlin_Advanced

// data 키워드를 사용한 data Class는 hashCode(), toString(), copy() 등 데이터 추출을 위한 기본 함수를 제공해준다.
data class Person(val name: String, val age: Int)
//class Person(val name: String, val age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Person
//
//        if (name != other.name) return false
//        if (age != other.age) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }
//}

fun main(args: Array<String>) {

    val person1 = Person(name = "Alice", 29)
//    val person2 = Person("Alice", 29)

    // equals()
    // data class를 선언하게 되면 equals를 제공하므로 false이던 동등비교 결과가 true로 변한다.
//    println(person1 == person2)
//    println(person1.equals(person2))

    val set = hashSetOf(person1)
    println(set.contains(person1))

    // copy()
    // 객체의 불변성 유지 가능
    // 새로운 객체를 생성한다.
//    person1.name = "strange"
//    println(set.contains(person1))
    val person3 = person1.copy("strange")
    println(person3)

    // component()
    // 클래스 프로퍼티의 개수와 동일하게 생성되고 프로퍼티 순서대로 매핑된다.
    println("이름 : ${person1.component1()}, 나이 : ${person1.component2()}")

    // 구조분의 할당
    // 클래스 선언 후 역으로 변수에 할당해줄 수 있다.
    val (name, age) = person1

}