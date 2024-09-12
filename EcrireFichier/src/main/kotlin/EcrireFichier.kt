package org.example

import java.io.File

fun main(args: Array<String>){
    var nomFichier1 : String = "vide.txt"
    var nomFichier2 : String = args[0]
    var fichier1: File = File(nomFichier1)

    if(fichier1.exists()){
        fichier1.delete()
    }

    fichier1.createNewFile()
    var fichier2: File = File(nomFichier2)
//    if(fichier2.exists()){
//        fichier2.delete()
//    }
    //Overwrite le texte existant si le fichier existe
    fichier2.writeText("Giancarlo Benedetti")
}