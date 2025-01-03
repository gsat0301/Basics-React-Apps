package com.gabrieldev.androidmaster.sintaxis

fun main(){
mutableList()
}

fun mutableList(){
var weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)

    weekDays.add(index = 0 ,"Dia de gabito")
    println(weekDays)

    if (weekDays.isEmpty()){
         println("No hay datos")
    }
    else{
    weekDays.forEach { println(it) }
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    for (gabito in weekDays){
        println(gabito)
    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //filter recorrer una a una los indices hasta filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //recorrer completamente iterar
    readOnly.forEach{println(it)
        //o mas legible
     readOnly.forEach { weekDay -> println(weekDay) }
    }
}