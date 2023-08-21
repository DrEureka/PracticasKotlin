package com.drdev.andoridmaster

val intEjemplo: Int = 30
var intEjemplo2: Int = 25
var miNombre = "Daniel R."
var saludos: String = "Desde Argentina"

fun main() {

    //Todo: llamar a una funcion externa
    //  variablesNumericas()
    miNombre()
    miEdad(30)
}

fun miNombre() {

    println("Mi nombre es $miNombre")
}
fun miEdad(edad:Int){
    println("tengo $edad años.")
}

fun variablesNumericas() {


    /**
     * Aritmetica
     */

    println("Sumar: ")
    println(intEjemplo + intEjemplo2)

    println("Resta: ")
    println(intEjemplo - intEjemplo2)

    println("Division: ")
    println(intEjemplo / intEjemplo2)

    println("Multipl: ")
    println(intEjemplo * intEjemplo2)

    println("Modulo: ")
    println(intEjemplo % intEjemplo2)

}

fun variablesBoolean() {
    /**
     * Variables boolean
     */

    //todo: permite ingresar true o false
    var booleanEjemplo1: Boolean = true
    var booleanEjemplo2: Boolean = false
    var booleanEjemplo3: Boolean = true

}

fun variablesAlfanumericas() {

    /**
     * Variables alfanumericas
     */

    //todo: Char toma solamente un caracter

    var charEjemplo1: Char = 'a'
    var charEjemplo2: Char = '2'
    var charEjemplo3: Char = '@'
    val charEjemplo4: Char = '!'


    //todo: Creo una variable tipo string, no tiene limite
    val miNombre = "Daniel R."
    val saludos: String = "Desde Argentina"

}

fun variablesTest() {
    println("Variables ")
    /**
     * Variables numericas
     */
    //Todo: Variable inmutable se utiliza la descripcion "val" y cuando puede ser mutable se utiliza "var"

    //todo: creo una variable tipo int con los ":" me permite ingresar el tipo de variable que va ser
    // Esto funciona porque kotlin es de programacion tipado fuerte entonces hay que aplicar el formato correcto para el tipo correcto.
    // SOPORTA INT HASTA: -2,147,438,647 a 2,147,483,647
    //  val intEjemplo:Int = 30
    //  var intEjemplo2:Int = 25

    //todo: Long soporta hasta: -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val longEjemplo: Long = 30

    //todo: FLOAT soporta hasta:
    var floatEjemplo: Float = 10.223F

    //TODO: Doble
    var dobleEjemplo: Double = 325.01212


    /**
     * invoco la variable
     */
//println(floatEjemplo)


    /**
     * Variables concanetadas
     */

    var stringConcatenada: String = "hola"
    println(stringConcatenada)
    println("Hola, $miNombre $saludos")

    /**
     * Variables transformadas
     */
    //Todo: hay varios tipos de transformadores, chequear con ".toXXXXXX" elegir el formato correcto
    val ejemploString: String = intEjemplo.toString()

    println(ejemploString)

}