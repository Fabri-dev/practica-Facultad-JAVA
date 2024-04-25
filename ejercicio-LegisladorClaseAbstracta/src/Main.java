import Modelo.Diputado;
import Modelo.Persona;
import Modelo.Senador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Persona> personas= new ArrayList<>();
        char op;
        String auxNombre;
        String auxApellido;
        String auxProvinciaQueRepresenta;
        String auxPartido;
        int auxEdad;
        int opCamaraEnLaQueTrabaja;
        int contSen=0;
        int contDip=0;

        do {

            //informacion general

            System.out.println("Ingrese el nombre de la persona: ");
            auxNombre= scanner.nextLine();
            System.out.println("Ingrese el apellido de la persona: ");
            scanner.nextLine();
            auxApellido= scanner.nextLine();
            System.out.println("Ingrese la edad de la persona");
            auxEdad= scanner.nextInt();
            System.out.println("Ingrese la provincia que representa esa persona");
            scanner.nextLine();
            auxProvinciaQueRepresenta= scanner.nextLine();
            System.out.println("Ingrese el partido que representa esa persona: ");
            scanner.nextLine();
            auxPartido= scanner.nextLine();

            //informacion para la instancia
            System.out.println("En que camara trabaja?: ");
            System.out.println("1. Diputado\n" +
                    "2.Senador");
            opCamaraEnLaQueTrabaja= scanner.nextInt();
            switch (opCamaraEnLaQueTrabaja)
            {
                case 1:
                    personas.add(new Diputado(auxProvinciaQueRepresenta,auxPartido,auxEdad,auxNombre,auxApellido));
                    break;
                case 2:
                    personas.add(new Senador(auxProvinciaQueRepresenta,auxPartido,auxEdad,auxNombre,auxApellido));
                    break;
            }
            System.out.println("Desea ingresar otra persona al sistema?: s/n");
            scanner.nextLine();
            op=scanner.nextLine().charAt(0);
        }while (op=='s');

        for (Persona persona: personas)
        {


            if (persona instanceof Diputado)
            {
                contDip++;
            } else if (persona instanceof Senador) {
                contSen++;
            }

            System.out.println(persona.getInformacionCompleta());
        }

        System.out.println("Hay "+ contSen+" Senador/es y "+ contDip + " Diputado/s");

    }
}