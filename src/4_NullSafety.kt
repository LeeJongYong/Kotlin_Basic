fun main(args:Array<String>){

    // ? : Nullalbe - null을 허용하게 해준다.
//    val a: String = null
    var b: String? = null
    b = null

    var a : String? = null
//    println(a.length)
    println(a?.length)

    // "?:" : Elvis 연산자 - null일 경우 우측 값을 리턴한다.
    val c = a?.length ?: 0
    println(c)

    //====================================================================

    val nullAbleStr = getNullStr()

    val nullAbleStrLength = nullAbleStr?.length ?: 0
    println(nullAbleStrLength)

    val length = getLengthIfNotNull("null인 경우 반환")
    println(length)

    // "!!" : 단언 연산자 - null이 발생하지 않는 안전한 코드라고 컴파일러에게 선언하는 방법
    val d: String? = null
    val e = d!!.length
}

fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0