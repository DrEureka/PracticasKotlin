package com.drdev.andoridmaster

fun main(){
    println("Variables ")
    /**
     * Variables numericas
     */
    //Todo: Variable inmutable se utiliza la descripcion "val" y cuando puede ser mutable se utiliza "var"

    //todo: creo una variable tipo int con los ":" me permite ingresar el tipo de variable que va ser
    // Esto funciona porque kotlin es de programacion tipado fuerte entonces hay que aplicar el formato correcto para el tipo correcto.
    // SOPORTA INT HASTA: -2,147,438,647 a 2,147,483,647
    val intEjemplo:Int = 30
    var intEjemplo2:Int = 25

    //todo: Long soporta hasta: -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val longEjemplo:Long = 30

    //todo: FLOAT soporta hasta:
    var floatEjemplo:Float = 10.223F

    //TODO: Doble
    var dobleEjemplo:Double = 325.01212


    /**
     * Variables alfanumericas
     */

    //todo: Char toma solamente un caracter

    var charEjemplo1:Char = 'a'
    var charEjemplo2:Char = '2'
    var charEjemplo3:Char = '@'
    val charEjemplo4:Char = '!'


    //todo: Creo una variable tipo string, no tiene limite
    val miNombre = "Daniel R."
    val saludos:String = "Desde Argentina"

    /**
     * Variables boolean
     */

    //todo: permite ingresar true o false
    var booleanEjemplo1:Boolean = true
    var booleanEjemplo2:Boolean = false
    var booleanEjemplo3:Boolean = true


    /**
     * invoco la variable
     */
//println(floatEjemplo)

    /**
     * Aritmetica
     */

//    println("Sumar: ")
//    println(intEjemplo + intEjemplo2)
//
//    println("Resta: ")
//    println(intEjemplo - intEjemplo2)
//
//    println("Division: ")
//    println(intEjemplo / intEjemplo2)
//
//    println("Multipl: ")
//    println(intEjemplo * intEjemplo2)
//
//    println("Modulo: ")
//    println(intEjemplo % intEjemplo2)

    /**
     * Variables concanetadas
     */

    var stringConcatenada:String = "hola"
    println(stringConcatenada)
    println("Hola, $miNombre $saludos")

    /**
     * Variables transformadas
     */
    //Todo: hay varios tipos de transformadores, chequear con ".toXXXXXX" elegir el formato correcto
    val ejemploString:String = intEjemplo.toString()



}
