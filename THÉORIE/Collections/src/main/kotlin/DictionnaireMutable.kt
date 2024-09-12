package org.example

fun main(){
    var map:  MutableMap<String, Int> = mutableMapOf("HAL9001" to 42, "HAL9002" to 90, "HAL9003" to 42 )
    println(map)
    map["HAL9009"] = 200
    println(map)
    map["HAL9009"] = 300 ///Écrase ancienne valeur
    println(map)
    map.remove("HAL9009")
    println(map)

}