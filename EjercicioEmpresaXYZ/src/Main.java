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

/* Respuesta ejercicio:TestFlujo

La clase abstracta Flujo tiene 3 metodos polimorficos que se llaman igual pero reciben por
parametro distintos tipos de datos, uno es un metodo abstracto el cual recibe un char,
los otros dos son estaticos, el primero recibe un String e imprime en un bucle for(que tiene dura
la longitud del String), tiene un sout y llama a al metodo .escribe que recibe un char(El cual todavia no
se le dio una funcion/cuerpo al metodo), y por ultimo tiene un metodo llamado escribe que recibe un entero
y lo imprime por pantalla como un String

La clase Disco hereda de Flujo y le da un cuerpo al metodo abstracto necesario

La clase DiscoFlexible hereda de Disco y sobreEscribe el metodo de .escribir que recibe un String, haciendo
un sout desde su clase y luego llamando a la clase padre

En la ejecucion de este codigo, se activara la ligadura dinamica, ya que la clase abstracta Flujo
contiene a la clase DiscoFlexible. Al llamar al metodo f.escribe("ab"), primero se activara el metodo
de DiscoFlexible debido a que primero se busca el metodo en el tipo de dato dinamico que esta asignado en el estatico,
luego al llamar a la clase padre de DiscoFlexible, la cual es Disco, utilizando un super, pero no se podra
utilizar el metodo de Disco debido a que el metodo de Disco solo acepta un Char, entonces
se activa el camino de migas y se buscara el metodo requerido a la otra clase padre(Flujo)
la cual si tiene ese metodo y ahi se termina el camino de migas y se ejecuta el metodo requerido. 
*/

/*
  abstract class A {

        int i;

        A(int i)
        {
            this.i = i;
        }
    }

    class B extends A {

        void metodo() {
            System.out.println(i);
        }
    }

    class Cuestion {

        public static void main2(String[] args) {
            A[] v = new A[10];
            for (int i = 0; i < 10; i++)
            {

                v[i] = new B();
                v[i].metodo();
            }


El primer error que tiene el codigo mostrado es que se necesita que el constructor de la clase B construya
a la clase abstracta A, ya que sino no se puede aplicar la herencia y por lo tanto la clase B no existiria.
El segundo error se debe a que se esta almacenando B por ppio de sustitucion en A. Lo que provocara que cuando
se quiera llamar a los metodos, se mostraran los de A y no los de B, para que se muestren los de B, hay que
castear B cada vez que se itere por el arreglo.
*/
