package org.example

fun main(){
    for(i: Int in 0..9){
        var etoile : Etoile = Etoile("HAL900$i", 420000000)
        println(etoile)
    }
}