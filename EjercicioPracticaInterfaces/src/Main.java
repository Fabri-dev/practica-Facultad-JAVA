import modelo.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayReales arrayReales= new ArrayReales();

        Matematicas matematicas= new Matematicas();

        Numero numerito=new Numero(10);

        Pila pila= new Pila();

        ArrayList<ElementoLegible> biblioteca=new ArrayList<>();


        for (int i=0; i < 10; i++)
        {
            arrayReales.agregar(Math.random()*1000);
        }
        System.out.println("El max es: "+arrayReales.maximo());
        System.out.println("El min es: "+arrayReales.minimo());
        System.out.println("La suma total es: "+arrayReales.sumatorio());

        for (int i=0; i < 10; i++)
        {
            matematicas.agregar(Math.random()*100);
        }
        System.out.println("El primer elemento es: "+ matematicas.inicio());
        System.out.println("El ultimo elemento es: "+ matematicas.fin());


        System.out.println(numerito);
        System.out.println("Es igual a 10?: "+numerito.esIgual(10));
        System.out.println("Es igual a 11?: "+numerito.esIgual(11));
        System.out.println("Es mayor a 15?: "+numerito.esMayor(15));
        System.out.println("Es mayor a 5?: "+numerito.esMayor(5));
        System.out.println("Es menor a 100?: "+numerito.esMayor(100));
        System.out.println("Es menor a 1?: "+numerito.esMayor(1));

        for (int i=0; i < 10; i++)
        {
            pila.agregar((int) (Math.random()*100));
        }
        System.out.println(pila);
        System.out.println("Contador pila: "+ pila.getContadorPila());
        System.out.println("Esta vacia: "+ pila.estaVacia());
        System.out.println("Se extrajo: "+pila.extraer());
        System.out.println(pila);
        System.out.println("Tope: " + pila.primero());

        biblioteca.add(new Libro(30,"Meditaciones",1998));
        biblioteca.add(new Revista(31,"Marvel",2000,13));

        Libro elemento1 = (Libro) biblioteca.getFirst();
        Revista elemento2= (Revista) biblioteca.getLast();

        System.out.println(elemento1.getInformacion());
        System.out.println(elemento2.getInformacion());

        System.out.println(elemento1.devolver());
        System.out.println(elemento1.prestar());
        System.out.println(elemento1.prestar());
        System.out.println(elemento1.devolver());

    }
}