package Modelo;

import java.util.Objects;

public abstract class Pokemon {
    //atributos
    private String nombre;
    private String tipo;
    private String color;
    private String rareza;
    private int nivel;
    private boolean enPokedex;

    //constructores

    public Pokemon(String tipo, String nombre, String color, int nivel, String rareza){
        this.tipo=tipo;
        this.nombre=nombre;
        this.color= color;
        this.nivel= nivel;
        this.rareza=rareza;
        this.enPokedex = true;
    }



    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getRareza() {
        return rareza;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean getEnPokedex(){
        return enPokedex;
    }

    //metodos

    public String ataqueBasico(){
        String s="Pokemon almacenado en pokedex, no puede atacar";

        if (!enPokedex){
            s="Pokemon seleccionado lanza un ataque basico";
        }

        return s;
    }

    public String defensaBasica(){
        String s="Pokemon almacenado en pokedex, no puede defenderse";

        if (!enPokedex){
            s="Pokemon seleccionado se defiende con defensa basico";
        }

        return s;
    }

    public String almacenarEnPokedex(){
        String s="Pokemon ya esta almacenado en la pokedex";
        if (!enPokedex){
            s="Pokemon ha sido almacenado en la pokedex";
        }
        return s;
    }

    public String retirarEnPokedex(){
        String s="Pokemon ya esta fuera de la pokedex";
        if (enPokedex){
            s="Pokemon retirado de la pokedex, ahora esta contigo";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", rareza=" + rareza +
                ", nivel=" + nivel +
                ", enPokedex=" + enPokedex +
                '}';
    }

}
