package modelo;

import java.sql.SQLClientInfoException;

public abstract class Vehiculo {
    //atributos
    private String marca;
    private String modelo;
    private String tipoCombustible;
    private String patente;
    private boolean disponible;
    private Cliente pasajero;
    private double montoRecaudado;

    //constructores

    public Vehiculo()
    {
        marca="";
        modelo="";
        tipoCombustible="";
        patente="";
        pasajero= null;
        disponible=false;
        montoRecaudado=0.0;
    }

    public Vehiculo(String marca, String modelo, String tipoCombustible, String patente, boolean disponible, Cliente pasajero, double montoRecaudado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.patente = patente;
        this.disponible = disponible;
        this.pasajero = pasajero;
        this.montoRecaudado = montoRecaudado;
    }

    public Vehiculo(String marca, String modelo, String tipoCombustible, String patente, boolean disponible, double montoRecaudado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.patente = patente;
        this.disponible = disponible;
        this.pasajero = null;
        this.montoRecaudado = montoRecaudado;
    }

    //get y set


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getPatente() {
        return patente;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Cliente getPasajero() {
        return pasajero;
    }

    public void setPasajero(Cliente pasajero) {
        this.pasajero = pasajero;
    }

    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    //metodos

    public String empezarViaje()
    {
        disponible= false;
    }



}
