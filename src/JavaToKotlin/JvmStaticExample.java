package JavaToKotlin;

// 참고
// https://itstory1592.tistory.com/124

public class JvmStaticExample {
    // Kotlin class를 바로 static 객체로 사용할 수 없다.
//    HelloClass.hello();

    // 동반객체는 Companion 키워드를 통해 접근 가능
//    String hello = HelloClass.Companion.hello();

    // object는 INSTANCE를 통해 접근 가능
//    String hi = HiObject.INSTANCE.hi();

    // Kotlin 소스에서 JvmStatic 어노테이션 사용 시 키워드 없이 바로 접근 가능
    String hello = HelloClass.hello();
    String hi = HiObject.hi();


}