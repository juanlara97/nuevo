package P1

/**
 * Menu
 *
 */
fun menu(){
    println("VEHICULO \n" +
            "------------- \n" +
            "------------- \n" +
            "Elige una de las 7 opciones: \n" +
            "1.Anda con la bicicleta \n" +
            "2.Haz el caballito con la bicicleta \n" +
            "3.Anda con el coche \n" +
            "4.Quema rueda con el coche \n" +
            "5.Ver kilometraje de la bicicleta \n" +
            "6.Ver kilometraje del coche \n" +
            "7.Salir \n")
    var respuesta = readln().toInt() ?: "Valor incorrecto"
    var miBici = Bicicleta(0,45)
    var miCoche = Coche(0,78)

    when (respuesta) {
        1 -> miBici.andar()
        2 -> miBici.hazCaballito()
        3 -> miCoche.andar()
        4 -> miCoche.quemaRueda()
        5 -> println("KILOMETRAJE RECORRIDO EN BICI: \n" + miBici.kilometrosRecorridos + " KM")
        6 -> println("KILOMETRAJE RECORRIDO EN COCHE: \n" + miCoche.kilometrosRecorridos + " KM")
        7 -> println("¡ADIOS!")
    }
    if (respuesta != 7){
        menu()
    }
}

/**
 * Main
 *
 */
fun main(){
    menu()
}