public class Main {
    public static void main(String[] args) {
        /*Objeto creado con el constructor sin parametros */
        Libro libro1 = new Libro();

        /*Objeto creado con el constructor con parametros*/
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 978846751, 100, "Novela infantil", 149.99);

        /*Métodos para libro2 */
        libro2.mostrarDetalles();
        System.out.println();
        libro2.actualizarPrecio(154.99);

        /*Saltos de línea*/
        System.out.println();
        System.out.println();

        /*Métodos para libro1*/
        libro1.mostrarDetalles();
        System.out.println();
        libro1.actualizarPrecio(99.99);
    }
}