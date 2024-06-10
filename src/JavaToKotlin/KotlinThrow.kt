package JavaToKotlin

import java.io.IOException

class KotlinThrow {

    // Java와 협업 시 @Throws 어노테이션을 통해 Java Exception을 발생시킬 수 있다.
    @Throws(IOException::class)
    fun throwIOException(){
        throw IOException("checked Exception >> IOException()")
    }

}

fun main(args: Array<String>) {

    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()

}