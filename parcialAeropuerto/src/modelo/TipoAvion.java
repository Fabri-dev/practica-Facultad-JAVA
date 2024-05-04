package modelo;

import java.util.Objects;

public abstract class TipoAvion {
    //atributos
    private String nombreModelo;
    private String marca;
    private double capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;
    private String patente;

    //constructores
    public TipoAvion()
    {
        nombreModelo="Sin nombreModelo";
        marca="Sin marca";
        capacidadCombustible=0.0;
        tipoMotor="Sin tipoMotor";
        cantidadAsientos=0;
        patente= "Sin patente";
    }

    public TipoAvion(String nombreModelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos,String patente) {
        this.nombreModelo = nombreModelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
        this.patente=patente;
    }

    //get y set


    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getPatente() {
        return patente;
    }

    //metodos


    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if(o instanceof TipoAvion aux)
            {
                if (this.patente.equals(aux.getPatente()))
                {
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "TipoAvion{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos +
                ", patente='" + patente + '\'' +
                '}';
    }

    public abstract String despegar();
    public abstract String aterrizar();
    public abstract String volar();
}
