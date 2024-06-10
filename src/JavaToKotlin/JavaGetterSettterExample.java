package JavaToKotlin;

import java.time.LocalDate;

public class JavaGetterSettterExample {

    public static void main(String[] args) {

        Student student = new Student();

//        student.setName("스티브 뤄저스");
        student.name = "아이언맨";
        student.setBirthDate(LocalDate.of(1918, 7,  4));

        System.out.println(student.name);
        System.out.println(student.getBirthDate());

        // val(불변변수)의 경우 setter를 만들어주지 않는다.
//        student.setAge(90);
        System.out.println(student.getAge());

        student.changeGrade("A");
        System.out.println(student.getGrade());




    }

}
