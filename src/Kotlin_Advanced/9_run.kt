package Kotlin_Advanced
/*
* run
* 1. this 키워드 사용
* 2. 함수 결과 반환 O
* */
class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    fun connect(): Boolean{
        println("Connecting to database")
        Thread.sleep(1000)
        println("Connected")
        return true
    }
}

fun main() {
//    val config = DatabaseClient()
//    config.url = "localhost:8080"
//    config.username = "mysql"
//    config.password = "1234"
//    val connected = config.connect()

    val connected: Boolean = DatabaseClient().run{
        this.url = "localhost:8080"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(connected)

    val res: Boolean = with(DatabaseClient()) {
        this.url = "localhost:8080"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(res)
}