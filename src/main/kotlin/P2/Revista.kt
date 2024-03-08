package P2

class Revista(isbn : Int, titulo : String, anioDePublicacion : Int) :
              Publicacion(isbn, titulo, anioDePublicacion) {
              var numeroDeRevista : Int = 0
}