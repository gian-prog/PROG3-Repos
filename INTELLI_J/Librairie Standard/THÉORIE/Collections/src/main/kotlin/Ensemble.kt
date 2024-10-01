package org.example

fun main() {
    var liste: List<String> = listOf("zz", "aa", "bb", "dd", "z", "zz", "cc")
    println(liste)
    var set: Set<String> = liste.toSet()
    println(set)
    println(set.size)
    var listTriee: List<String> = set.sorted()
    println(listTriee)
    println("zz" in set)
    println("zzz" in set)
    println(set.contains("zz"))
    println(set.contains("zzz"))


}