package org.benedetti

import kotlin.random.Random

fun main(){

    println(repete(4, 2))
    println(repete(5, 1))
    println(repete(3, 3))
}
fun repete(n: Int, nombreFois: Int): List<Int>{
    val liste = mutableListOf<Int>() // Crée une liste mutable pour accumuler les résultats
    for(i: Int in 1 .. n){
        repeat(nombreFois) {
            liste.add(i)
        }

    }
    return liste
}