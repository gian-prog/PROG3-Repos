package org.example

fun main() {
    val text: String = "zzzzzzzzzzzzzzzzzzzzalllozzzzzzzzzzzzzzzzzzzzzzzzzz"

    val regex: Regex = "a[l]+o".toRegex()
    val occurences: List<String> = regex.findAll(text).map { it.value}.toList()

    println("Occurences trouvées : ${occurences}")
}