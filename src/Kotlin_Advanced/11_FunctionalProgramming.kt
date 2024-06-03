package Kotlin_Advanced

fun main(){

//    val list = mutableListOf(printHello)

    // 함수를 호출할 때는 () 함수 실행 표기법을 사용해야 한다.
//    list[0]
//    list[0]()

//    val func: () -> Unit = list[0]
//    func()

//    call(printHello)

    println("=============================================")
    // 함수를 인스턴스 화 하지 않으면 인자로 넘기거나 값처럼 사용할 수 없다.
//    val func3 = printNo
//    val list2 = mutableListOf(printNo)
//    call(printNo)

    println("=============================================")
    // 단일 param처리 function
//    printMsg("Hello world")

    println("=============================================")
    // 다중 param처리 function
//    println(plus2(3, 5))
//    println(plus3(3, 5, 7))

    println("=============================================")
    // 고차함수
    val list3 = listOf("a", "b", "c")
    val printStr: (String) -> Unit = { println(it) }
//    forEachStr(list3, printStr)
    list3.forEach(printStr)

    val upperCase : (String) -> String = { it.uppercase() }
    println(list3.map(upperCase))

    println("=============================================")
    // 익명함수
    outerFunc()     // 출력 값 없음
    val func3 = outerFunc()
    func3()         // 출력 O
    val func4 = outerFunc2()
    func4()
    val func5 = outerFunc3()
    func5()

    println("=============================================")
    // 후행 람다 전달 : 함수 마지막 param이 함수인 경우 사용 가능
    // param이 1개일 경우 it 소프트키워드 사용가능
    val list4 = listOf("a", "b", "c")
    val printStr2: (String) -> Unit = { println(it) }
    forEachStr(list4) { println(it.length) }
    list4.forEach(printStr2)
    println(list4.filter { it == "a" })

    arg1{
        it.length
        it.first()
    }

    arg2{ a, b ->
//        it.length         : param이 2개일 경우 it 키워드 사용 불가
        a.length
        b.first()
    }

    println("=============================================")
    // :: - 람다 레퍼런스 (top레벨 또는 local 함수일 경우 사용 가능)
    val callRef: () -> Unit = { printHello() }
    val callRef2 = ::printHello
    callRef()
    callRef2()()

    val numList = listOf("1", "2", "3", "4")
    numList.map { it.toInt() }.forEach { println(it) }
    numList.map(String::toInt).forEach(::print)

}

// 함수의 인스턴스 화
//val func: () -> Unit = {}
//val func2: () -> String = { "" }

val printHello: () -> Unit = { println("Hello") }
fun printNo() = println("No !")

// 함수를 param으로 받아서 실행하는 함수
fun call(block: () -> Unit){
    block()         // 함수를 사용할 때는 함수 실행 표기법 사용!!!
}

/*
* 단일 param function
* 1. param 타입: String
* 2. return 타입: Unit(void)
* 3. function 내부에서 param의 값은 String 타입
* */
val printMsg: (String) -> Unit = { msg: String -> println(msg) }
// param의 타입이 String으로 선언되어 있어서 function 내부에서 param의 타입을 재정의 하지 않아도 된다.
val printMsg2: (String) -> Unit = { msg -> println(msg) }
// it 소프트키워드를 사용하여 param을 바로 처리 가능하다.
val printMsg3: (String) -> Unit = { println(it) }

/*
* 다중 param function
* 1. param 타입: Int, Int
* 2. return 타입: Int
* 3. function 내부에서 두 param 값의 더하기 처리
* */
val plus2: (Int, Int) -> Int = { a, b -> a + b }
val plus3: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }

/*
* 고차함수
* String collection을 param으로 받아서 처리하는 function
* 1. param 타입: String collection | function
* 2. return 타입:
* 3. String collection param을 function param으로 처리
* */
fun forEachStr(collection: Collection<String>, action: (String) -> Unit ){
    for (item in collection){
        action(item)
    }
}

/*
* 익명함수
* */
fun outerFunc() : () -> Unit {
    return fun(){
        println("this is outer func")
    }
}
/*
* 익명함수 : 람다식으로 구현가능
* */
fun outerFunc2(): () -> Unit {
    return { println("this is outer func2") }
}
fun outerFunc3(): () -> Unit = { println("this is outer func3") }

/*람다식 구현*/
// 람다 전체식
val sum: (Int, Int) -> Int= { x: Int, y: Int -> x + y }
// 람다 간소화식 : param의 타입을 1번은 선언해줘야 한다.
val sum2: (Int, Int) -> Int = { x, y -> x + y }
val sum3 = { x: Int, y: Int -> x + y }
//val sum4 = {x, y -> x + y} : 타입 X

fun arg1(block: (String) -> Unit){}
fun arg2(block: (String, String) -> Unit){}
