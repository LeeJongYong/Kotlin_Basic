fun main(args:Array<String>){

    // 조건문 : if..else (표현식)
    // Kotiln은 삼항연산자가 없다.
    val a = "abcdef"
    var num = 0
    if (a.length == 6) num = a.length else num = 0

    // 반복문 : for/when
    // .. : 뒤의 숫자까지 반복
    for(i in 1..3){
        println("i = $i")
    }

    // until : 뒤의 숫자 이전까지 반복
    for(i in 1 until 3){
        println("i = $i")
    }

    // downTo : 점차 감소
    for(i in 5 downTo 2){
        println("i = $i")
    }

    // step : 특정 주기로 반복
    for(i in 10 downTo 1 step 2){
        println("i = $i")
    }

    // when : Java의 switch..case문과 유사
    // "," 를 통해 여러 조건을 한줄로 정의 가능
    val day = 1
    val res = when(day){
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
//        5,6,7-> "etc"
        else -> 0
    }
    println(res)

    // while : Java와 동일
    var b = 34
    while (b > 0){
        println(b)
        b = b-10
    }

}