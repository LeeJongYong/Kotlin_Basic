package Kotlin_Basic/*
class Coffee constructor(val name:String){

}
*/

class Coffee(
//    val name: String
//    , val pricd: Int
//    , val brand: String
    // 후행 , 사용 시 리뷰가 용이함
    var name: String = "",
    var price: Int = 0,
    var iced: Boolean = false,
)
{
    // 자바처럼 getter, setter를 선언하지 않아도 컴파일러가 자동으로 생성해준다.
    // 생성자가 val 타입일 경우 getter만 선언된다.
    // 커스텀 getter, setter도 생성가능하다.
    val brand: String
        //get() = "스타벅스"
        get(){
            return "스타벅스"
        }

    var quantity: Int = 0
        set(value){
            if(value > 0){
                // field와 같은 식별자를 통해 해당 변수에 접근할 수 있다.
                // 식별자가 아닌 프로퍼티를 직접 할당하면 무한재귀함수가 되어 stackOverflow가 발생한다.
                field = value
            }
        }
}

// 클래스 선언 시 내용 없이도 선언 가능
class EmptyClass

fun main(args:Array<String>){

    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 4000
    coffee.quantity = 5
    coffee.iced = true

    // 자바에서 getter 메서드를 통해서 값을 가져오는 것과 달리
    // Kotlin은 프로퍼티 자체를 활용할 수 있다.
    if (coffee.iced){
        println("아이스 커피에요")
    }
    println("${coffee.name}의 가격은 ${coffee.price}입니다.")
    println("브랜드 : ${coffee.brand} - ${coffee.name}의 가격은 ${coffee.price}입니다.")
    println("브랜드 : ${coffee.brand} - ${coffee.name}의 가격은 ${coffee.price}입니다. ${coffee.quantity}의 가격은 ${coffee.price * coffee.quantity}입니다.")



}