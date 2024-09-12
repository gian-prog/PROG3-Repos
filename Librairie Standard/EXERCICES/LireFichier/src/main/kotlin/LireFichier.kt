package org.example

import java.io.File

fun main(args: Array<String>){
    if (args.isEmpty()) {
        println("Aucun fichier fourni. Veuillez passer les noms de fichiers en arguments.")
        return
    }

    for (nomFichier in args)
    try {
        val fichier = File(nomFichier)

        if(fichier.exists()) {
            println("Contenu du fichier: $nomFichier\n ${fichier.readText()}")
            println("-------------")
        }else {
            println("Le fichier $nomFichier n'existe pas ou n'est pas un fichier valide.")
        }
    } catch (e: Exception) {
        println("Erreur lors de la lecture du fichier $nomFichier : ${e.message}")

    }




}