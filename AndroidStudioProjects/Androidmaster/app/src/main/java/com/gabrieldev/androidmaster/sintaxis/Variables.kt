package com.gabrieldev.androidmaster.sintaxis
//variable o valor global
val age = 30

fun main(){



    showMyName()
    showMyAge(currentAge = 23)
    add(15, 15)
    val mySubstract = substract(10,5)
    println(mySubstract)
}

fun showMyName(){
    println("Mi nombre es Gabo el chulo")

}

fun showMyAge(currentAge:Int){
    println("Tengo $currentAge años")
}

fun add(firstNumber:Int, secondNumber:Int){
    println("¿cuanto es $firstNumber mas $secondNumber ?:")
    println(firstNumber+secondNumber)
}

fun substract(firstNumber:Int, secondNumber:Int): Int {
    println("¿Cuanto es $firstNumber menos $secondNumber ?:")
   return firstNumber-secondNumber

}
fun variablesAlfaNumericas(){
    /*
  Variables alfanumericas
   */

    //variable char soporta solo 1 caracter
    val charExample:Char = '1'
    val charExample2:Char = 'a'

    //variable string almacena lo que sea y tamaño que sea
    val stringExample:String = "Soy el mejor progranador de kotlin"
    val stringExample2 = "Soy el mejor progranador de kotlin"
    val stringExample3 = "4"
    val stringExample4 = "23"



    //strings se concatenan
    println("Strings concatenados")
    println (stringExample3 + stringExample4)

    //Para sumar strings que tienen numeros hay que cambiar su tipo
    println("Strings cambiados a enteros")
    println (stringExample3.toInt() + stringExample4.toInt())

    var stringConcatenada = "Hola"
    stringConcatenada = "Hola soy $stringExample"
    println(stringConcatenada)
}
fun variablesNumericas(){
    //variables enteras o int pero limitado a una cantidad
    val age:Int = 30
    var age2:Int = 30
    println("Edad numero 1: $age2")
    age2 = 29
    println("Edad numero 2: $age2")

    //variables enteras o long pero con limites mas largos
    val example:Long = 30

    //variables float almacena numeros decimales, hasta 6 decimales
    val exam:Float = 19.2f

    //double almacena numeros decimales, hasta 14
    val examDouble:Double = 2587.4541

    /*
   * funciones aritmeticas*/

    //suma
    println("Suma de las dos edades:")
    println(age + age2)

    //resta
    println("Resta de las dos edades:")
    println(age - age2)

    //multiplicacion
    println("Multiplicacion de las dos edades:")
    println(age * age2)

    //division
    println("Division de las dos edades:")
    println(age / age2)

    //modulo
    println("Modulo o porcentaje de las dos edades:")
    println(age % age2)

    //operaciones diferentes atributos; cambia los atributos dependiendo
    // o cambia segun lo que le indiquemos
    var exampleSuma= age + exam.toInt()
    println(exampleSuma)

}
fun variablesBooleanas(){
    /*
  Variables booleanas
   */
    //Boolean solo almacena true or false

    val booleanExample:Boolean = true
    val  booleanExample2:Boolean = false
    val booleanExample3 = false

}
