package Kotlin_Advanced

/*
* let
* 1. it 소프트 키워드 사용
* 2. 함수 결과 반환 O
* 3. let 내부에서 let을 사용할 수 있음
* */

fun main(){
    // nullable 변수 사용
    val str: String? = null

    // let : null이 아닌경우만 함수 실행
    str?.let {
        println(it)
    }

    val str2: String? = "Hi"
    val res: Int? = str2?.let {
        println(it)

        val tmp: String? = "abc"
        tmp?.let{
            val tmp2: String? = "def"
            tmp2?.let{
                println("tmp1, tmp2가 모두 null이 아님")
            }
        }

        1234
    }
    println(res)
}