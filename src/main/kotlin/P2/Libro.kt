package P2


class Libro(isbn : Int, titulo : String, anioDePublicacion : Int) :
            Publicacion(isbn, titulo, anioDePublicacion) {
                var prestado : Boolean = false
}