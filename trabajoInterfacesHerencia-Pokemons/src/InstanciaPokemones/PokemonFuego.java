package InstanciaPokemones;

import Interfaces.ITipoPokemon;
import Modelo.Pokemon;

public class PokemonFuego extends Pokemon implements ITipoPokemon {

    //atributos

    //constructores

    public PokemonFuego(String tipo, String nombre, String color, int nivel, String rareza) {
        super(tipo, nombre, color, nivel, rareza);
    }


    //getters y setters

    //metodos


    @Override
    public String ataqueEspecial() {
        String s="Pokemon almacenado en pokedex, no puede realizar ataque especial";
        if (super.getEnPokedex()){
            s="Pokemon realiza ataque especial de fuego";
        }
        return s;
    }

    @Override
    public String defensaEspecial() {
        String s="Pokemon almacenado en pokedex, no puede realizar defensa especial";
        if (super.getEnPokedex()){
            s="Pokemon realiza defensa especial de fuego";
        }
        return s;
    }


}
