package P1

/**
 * Bicicleta
 *
 * @property piñones
 * @constructor
 *
 * @param kilometrosRecorridos
 */
class Bicicleta(var piñones : Int = 0, kilometrosRecorridos : Int) :
                Vehiculo(kilometrosRecorridos) {

    /**
     * Haz caballito
     *
     */
    fun hazCaballito(){
                        println("Estoy haciendo el caballito")
                    }

    /**
     * Andar
     *
     */
    fun andar(){
                      println("Estoy montando la bici")
                    }
}