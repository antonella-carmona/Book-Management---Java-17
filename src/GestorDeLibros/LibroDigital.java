package GestorDeLibros;

public class LibroDigital  extends Libros{
    private String formato;

    public LibroDigital(String titulo, double precio, int stock, String formato) {
        super(titulo, precio, stock);
        this.formato = formato;
    }

    public String getFormato(){
        return formato;
    }

    //metodos
    public  void descargar(){
        System.out.println("Descargando el libro digital en formato " + formato);
    }

    public  void  mostrarInfo(){
        super.mostrarInformacion();
        mostrarInfo();
    }


}
