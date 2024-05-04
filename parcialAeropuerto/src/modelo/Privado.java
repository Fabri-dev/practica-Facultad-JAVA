package modelo;

import interfaces.IServicioSimples;

public class Privado extends TipoAvion implements IServicioSimples {
    //atributos

    private boolean tieneJacuzzi;
    private String claveWifi;

    //constructores

    public Privado(String nombreModelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, String patente, boolean tieneJacuzzi, String claveWifi) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos, patente);
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }


    //get y set


    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }


    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    //metodos
    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Privado avionPrivado)
            {
                if (super.getPatente().equals(avionPrivado.getPatente()))
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
        return "Privado{" +
                "tieneJacuzzi=" + tieneJacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                '}';
    }

    public boolean verMundial() {
        int num= (int) (Math.round(Math.random()));
        boolean flag=false;
        if (num == 1)
        {
            flag=true;
        }
        return flag;
    }

    @Override
    public String servirComida() {
        return "Avion privado sirve comida";
    }

    @Override
    public String darMantasParaFrio() {
        return "Se dan mantas para el frio en avion privado";
    }

    @Override
    public String despegar() {
        return "El avion privado despega";
    }

    @Override
    public String aterrizar() {
        return "El avion privado aterriza";
    }

    @Override
    public String volar() {
        return "El avion privado vuela";
    }
}
