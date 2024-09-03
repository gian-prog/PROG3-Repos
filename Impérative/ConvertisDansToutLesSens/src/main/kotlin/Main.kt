package org.benedetti

    fun main(args: Array<String>) {
        println("Voici:")
        //faire avec ConvertNums1
            val num = args[0].toDouble() //Doivent passer par int
            val num2 = num.toInt()
            val num3 = args[0]
            val num4 = num.toFloat()
                println("Int to Float :  Int : " + num2 + " Float : " + num2.toFloat() )
                println("Double to Int :  Double : " + num + " Int : " + num.toInt() ) ///Perd ses virgules de précision
                println("String to Int :  String : " + num3 + " Int : " + num.toInt() ) ///Perd ses virgules de précision
                println("Float to Double :  Float : " + num4 + " Double : " + num4.toDouble() ) ///Float a une capacité de 7 nombres décimaux

    }