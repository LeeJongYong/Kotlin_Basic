package Kotlin_Basic

// enum(열거형) 함수 선언 시 앞에 키워드르 붙인다.
// Java와 다르게 class 키워드를 붙여줘야한다.
enum class PaymentStatus(val label:String): Payable {
    UNPAID("미지급"){
        override fun isPayable(): Boolean = true
    },
    PAID("지급완료"){
        override fun isPayable(): Boolean = false
    },
    FAILED("지급실패"){
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불"){
        override fun isPayable(): Boolean = false
    };
    // 함수 구현 시 프로퍼티 마지막에 ;를 붙여줘야한다.

//    fun isPayable() = false
//    abstract fun isPayable(): Boolean
}

// 재사용성, 유지보수성을 위해 interface 분리 구현하는것이 좋다.
interface Payable {
    abstract fun isPayable(): Boolean
}

fun main(args:Array<String>){
    println(PaymentStatus.UNPAID.label)

    if (PaymentStatus.UNPAID.isPayable()) {
        println(PaymentStatus.UNPAID.isPayable())
    }

    // valueOf : enum class 프로퍼티의 인스턴스화
    var paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    // 동등성 비교
    if (paymentStatus == PaymentStatus.PAID) println("결제 완료 상태")

    // values : 상수들의 리스트를 가져올 수 있다.
    // 기본 프로퍼티 : name(상수명), ordinal(순서)
    for (status in PaymentStatus.values()){
        println("[${status.name}](${status.label}) - ${status.ordinal}")
    }

}