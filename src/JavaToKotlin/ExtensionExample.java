package JavaToKotlin;

public class ExtensionExample {

    public static void main(String[] args) {
        // kotlin에서처럼 바로 접근은 불가능
//        "ABCD".first();
//        "ABCD".addFirst("Z");

        // 확장함수는 자바변환시 static method로 변환
        // 확장함수 호출 시 1번째 param이 수신자 객체가 된다
        char firstChar = MyExtensionsKt.first("ABCD");
        String addFirst = MyExtensionsKt.addFirst("ABCD", 'Z');

        System.out.println("firstChar : " + firstChar);
        System.out.println("addFirst : " + addFirst);

    }
}
