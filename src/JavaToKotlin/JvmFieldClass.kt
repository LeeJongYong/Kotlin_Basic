package JavaToKotlin

// 참고
// https://itstory1592.tistory.com/124

class JvmFieldClass {

    // 동반객체(최상위 - 유사 static) 선언 시 companion 키워드를 선언한다.
    companion object {
        @JvmField
        val id = 1234

        // const 키워드를 통해 상수로 선언 가능
        const val CODE = 1234
    }
}

object JvmFieldObject {
    @JvmField
    val name = "tony"

    const val FAMILY_NAME = "stark"

}

fun main(args: Array<String>) {

    val id = JvmFieldClass.id
    val name = JvmFieldObject.name


}