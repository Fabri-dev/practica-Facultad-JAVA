import InstanciaPokemones.PokemonAgua;
import InstanciaPokemones.PokemonElectrico;
import InstanciaPokemones.PokemonFuego;
import InstanciaPokemones.PokemonTierra;
import Modelo.Pokedex;
import Modelo.Pokemon;

import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        String auxNombreEntrenador;
        char op;
        System.out.println("Ingrese el nombre del entrenador para la pokedex: ");
        scanner.nextLine();
        auxNombreEntrenador= scanner.nextLine();


        Pokedex pokedex = new Pokedex(new ArrayList<Pokemon>(),auxNombreEntrenador);

        do {
            System.out.println("------------Ingrese un pokemon a su pokedex-------");

            //menu crear poke
            pokedex.agregarPokemon(instanciarUnPokemon());

            System.out.println("Desea ingresar otro pokemon? s/n");
            scanner.nextLine();
            op=scanner.nextLine().charAt(0);

        }while (op=='s');

        System.out.println(pokedex);

        //menu que hacer con pokedex falta



    }

    public static Pokemon instanciarUnPokemon()
    {
        String auxTipo,auxNombrePoke,auxColor,auxRareza;
        int auxNivel;
        boolean reintentar;
        Pokemon nuevoPokemon=null;

        System.out.println("Ingrese el nombre del pokemon: ");
        scanner.nextLine();
        auxNombrePoke= scanner.nextLine();

        do {
            System.out.println("Ingrese el tipo de pokemon(Agua,Electrico,Fuego,Tierra): ");
            scanner.nextLine();
            auxTipo=scanner.nextLine();

            auxTipo=auxTipo.toLowerCase();

            switch (auxTipo){
                case "agua", "electrico", "fuego", "tierra":
                    reintentar=false;
                    break;
                default:
                    reintentar=true;
                    break;
            }
        }while (reintentar);

        System.out.println("Ingrese el color del pokemon: ");
        scanner.nextLine();
        auxColor = scanner.nextLine();
        System.out.println("Ingrese la rareza del pokemon: ");
        scanner.nextLine();
        auxRareza=scanner.nextLine();
        System.out.println("Ingrese el nivel del pokemon: ");
        auxNivel= scanner.nextInt();

        switch (auxTipo)
        {
            case "agua":
                nuevoPokemon = new PokemonAgua(auxTipo,auxNombrePoke,auxColor,auxNivel,auxRareza);
                break;
            case "electrico":
                nuevoPokemon = new PokemonElectrico(auxTipo,auxNombrePoke,auxColor,auxNivel,auxRareza);
                break;
            case"fuego":
                nuevoPokemon = new PokemonFuego(auxTipo,auxNombrePoke,auxColor,auxNivel,auxRareza);
                break;
            case "tierra":
                nuevoPokemon = new PokemonTierra(auxTipo,auxNombrePoke,auxColor,auxNivel,auxRareza);
                break;
            default:
                break;
        }



        return nuevoPokemon;
    }
}