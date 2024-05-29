package Kotlin_Advanced

class LateInit{
    // lateinit은 항상 notNull.
    lateinit var text: String

    fun printText(){
//        text = "안녕"
//        println(text)

        // 초기화를 먼저 해주지 않아도 컴파일 에러는 안 뜨지만 실행할 경우 exception이 발생한다.
//        println(text)
//        text = "안녕"

        // is
        if(this::text.isInitialized){
            println("초기화 됐음")
        }else{
            text = "안녕"
        }
        println(text)
    }
}

fun main(){

    val text = LateInit()
    text.printText()
}