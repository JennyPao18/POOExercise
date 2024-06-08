public class Libro {
    String titulo;
    String autor;
    long isbn;
    int noPaginas;
    String genero;
    double precio;

    public Libro(){
        this.titulo = "Don Quijote de la Mancha";
        this.autor = "Miguel de Cervantes";
        this.isbn = 978848109;
        this.noPaginas = 462;
        this.genero = "Novela";
        this.precio = 104.99;
    }

    public Libro(String titulo, String autor, long isbn, int noPaginas, String genero, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.noPaginas = noPaginas;
        this.genero = genero;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Mostrando detalles del libro... ");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("No. de Páginas: " + noPaginas);
        System.out.println("Género: " + genero);
        System.out.println("Precio: " + precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        System.out.println("Actualizando precio del libro... ");
        System.out.println("Precio antiguo: " + precio);
        System.out.println("Nuevo precio: " + nuevoPrecio);
    }
}
