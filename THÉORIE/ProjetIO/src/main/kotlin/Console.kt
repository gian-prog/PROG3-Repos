package org.example

fun main() {
    var question: String = "Quel est votre language de programmation préféré?"
    while (true){
        println(question)
        var reponse: String = readln()
        if(reponse == "Kotlin"){
            println("Merci, votre language préféré est effectivement ${reponse}!")
            return
        }
        else{
            println("Mauvaise réponse")

        }

    }
}