package Kotlin_Advanced

import java.util.ArrayList
import java.util.LinkedList

fun main(){

    // immutable
    val currencyList = listOf("달러", "유로", "원")
    //currencyList.add()        - 생성하면서 선언된 immutable Collection은 이후에 값 변경이 불가하다.

    // mutable
//    val mutableCurrencyList = mutableListOf<String>()
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")

    // apply 함수를 사용하면 객체를 다시 호출할 필요없이 값 변경이 가능하다.
    val mutableCurrencyList: MutableList<String> = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    mutableCurrencyList.add("파운드")

    // immutable set
    val numberSet = setOf(1,2,3,4)

    // mutable set
    val mutableSet = mutableSetOf<Number>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    // ket to value 구조
    val numberMap = mapOf("one" to 1,"two" to 2,"three" to 3)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1         // 리터럴 문법을 추천
    mutableNumberMap.put("two", 2)
    mutableNumberMap["three"] = 3

    // Collection Builder
    // buildList 내부에서는 mutable Collection을 사용하고
    // 리턴 타입은 immutable Collection으로 리턴된다.
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }
    // 외부에서 값 변경 불가
    //numberList.add()

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("===================== 1")

    for (currency in currencyList) println(currency)

    println("===================== 2")

    currencyList.forEach {
        println(it)
    }

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()

//    for (lowerCase in lowerList) upperList.add(lowerCase)

    val upperList = lowerList.map { it.uppercase() }

    println(upperList)

    println("===================== 3")

//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList){
//        if (upperCase == "A" || upperCase == "C"){
//            filteredList.add(upperCase)
//        }
//    }

    // map, filter 등에서 기본 제공 함수들이 많다
    val filteredList = upperList.filter { it == "A" || it == "B" }
    // filter 조건이 많아질 경우 out of memery 가 발생할 수 있으므로 대용량을 처리할 때는
    // asSequence .. .toList() || .toSet() 같은 터미널 오퍼레이터를 사용하여 메모리 낭비를 줄일 수 있다.
    val filteredList2 = upperList
        .asSequence()
        .filter { it == "A" || it == "B" }
        .toList()

//    filteredList.last()
    println(filteredList)

}