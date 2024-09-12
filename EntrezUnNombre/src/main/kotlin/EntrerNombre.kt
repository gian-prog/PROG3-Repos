package org.example

fun main(){
    var phrase: String = "Veuillez entrer un nombre : "
    var reponse: String
    var num: Int

    while (true){
        println(phrase)
        reponse = readln()

        try{
            num = reponse.toInt()
            println("Merci, votre nombre est $num.")
            return
        }
        catch (e : NumberFormatException){

            phrase = "Ceci n’est pas un nombre, veuillez entrer un nombre : "
        }
    }
}