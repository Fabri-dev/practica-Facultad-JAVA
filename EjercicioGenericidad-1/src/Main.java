import modelo.Almacenamiento;
import modelo.Libro;
import modelo.Zapatilla;

public class Main {
    public static void main(String[] args) {

        Almacenamiento<Libro> libros =new Almacenamiento<>();

        Almacenamiento<Zapatilla>zapatillas= new Almacenamiento<>();


        Libro libro1=new Libro("1984",1);
        Libro libro2=new Libro("Meditaciones",2);
        libros.agregarElementos(libro1);
        libros.agregarElementos(libro2);

        System.out.println(libros);

        System.out.println("Libro encontrado: " + libros.buscarElemento(libro1));

        System.out.println("Libro eliminado: "+ libros.eliminarElemento(libro2));

        System.out.println(libros);

        Zapatilla zapatilla1= new Zapatilla(1,"Nike");
        zapatillas.agregarElementos(zapatilla1);
        System.out.println(zapatillas);




    }
}