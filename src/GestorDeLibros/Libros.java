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
    //Generamos un constructor con las propiedades

    public Libros(String titulo, double precio, int stock) {

        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }
    //_______________________________________________________
    //métodos de acceso" o "getters".
    //usado para poder obtener el valor desde afuera de esta clase.
    //siguen el principio de encapsulamiento, implica ocultar detalles internos de una class y proporcionar
    //interfaces como estos metodos get para interactuar con ells.
    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
  //_______________________________________________________
  public void mostrarInformacion() {
      System.out.println("Libro: " + titulo);
      System.out.println("Precio: $" + precio);
      System.out.println("Stock disponible: " + stock);
      System.out.println("----------------------");
  }
}
