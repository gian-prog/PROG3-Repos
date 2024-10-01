package org.giancarlo

import kotlin.math.roundToInt
import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    val table = creeTableauAleatoire(10)

    if (table.isNotEmpty()) {
        println(table.joinToString(", "))
    } else {
        println("Le tableau est vide.")
    }
    println("La moyenne est : " + moyenneTable(table))
    println("Le maximum est : " + maxTable(table))
    println("La minimum est : " + minTable(table))


}
fun creeTableauAleatoire(n: Int): Array<Int> {

    return Array(n) { Random.nextInt(0, 101) }
}
fun moyenneTable(args: Array<Int>): Int {

    return args.average().roundToInt()
}
fun maxTable(args: Array<Int>): Int {

    return args.max()
}
fun minTable(args: Array<Int>): Int {

    return args.min()
}
