package Kotlin_Advanced

/*
* alse
* 1. it 소프트 키워드 사용
* 2. 부수작업 수행
* 3. 내부 코드 반환이 아닌 해당 객체를 리턴함
* 4. 별도 선언 없이 it을 사용하여 내부 함수를 쉽게 사용가능하다
* */

class User(val name: String, val password: String){

    fun validate(){
        if(name.isNotEmpty() && password.isNotEmpty()){
            println("검증 완료")
        }else{
            println("검증 실패")
        }
    }

    fun printName() = println("내 이름은 ${name}이야")
}

fun main(){
    val user: User = User("Jay Y", "1234")
    user.validate()

    User("Jay Y", "1234").also {
        it.validate()
        it.printName()
    }
}