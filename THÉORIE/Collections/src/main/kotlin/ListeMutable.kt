package org.example
fun main() {
    var liste: MutableList<String> = mutableListOf("zz", "aa", "zzz", "bb", "dd", "z", "zz", "cc")
    println(liste)
    liste.add("zz")
    println(liste)
    liste.add(2, "AAAA")
    println(liste)
    liste.remove("zz")
    println(liste)
    liste.removeAt(2)
    println(liste)


}
