package P1
/*1. Vehículo
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como
subclases de la primera.
Para la clase Vehiculo, tendrá el atributo kilometrosRecorridos. Debe
haber un método recorre, que hace que un vehículo recorra la distancia
pasada por parámetro, y que hará que aumente el número de
kilometrosRecorridos.
Para Bicicleta, crea el atributo piñones donde almacenar el número de
piñones que tiene la bicicleta, el cual se inicialice en el constructor,
además debe tener un método hazCaballito, que muestre por consola el
mensaje “Estoy haciendo el caballito”.
Para Coche, crea el atributo cilindrada, donde almacenar la cilindrada
del coche, además debe tener un método quemaRueda, que muestre
por consola el mensaje “zasssssss”.
Prueba las clases creadas mediante un programa con un menú como el
que se muestra a continuación:
VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Salir
Elige una opción (1-7):*/

/**
 * Vehiculo
 *
 * @property kilometrosRecorridos
 * @constructor Create empty Vehiculo
 */
open class Vehiculo(var kilometrosRecorridos : Int = 0) {

    /**
     * Recorre: la función recorre aumenta los kilometros recorridos
     *
     * @param kilometros
     */
    fun recorre(kilometros: Int = 0) {
    kilometrosRecorridos += kilometros
    }

}