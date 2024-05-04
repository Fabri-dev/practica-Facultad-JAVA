import modelo.Entrada;
import modelo.Normal;
import modelo.Recital;
import modelo.Vip;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Recital profeAprobame= new Recital("El recital más Gonzalo que el mismo Gonzalo","5 de mayo de 2024","Santiago del Estero");

        //creando tipos
        System.out.println("CREANDO TIPOS DE ENTRADAS");
        System.out.println("Se creo el tipo de entrada: "+profeAprobame.agregarUnTipoDeEntrada("normal"));
        System.out.println("Se creo el tipo de entrada: "+profeAprobame.agregarUnTipoDeEntrada("vip"));

        System.out.println("PRUEBA CARGAR TIPO DE ENTRADA REPETIDO");
        System.out.println("Se creo el tipo de entrada: "+profeAprobame.agregarUnTipoDeEntrada("normal")); // no es posible agregar otra entrada del mismo tipo

        //mostrando evento
        System.out.println("EVENTO-> ");
        System.out.println(profeAprobame);

        //creamos entradas reales
        Entrada entrada1=new Normal("normal",1,23.4,true,"Palco");
        Entrada entrada2=new Vip("vip",2,50,true,"AGUA GRATIS");
        Entrada entrada3=new Normal("normal",3,23.4,true,"Platea");

        //entradas truchas
        Entrada entrada4=new Normal("normal",1,23.4,true,"Palco");
        Entrada entrada5=new Normal("MEGADELUJO",1,23.4,true,"Palco");


        System.out.println("CARGA DE ENTRADAS");
        System.out.println("Se pudo cargar la entrada actual: "+profeAprobame.cargarEntrada(entrada1));
        System.out.println("Se pudo cargar la entrada actual: "+profeAprobame.cargarEntrada(entrada2));
        System.out.println("Se pudo cargar la entrada actual: "+profeAprobame.cargarEntrada(entrada3));

        //prueba cargando una entrada repetida
        System.out.println("PRUEBA CARGANDO UNA ENTRADA CON MISMO ID");
        System.out.println("Se pudo cargar la entrada actual: "+profeAprobame.cargarEntrada(entrada4));
        //prueba cargando una entrada que no existe el tipo
        System.out.println("PRUEBA CARGANDO UNA ENTRADA QUE NO EXISTE EL TIPO");
        System.out.println("Se pudo cargar la entrada actual: "+profeAprobame.cargarEntrada(entrada5));

        System.out.println("ENTRADAS");
        System.out.println(profeAprobame.getEntradas());
        //pruebas
        System.out.println("PRUEBAS");
        System.out.println("Entrada vendida: "+profeAprobame.venderUnaEntrada("normal"));
        System.out.println("Entrada vendida: "+profeAprobame.venderUnaEntrada("vip"));

        System.out.println("PRUEBA VENDER ENTRADAS NO DISPONIBLES");
        System.out.println("Entrada vendida: "+profeAprobame.venderUnaEntrada("vip")); // no me ve a vender debido a que no hay mas disponibles


        System.out.println("TOTALES");
        System.out.println("Monto total recaudado: "+ profeAprobame.dineroTotalRecaudado());
        System.out.println("Cant de entradas en total: "+profeAprobame.obtenerCantidadDeEntradasEnTotal());
        System.out.println("Cant de entradas x tipo: "+profeAprobame.obtenerCantidadDeEntradasXTipo("normal"));
        System.out.println("Cant de entradas disponibles en total: "+profeAprobame.obtenerCantidadDeEntradasDisponiblesEnTotal());
        System.out.println("Cant de entradas disponibles x tipo: "+ profeAprobame.obtenerCantidadDeEntradasDisponiblesXTipo("vip"));
        System.out.println("Listado de entradas x tipo: "+ profeAprobame.mostrarListadoEntradasDisponiblesXTipo("vip"));
        System.out.println("Listado de entradas en total(se muestran abajo): "+ profeAprobame.mostrarListadoEntradasDisponiblesEnTotal());


    }
}