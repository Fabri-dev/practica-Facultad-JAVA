package modelo;

import interfaces.IIngresar;

public class Carguero extends TipoAvion implements IIngresar {
    //atributos
    private double cantKilos;
    private String productosATransportar;

    //constructores

    public Carguero(String nombreModelo, String marca, double capacidadCombustible, String tipoMotor, String patente, double cantKilos, String productosATransportar) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, 0, patente);
        this.cantKilos = cantKilos;
        this.productosATransportar = productosATransportar;
    }


    //get y set

    public double getCantKilos() {
        return cantKilos;
    }

    public void setCantKilos(double cantKilos) {
        this.cantKilos = cantKilos;
    }

    public String getProductosATransportar() {
        return productosATransportar;
    }

    public void setProductosATransportar(String productosATransportar) {
        this.productosATransportar = productosATransportar;
    }


    //metodos


    @Override
    public String toString() {
        return super.toString()+ "Carguero{" +
                "cantKilos=" + cantKilos +
                ", productosATransportar='" + productosATransportar + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Carguero avion)
            {
                if (super.getPatente().equals(avion.getPatente()))
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
    public boolean ingresar() {
        int num= (int) (Math.floor(Math.random()));
        boolean flag= false;
        if (num ==1)
        {
            flag=true;
        }
        return flag;
    }

    @Override
    public String despegar() {
        return "Avion carguero despega";
    }

    @Override
    public String aterrizar() {
        return "Avion Carguero aterriza";
    }

    @Override
    public String volar() {
        return "Avion Carguero vuela";
    }

    public String descargarContenido()
    {
        return "Descargando contenido";
    }
}
