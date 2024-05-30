package Kotlin_Advanced

fun getStr(): Nothing = throw Exception("예외발생 기본 값 초기화")

fun main(){
//    val res = try{
//        getStr()
//    }catch(e:Exception){
//        println(e.message)
//        "기본값"
//    }

    // runCatching을 사용할 때
    // .getOrElse{} : 성공 시 구문 실행 / 실패 시 else 구문 마지막 코드를 리턴.
//    val res = runCatching { getStr() }
//        .getOrElse {
//            println(it.message)
//            "기본값"
//        }

    // .getOrNull : exception 발생 시 null이 리턴.
//    val res = runCatching { getStr() }
//        .getOrNull()

    // .exceptionOrNull : 성공 시 null 리턴 / 실패 시 exception 발생.
//    val res = runCatching { getStr() }
//        .exceptionOrNull()
//
//    res?.let{
//        println(it.message)
//        throw it
//    }

    // .getOrDefault : 성공 시 구문 실행 / 실패 시 default 값 리턴.
//    val res = runCatching { getStr() }
//        .getOrDefault("기본 값")

    // .getOrThrow : 성공 시 구문 실행 / 실패 시 예외 발생.
//    val res: String = runCatching {
//        "성공"
//        getStr()
//    }.getOrThrow()

    // .map : 성공 시 구문을 it으로 접근 가능
//    val res = runCatching { "안녕" }
//        .map {
//            "${it}하세요"
//        }.getOrThrow()

    // .mapCatching : .map 안에서 exception이 발생하더라도 예외 발생을 줄일 수 있다.
//    val res = runCatching { "안녕" }
//        .mapCatching {
//            throw Exception("예외")
//        }.getOrDefault("기본 값")

    // .recover : 성공 시 runCatcing 구문 실행 / 실패 시 recover 구문 수행
//    val res = runCatching { getStr() }
//        .recover { "복구" }
//        .getOrNull()

        val res = runCatching { getStr() }
        .recoverCatching { throw Exception("예외 발생") }
        .getOrDefault("recover 예외 방어")
    
    println(res)



}