fun main(args: Array<String>) {

    var a = 5
    val b = 10

    var array = arrayOf(1,2,3,4,5,5,6,6)

    var list = listOf<Any>(1, "hello", true, 34.566)

    for ((i, e) in list.withIndex()){
        println("$i    $e")
    }


}
