package GestorDeLibros;

public class Pedido {
    private Libros libros; //me traigo mi class de Libros
    private int cantidad;
    //________________________________________________

 //me genro un constructor
    public Pedido(Libros libros, int cantidad) {
        this.libros = libros;
        this.cantidad = cantidad;
    }
    //_______________________________________________
    //metodos

    public double calcularTotal() {
        return libros.getPrecio() * cantidad;
    }
    public void mostrarResumen() {
        System.out.println("Resumen del pedido:");
        System.out.println("Libro: " + libros.getTitulo());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a pagar: $" + calcularTotal());
        System.out.println("----------------------");
    }
}
