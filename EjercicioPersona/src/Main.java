import modelo.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre,sexo,nacionalidad,dni;
        int edad;
        double peso,altura;
        ArrayList<Persona> personas= new ArrayList<>();
        Persona persona1,persona2,persona3;
        System.out.println("Ingresar datos: ");

        System.out.println("Nombre: ");
        scanner.nextLine();
        nombre= scanner.nextLine();

        System.out.println("DNI: ");
        scanner.nextLine();
        dni= scanner.nextLine();

        System.out.println("Nacionalidad: ");
        scanner.nextLine();
        nacionalidad= scanner.nextLine();

        System.out.println("Sexo: Hombre o Mujer ");
        scanner.nextLine();
        sexo= scanner.nextLine();

        System.out.println("Edad: ");
        edad=scanner.nextInt();
        System.out.println("Peso: ");
        peso=scanner.nextDouble();
        System.out.println("Altura: ");
        altura=scanner.nextDouble();

        persona1=new Persona(nombre,nacionalidad,dni,edad,sexo.charAt(0),peso,altura);
        personas.add(persona1);
        persona2=new Persona(nombre,edad,sexo.charAt(0));
        personas.add(persona2);
        persona3= new Persona();
        personas.add(persona3);

        for(Persona personita: personas)
        {
            System.out.println("PERSONA: ");
            System.out.println(personita.calcularIMC());
            System.out.println(personita.esMayorDeEdad());
            System.out.println(personita + "\n");
        }




    }
}