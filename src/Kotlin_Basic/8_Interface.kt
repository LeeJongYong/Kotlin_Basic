package Kotlin_Basic

class Product(val name:String, val price: Int)

interface Wheel{
    fun roll()
}

// Kotiln의 interface는 추상함수와 default 메서드를 모두 정의할 수 있다.
interface Cart: Wheel {
    // 프로퍼티도 추상화 할 수 있다.
    var coin: Int

    val weight: String
        // interface의 경우 getter에서 "field"같은 backing field에 접근할 수 없다.
        get() = "20KG"

    // 추상함수
    fun add(product: Product)

    fun rent(){
        if (coin > 0){
            println("카트를 대여합니다")
        }
    }

    override fun roll(){
        println("카트가 굴러가요~~~")
    }

    fun printId() = println("1234")
}

interface Order {
    // interface 복수 구현 시 동일 함수가 있을 경우 호출이 안 될 수 있다.
    // default 함수
    fun add(product: Product) {
        println("${product.name} 주문이 완료됐습니다.")
    }

    fun printId() = println("5678")
}

// interface를 구현할 때는 interface뒤에 생성자()가 붙지 않는다.
// , 를 사용해서 복수 interface를 구현할 수 있다.
class Mycart(override var coin: Int): Cart, Order {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요.")
        else println("${product.name}이(가) 카트에 추가되었습니다.")

        // super키워드 뒤 <>에 interface를 선언하면 해당 interface의 함수를 호출한다.
        super<Order>.add(product)
    }

    // 복수 interface 구현 후 동일 default 함수가 있을 경우 하위 클래스에서 구현을 해줘야한다.
    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }
}

fun main(){

    val cart = Mycart(coin = 10)

    cart.rent()
    cart.roll()
    cart.add(Product("장난감", 1000))
    cart.printId()

}