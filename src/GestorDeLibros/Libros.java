package GestorDeLibros;

public class Libros {
    //_______________________________________________________
    //al usar "private" significa que no pueden ser accedidos directamente desde fuera
    //de la clase, y con esto usamos metodos para despues acceder a la información de los libros.
    //métodos de acceso" o "getters".
    private String titulo;
    private double precio;
    private int stock;
    //_______________________________________________________
    //constructor para instanciar por fuera

    public Libros(String titulo, double precio, int stock) {

        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }
    //_______________________________________________________
    //métodos de acceso :"getters".
    //usado para poder obtener el valor desde afuera de esta clase.

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setTitulo(String nuevoTitulo){ this.titulo = nuevoTitulo;}
  //_______________________________________________________
  // void, significa que el método no devuelve ningún valor.
    public void mostrarInformacion() {
      System.out.println("Libro: " + titulo);
      System.out.println("Precio: $" + precio);
      System.out.println("Stock disponible: " + stock);
      System.out.println("----------------------");
  }
}
