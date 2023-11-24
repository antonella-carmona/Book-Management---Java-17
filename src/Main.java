import GestorDeLibros.LibroDigital;
import GestorDeLibros.Libros;
import GestorDeLibros.Pedido;
//Se importa la clase Scanner del paquete java.util para permitir la entrada de datos desde la consola.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear algunos libros de ejemplo
        Libros libro1 = new Libros("Java for Beginners", 29.99, 10);
        Libros libro2 = new Libros("Data Structures in Java", 39.99, 5);
        Libros libro3 = new Libros("Introduction to Algorithms", 49.99, 8);
        LibroDigital libroDigital= new LibroDigital("Java for trainee", 08.99, 7, "Digital");


        libro1.setTitulo("Java for Beginners Junior");

        // Crear un array de libros
        Libros[] inventario = {libro1, libro2, libro3, libroDigital};

        // Mostrar información inicial del inventario
        System.out.println("Inventario inicial:");
        for (Libros libros : inventario) {
            libros.mostrarInformacion();
        }

        // Interacción con el usuario para realizar un pedido
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Realiza tu pedido!");
        System.out.print("Ingrese el número(indice) del libro que desea comprar: ");
        int numLibro = scanner.nextInt(); //guarda el indice

        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt(); //guarda cantidad ingresada


        // Verificar si el número del libro es válido
        if (numLibro >= 0 && numLibro < inventario.length) {
            Libros libroSeleccionado = inventario[numLibro];

            // Verificar si hay suficiente stock
            if (cantidad <= libroSeleccionado.getStock()) {
                // Realizar el pedido
                Pedido pedido = new Pedido(libroSeleccionado, cantidad);
                pedido.mostrarResumen();
            } else {
                System.out.println("Lo siento, no hay suficiente stock disponible.");
            }
        } else {
            System.out.println("Número de libro no válido.");
        }

        // Cerrar el scanner
        scanner.close();


    }
}