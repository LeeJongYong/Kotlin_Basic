package JavaToKotlin

import java.time.LocalDate

class Student {

    // @JvmField 어노테이션을 붙이면 Java에서 getter/setter 없이 프로퍼 접근이 가능하다.
    @JvmField
    var name: String? = null

    var birthDate: LocalDate? = null

    val age: Int = 10

    var grade: String? = null
        // private 키워드를 사용할 경우 해당 class 내부에서만 사용이 가능하다.
        private set

    fun changeGrade(grade: String) {
        this.grade = grade
    }

}