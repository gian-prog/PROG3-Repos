package org.benedetti

import com.sun.jdi.IntegerValue

fun main(args: Array<String>) {
    println("Voici:")
    //faire avec Test 1
    for(arg in args) {
        var num = arg.toInt()
        val BIN = Integer.toBinaryString(num)
        println(BIN)
    }
}