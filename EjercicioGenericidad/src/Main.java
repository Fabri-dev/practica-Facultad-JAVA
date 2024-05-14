import Interfaces.IValuable;
import modelo.CajaSeguridad;
import modelo.CollarDeOro;
import modelo.Contenedor;
import modelo.Zapatilla;

import java.net.ConnectException;

public class Main
{

    public static void main(String[] args)
    {
        //CASO 0: A la clase generica le damos un tipo de dato para poder "especificarla"
        //para poder tener los metodos de esta clase generica (que no van a ser unicos, sino que solo sirven para agregar,contar,eliminar, funciones generales)

        //public class Contenedor <E>
        Contenedor<String> caja = new Contenedor();
        caja.agregar("libros");
        caja.agregar("cosas");

        System.out.println(caja);

        //Caso 1:

        //public class CajaSeguridad extends Contenedor
//        CajaSeguridad cajita=new CajaSeguridad(31);
//        cajita.agregar("collar de oro");
//        cajita.agregar("plata");
//        cajita.agregar(1000);
//        System.out.println(cajita);

        //caso 2:
        //public class CajaSeguridad2<T extends CollarDeOro> extends Contenedor<T>

//        CajaSeguridad cajita2 = new CajaSeguridad(23);
//        Zapatilla zapatilla= new Zapatilla();
//        CollarDeOro collarDeOro= new CollarDeOro(34);

//        System.out.println(cajita2.agregar(zapatilla));
//        cajita2.agregar(collarDeOro);
//        cajita2.agregar(5);
//        System.out.println(cajita2);


        //case 3:
        //public class CajaSeguridad extends Contenedor <String>
//        CajaSeguridad cajita3= new CajaSeguridad(31);
//        cajita3.agregar("Plata");



    }
}