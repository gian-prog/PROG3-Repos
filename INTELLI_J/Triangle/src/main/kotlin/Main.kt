package org.example

fun main(args: Array<String>){
    println(args)

    val  hauteur: Int = args[0].toInt()

    for(i in 1 .. hauteur){
        for(j:Int in 1 .. 10){
            println("*")
        }
        print("\n")
    }
}