package Kotlin_Advanced

/*
* apply
* 1. this 키워드 사용
* 2. 수신 프로퍼티를 구성하고 수신 객체를 리턴할 때 사용
* 3. 내부 코드 반환이 아닌 해당 객체를 리턴함
* */

fun main(){
//    val connected: Boolean = DatabaseClient().run{
//        this.url = "localhost:8080"
//        username = "mysql"
//        password = "1234"
//        connect()
//    }
//    println(connected)

    val client: DatabaseClient = DatabaseClient().apply{
        this.url = "localhost:8080"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(client)

    client.connect().run{ println(this) }
}