package org.benedetti

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main(args: Array<String>) {
    println("Hello World!")
    var doc : Document = Jsoup.connect(args[0]).get(); //Example comme commande
}