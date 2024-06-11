package Kotlin_Advanced

// 참고
// https://todaycode.tistory.com/176

// 확장함수를 사용할 때
// 확장할 함수를 선언하고 뒤에 클래스명을 선언한다.
fun String.first() : Char{
    return this[0]
}

fun String.addFirst(char: Char): String{
    return char + this.substring(startIndex = 0)
}

/*fun main(){
    println("ABCD".first())

    println("ABCD".addFirst('Z'))
}*/

class MyExample{
    fun printMessage() = println("클래스 출력하기")
}

fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull(){
    if(this == null) println("널인 경우 출력")
    else println("널이 아닌경우 출력")
}

fun main(){
    MyExample().printMessage()
    MyExample().printMessage("확장출력")

    var myExample : MyExample ?= null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
}