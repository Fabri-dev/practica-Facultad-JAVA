package modelo;

import interfaces.IServicioSimples;

public class Comercial extends TipoAvion implements IServicioSimples {
    //atributos

    private int cantAzafatas;
    private String listaServicios;

    //constructores

    public Comercial(String nombreModelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, String patente, int cantAzafatas, String listaServicios) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos, patente);
        this.cantAzafatas = cantAzafatas;
        this.listaServicios = listaServicios;
    }


    //get y set

    public int getCantAzafatas() {
        return cantAzafatas;
    }

    public void setCantAzafatas(int cantAzafatas) {
        this.cantAzafatas = cantAzafatas;
    }

    public String getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(String listaServicios) {
        this.listaServicios = listaServicios;
    }


    //metodos

    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Comercial avion)
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
    public String toString() {
        return super.toString()+"Comercial{" +
                "cantAzafatas=" + cantAzafatas +
                ", listaServicios='" + listaServicios + '\'' +
                '}';
    }

    @Override
    public String servirComida() {

        return "Se sirve comida en comercial";
    }

    @Override
    public String darMantasParaFrio() {
        return "Se dan mantas en comercial";
    }

    @Override
    public String despegar() {
        return "El avion comercial despega";
    }

    @Override
    public String aterrizar() {
        return "El avion comercial aterriza";
    }

    @Override
    public String volar() {
        return "El avion comercial vuela";
    }
}
