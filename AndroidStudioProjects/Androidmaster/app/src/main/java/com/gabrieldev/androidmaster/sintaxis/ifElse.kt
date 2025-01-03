package com.gabrieldev.androidmaster.sintaxis

fun main(){

}

fun ifMultipleOr(){
    var pet = "cat"
    // el operador or es ||
    if (pet == "cat" || pet == "dog"){
        println("Es un gato o un perro")
    }
}

fun ifMultiple(){
    var age = 18
    var permission = false
    var imHappy = false
    //&& operador AND
    if (age >= 18  && permission && imHappy){
        println("Puedo beber cerveza")
    }else
        println("no puedo beber cerveza")
}

fun ifInt(){
    var age = 29
    if (age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

fun ifBoolean(){
    var soyFeliz = true
    // se sobre entiende el true, si se agrega un !buttonPressed, es lo contrario
    if (!soyFeliz){
    println("Estoy triste")
    }
}

fun ifAnidado(){
    val animal = "dog"
    if (animal=="dog") {
        println("Es un perro")

    } else if (animal=="cat") {
        println("Es un gato")

    } else if (animal=="bird") {
        println("Es un pajaro")

    }
    else  {
        println("No es un animal")

        }
}

fun ifBasico(){
    val name = "gabriel"

    if (name == "gabriel"){
        println("la variable name es gabriel")
    }
    else {
        println("Este no es gabriel")
    }
}