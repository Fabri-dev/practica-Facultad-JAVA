import modelo.CArrayList;
import modelo.CHashMap;
import modelo.CHashSet;

public class Main {
    public static void main(String[] args) {
    //colecciones de datos elegidas: ArrayList,HashMap,HashSet,TreeMap,LinkedHashSet

        CArrayList coleccion1= new CArrayList();
        CHashSet coleccion2= new CHashSet();


        for (int i=0; i < 10; i++)
        {
            coleccion1.agregar((int)(1 + (Math.random() * 100)));
            coleccion2.agregar((int)(1 + (Math.random() * 100)));
        }
        System.out.println("ARRAYLIST");
        System.out.println(coleccion1);
        System.out.println("Se elimino: "+coleccion1.eliminar(15));
        System.out.println("Se encontro: "+coleccion1.buscar(30));
        System.out.println(coleccion1.listar());
        System.out.println(coleccion1.contar());

        System.out.println("\nHASHSET");
        System.out.println(coleccion2);
        System.out.println("Se elimino: "+coleccion2.eliminar(10));
        System.out.println("Se encontro: "+coleccion2.buscar(25));
        System.out.println(coleccion2.listar());
        System.out.println(coleccion2.contar());



    }
}