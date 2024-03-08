package P2

/*2. Biblioteca
Se quiere informatizar una biblioteca. Crea las clases Publicacion,
Libro y Revista. Las clases deben estar implementadas con la jerarquía
correcta, tal que los libros y revistas son a su vez publicaciones.
Las características comunes de las revistas y de los libros son el código
ISBN, el título, y el año de publicación. Cuando se muestra la
información de una publicación, aparece de la siguiente manera: “ISBN:
123456, título: La Ruta Prohibida, año de publicación: 2007”.
Las revistas tienen además un atributo con el numero de la revista.
Los libros tienen además un atributo prestado que puede tener valor
verdadero o falso. Cuando se crean los libros, no están prestados. La
clase Libro debe implementar la interfaz Prestable que tiene los
métodos prestar, devolver y estaPrestado, cuya implementación en libro
debe cumplir lo siguiente:
• prestar: Si el libro está prestado mostrará por consola el mensaje
“Lo siento, este libro ya está prestado.”, sino pondrá el atributo a
prestado.
• devolver: Pone el atributo prestado a falso.
• estaPrestado: Devuelve el valor del atributo prestado.
Cuando se muestra la información de un libro, muestra la información
de la publicación padre y añade “prestado” o “no prestado” en función
del valor del atributo. Ejemplo: ISBN: 123456, título: La Ruta Prohibida,
año de publicación: 2007 (no prestado).
Crea una clase Biblioteca, que gestione en una estructura de datos
dinámica las publicaciones que hay en ella. Implementa mediante un
menú que se puedan realizar las siguientes operaciones:
1. Añadir libro a la biblioteca
2. Añadir revista a la biblioteca
3. Listar libros no prestados
4. Listar publicaciones cuyo título empieza por la letra indicada
5. Buscar publicación, a partir de una cadena que forme parte del
título
6. Eliminar publicación de la biblioteca
7. Salir
Mientras que el usuario no quiera terminar el programa, se tiene que
repetir el menú con las opciones anteriores.*/

open class Publicacion (var isbn : Int,
                        var titulo : String,
                        var anioDePublicacion : Int){

}