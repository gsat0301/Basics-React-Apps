package com.gabrieldev.androidmaster.sintaxis

fun main (){
    var name:  String = "gabriel"
    var name1 :String ="gabriel"
    var name2 :String ="gabriel"
    var name3 :String ="gabriel"

    //el array guarda una sucesion de variables por indices
    //indice 0-7
    //tamaño 8

    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays[0])
    //imprime el indice 0

    //cambio el valor del indice 0
    weekDays[0] = "Papas fritas"
    println(weekDays[0])

    println(weekDays.size)
    //imprime el tamaño del array

    if (weekDays.size >=8){
        println(weekDays[7])
    } else{
        println("No hay mas valores en el array")
    }

    //Bucles para arrays
    //for pasa por todas las posiciones
    for (position in weekDays.indices){
        println(weekDays[position])
    }
    for ((position, value)in weekDays.withIndex()){
        println("La posicion $position contiene $value")
    }
    for (weekDays in weekDays){
        println("Ahora es $weekDays")
    }
}