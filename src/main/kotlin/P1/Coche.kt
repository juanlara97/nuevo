package P1

/**
 * Coche
 *
 * @property cilindrada
 * @constructor
 *
 * @param kilometrosRecorridos
 */
class Coche(var cilindrada: Int, kilometrosRecorridos: Int) :
            Vehiculo(kilometrosRecorridos) {

    /**
     * Quema rueda
     *
     */
    fun quemaRueda(){
                    println("sazzzzzzz")
                }

    /**
     * Andar
     *
     */
    fun andar(){
                    println("Estoy conduciendo el coche brrrum brrrum")
                }
}