import modelo.ArrayReales;
import modelo.Matematicas;
import modelo.Numero;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayReales arrayReales= new ArrayReales();

        Matematicas matematicas= new Matematicas();

        Numero numerito=new Numero(10);




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
    }
}