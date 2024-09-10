package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var liste: List<String> = listOf("zz", "aa", "zzz", "bb", "dd", "z", "zz", "cc")
    println(liste)
    println(liste.size)
    println(liste[3])
   var listeTrier: List<String> = liste.sorted()
    println(listeTrier)
    var listeInversee: List<String> = liste.reversed()
    println(listeInversee)
    var listeTrierLength: List<String> = liste.sortedWith(compareBy({it.length}))
    println(listeTrierLength)
    var listeTrierLength2: List<String> = liste.sortedWith(compareBy({it.length}, {it}))
    println(listeTrierLength2)
    println(contient(liste, "zz"))
    println(contient(liste, "zzzz"))
    println(liste.contains("zz"))
    println(liste.contains("zzzz"))
    println(liste.count( {it == "z"} ))
    println(liste.count( {it == "zz"} ))
    println(liste.count( {it == "zzzz"} ))

    //Façon simple
    println("zz" in liste)
    println("zzzz" in liste)

}

fun contient(liste: List<String>, st : String): Boolean {
    for(s: String in liste){
        if(s == st){
            return true
        }
    }
    return false
}