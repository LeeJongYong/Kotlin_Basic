package Kotlin_Advanced

import java.io.FileWriter

fun main(){
    FileWriter("test.txt")
        .use{
            it.write("Hello World")
        }
}