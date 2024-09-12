package org.example

fun main() {
    var liste: List<String> = listOf("zz", "aa", "bb", "dd", "z", "zz", "cc")
    println(liste)
    var set: MutableSet<String> = liste.toMutableSet()
    println(set)
    set.add("AAAA")
    println(set)
    set.add("zz")
    println(set)
    set.remove("zz")
    println(set)

}