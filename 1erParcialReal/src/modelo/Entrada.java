package modelo;

import javax.swing.*;
import java.util.HashSet;

public abstract class Entrada {
    //atributos
    private String tipoEntradas;
    private int id;
    private double precio;
    private boolean disponible;

    //constructores
    public Entrada(){
        tipoEntradas="Sin tipo";
        id=0;
        precio=0;
        disponible=false;
    }

    public Entrada(String tipoEntradas, int id, double precio, boolean disponible) {
        this.tipoEntradas = tipoEntradas;
        this.id = id;
        this.precio = precio;
        this.disponible = disponible;
    }

    //get y set

    public String getTipoEntradas() {
        return tipoEntradas;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //metodos


    @Override
    public String toString() {
        return "Entrada{" +
                "tipoEntradas='" + tipoEntradas + '\'' +
                ", id=" + id +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }

    public abstract double obtenerPrecioTotal();
    public abstract String obtenerTipo();

}
