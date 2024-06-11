package JavaToKotlin

enum class CountryCodeKotlin{
    kr, jp, us, `do`;
}

fun main(args: Array<String>) {

    val javaKeyword = JavaKeyword()

    // 예약어를 변수로 사용 시 Kotlin에서는 백틱(₩)을 사용해서 사용할 수 있다.
    javaKeyword.`in`
    javaKeyword.`is`

}

