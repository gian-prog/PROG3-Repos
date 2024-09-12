package org.example

fun main(){
    var map:  Map<String, Int> = mapOf("HAL9001" to 42, "HAL9002" to 90, "HAL9003" to 42 )
    println(map)
//    println(map.size)
//    for((k, v) in map){
//        println("$k: $v")
//    }
//    for(k: String in map.keys){
//        println("$k: ${map[k]}")
//    }
    println("HAL9001" in map)
    println("HAL9009" in map)
    println(map.containsKey("HAL9001"))
    println(map.containsKey("HAL9009"))

}