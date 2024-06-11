package JavaToKotlin

// 확장함수 참고 : https://todaycode.tistory.com/176

fun String.first(): Char{
    return this[0]
}

fun String.addFirst(char: Char): String{
    return char + this.substring(0)
}

fun main(){
    println("ABCD".first())
    println("ABCD".addFirst('Z'))
}