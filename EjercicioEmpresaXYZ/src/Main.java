import modelo.EAsalariado;
import modelo.EComision;
import modelo.Empleado;
import modelo.GestoraDeEmpleados;

//respuesta ejercicio 1:
/*
    La salida por pantalla no tendra ningun error. El llamado al metodo .estatica()
    se podra efectuar ya que es un metodo propio de la clase abstracta A, recordar
    que A no esta instanciado sino que estaria "conteniendo" las clases hijas.
    El metodo .dinamica() se podra ejecutar debido a que las clases B y C heredan
    el metodo abstracto de A, y estos luego lo implementan dandole un cuerpo con codigo
    pudiendo asi, ser instanciados. Por ligadura dinamica podemos llamar a los metodos
    .dinamica(), ya que primero se "buscara" el metodo en el tipo de dato dinamico
    el cual esta almacenado en el tipo de dato estatico
*/
public class Main {
    public static void main(String[] args)
    {
        GestoraDeEmpleados empleados = new GestoraDeEmpleados();


        //el anio de ingreso deberia calcularse en realidad obteniendo el anio de la maquina y restandole el anio que ingreso el empleado
        empleados.agregar(new EAsalariado("569587A","Javier","Gómez",2024-2008,1225.0));
        empleados.agregar(new EComision("695235B","Eva","Nieto",179,8.1,2024-2010));
        empleados.agregar(new EComision("741258C","Jose","Ruiz",81,7.9,2024-2012));
        empleados.agregar(new EAsalariado("896325D","Maria","Nuniez",2024-2013,1155.0));

        System.out.println(empleados.obtenerInfoTotal());


    }
}