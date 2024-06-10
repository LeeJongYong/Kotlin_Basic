package JavaToKotlin;

import java.io.IOException;

public class JavaThrow {

    public void throwIOException() throws IOException {
        throw new IOException("checked Exception >> IOException !!!");
    }

    public static void main(String[] args) {

        JavaThrow javaThrow = new JavaThrow();

        try {
            javaThrow.throwIOException();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // kotlin Exception의 경우 try/catch문을 선언하지 않아도 된다.
        KotlinThrow kotlinThrow = new KotlinThrow();
//        kotlinThrow.throwIOException();

        try {
            kotlinThrow.throwIOException();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
