package org.giancarlo

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    if(args.isEmpty()){
        println("Vous devez founir une hauteur de pyramide")
    }
    else{
        for(arg : String in args) {
            try{
            val hauteur:Int = arg.toInt()
            afficherPyramide(hauteur)
            } catch (e: Exception) {
                println("Cet argument n'est pas une hauteur valide :  «$arg»") ///Pour le 3ième argument
            }
        }
    }
}


private fun afficherPyramide(hauteur: Int) {
    var nbEtoiles = 1
    var nbEspaces: Int = hauteur - 1
    var line: String? = null
    for (i: Int in 1..hauteur) {
        line = " ".repeat(nbEspaces) + "*".repeat(nbEtoiles)
        println(line)
        nbEtoiles += 2
        nbEspaces--;
    }

}