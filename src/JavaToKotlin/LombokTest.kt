package JavaToKotlin

fun main(args: Array<String>) {

    val hero2 = Hero()

    // java lombok이 kotlin에서 정상작동하지 않음
    // java에서 lobmok을 제거 후 getter/setter 메서드를 사용 시 프로퍼티로 접근이 가능
    hero2.name = "아이언맨"
    println(hero2.name)
//    hero2.address = "스타크타워"
//    println(hero2.address)

    val hero3 = HeroKT(name="아이언맨", age=53, address="스타크타워")
    println(hero3)
}