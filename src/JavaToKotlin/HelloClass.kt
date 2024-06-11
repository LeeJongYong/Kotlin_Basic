package JavaToKotlin

// 참고
// https://itstory1592.tistory.com/124

class HelloClass {

    companion object {
        @JvmStatic
        fun hello() = "Hello"
    }
}

object HiObject {
    @JvmStatic
    fun hi() = "hi"
}

fun main(args: Array<String>) {

    val hello = HelloClass.hello()

    val hi = HiObject.hi()
}