fun sayhello(greeting:String, itemToGreet:String) = println("Hello $itemToGreet")


fun main(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Comicbooks", 1)
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach{key, value -> println("$key -> $value")}

}
