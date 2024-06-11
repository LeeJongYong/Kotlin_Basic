package JavaToKotlin;

// 참고
// https://itstory1592.tistory.com/124

public class JvmFieldExample {

    public static void main(String[] args) {
//        JvmFieldClass.Companion.getId();
//        JvmFieldObject.INSTANCE.getName();

        // JvmField 키워드 사용 시 Companion, Instance 키워드 없이 상수화하여 사용 가능
        int id = JvmFieldClass.id;
        String name = JvmFieldObject.name;

        // const 상수는 바로 접근 가능
        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;


    }
}
