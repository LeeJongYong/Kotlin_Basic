package JavaToKotlin

fun main(args: Array<String>) {

    val person = Person()
    person.setName("Iron Man")
    person.setAge(44)
    person.setAddress("Stark Tower")

    println(person.getName())
    println(person.getAge())
    println(person.getAddress())

    val person2 = Person()
    person2.name = "Iron Man"
    person2.age = 44
    person2.address = "Stark Tower"

    println(person2.name)
    println(person2.age)
    println(person2.address)
    println(person2.uuid)

}