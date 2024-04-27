package Modelo;

import InstanciaPokemones.PokemonAgua;
import InstanciaPokemones.PokemonElectrico;
import InstanciaPokemones.PokemonFuego;
import InstanciaPokemones.PokemonTierra;

import java.util.ArrayList;
import java.util.Objects;

public class Pokedex {
    //atributos
    private ArrayList<Pokemon> pokemonesEnLaPokedex= new ArrayList<>();
    private static int maxPokemones=10;
    private String nombreEntrenador;

    private int cantAgua;
    private int cantFuego;
    private int cantTierra;
    private int cantElectrico;


    //constructores

    public Pokedex(ArrayList<Pokemon> pokemonesEnLaPokedex, String nombreEntrenador) {
        this.pokemonesEnLaPokedex = pokemonesEnLaPokedex;
        this.nombreEntrenador = nombreEntrenador;
        this.cantAgua = 0;
        this.cantFuego = 0;
        this.cantTierra = 0;
        this.cantElectrico = 0;
    }

    //getters y setters

    public ArrayList<Pokemon> getPokemonesEnLaPokedex() {
        return pokemonesEnLaPokedex;
    }

    public static int getMaxPokemones() {
        return maxPokemones;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public int getCantAgua() {
        return cantAgua;
    }

    public int getCantFuego() {
        return cantFuego;
    }

    public int getCantTierra() {
        return cantTierra;
    }

    public int getCantElectrico() {
        return cantElectrico;
    }


    //metodos

    public void agregarPokemon(Pokemon nuevoPokemon){

        if (nuevoPokemon != null) // falta la validacion si es una clase distinta a un pokemon. ej: perro
        {
            if (nuevoPokemon instanceof PokemonAgua)
            {
                cantAgua++;
            } else if (nuevoPokemon instanceof PokemonElectrico)
            {
                cantElectrico++;
            } else if (nuevoPokemon instanceof PokemonFuego)
            {
                cantFuego++;
            } else if (nuevoPokemon instanceof PokemonTierra)
            {
                cantTierra++;
            }


            pokemonesEnLaPokedex.add(nuevoPokemon);
        }


    }

    public void eliminarPokemon(String nombrePokeAEliminar)
    {
        for (Pokemon pokemon: pokemonesEnLaPokedex) {
            if (pokemon.getNombre().equals(nombrePokeAEliminar))
            {
                pokemonesEnLaPokedex.remove(pokemon);
            }
        }
    }

    @Override
    public String toString() {
        return "Pokedex{" +
                "pokemonesEnLaPokedex=" + pokemonesEnLaPokedex +
                ", nombreEntrenador='" + nombreEntrenador + '\'' +
                ", cantAgua=" + cantAgua +
                ", cantFuego=" + cantFuego +
                ", cantTierra=" + cantTierra +
                ", cantElectrico=" + cantElectrico +
                '}';
    }



}
