package com.gabrieldev.androidmaster.sintaxis

fun main(){
    println (getSemester(8))

}

fun result(value:Any){
    when (value){
        is Int -> value+value
        is String-> println(value)
        is Boolean-> if (value) println("Verdadero")
        else println("Falso")

    }
}
//en vez de llaves al colocar un igual
//devuelvo el resultado
fun getSemester(month:Int) =
    when (month){
        //in refleja un rango de datos
        in 1..6-> ("Primer semestre")
        in 7..12-> ("Segundo semestre")
        !in 1..12-> ("No es un semestre valido")
        else-> ("No es un mes valido")
    }



fun getMonth(month: Int){
    when (month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        //para agrupar en una sola opcion
        //se agregan llaves {}
        11 -> {
            println("Noviembre")
            println("Noviembre")
    }
        12 -> println("Diciembre")
else -> println("El mes $month no existe")

    }
}

fun getTrimestrer(month: Int){
    when (month){
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10,11, 12-> println("Cuarto trimestre")
        else -> println("No es un mes valido")
    }

}