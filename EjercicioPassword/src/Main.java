import modelo.Contrasenia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Contrasenia> contrasenias= new ArrayList<>();
        ArrayList<Boolean> fortalezaContrasenias= new ArrayList<>();

        int numeroDeContrasenias=0,longitudContrasenias=0;
        System.out.println("Cuantas contrasenias quiere crear/ingresar");
        numeroDeContrasenias=scanner.nextInt();
        System.out.println("Ingrese la longitud que quiere que tengan las contrasenias: ");
        longitudContrasenias= scanner.nextInt();

        for (int i=0; i < numeroDeContrasenias;i++)
        {
            Contrasenia aux=new Contrasenia(longitudContrasenias);
            contrasenias.add(aux);
            fortalezaContrasenias.add(aux.esFuerte());

            System.out.println(contrasenias.get(i)+" "+fortalezaContrasenias.get(i));
        }





    }
}