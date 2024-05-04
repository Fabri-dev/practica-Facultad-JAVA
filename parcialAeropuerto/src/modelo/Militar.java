package modelo;

import interfaces.IIngresar;

public class Militar extends TipoAvion implements IIngresar {
    //atributos
    private String sistemaDeArmas;
    private int cantBalas;

    //constructores

    public Militar(String nombreModelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, String patente, String sistemaDeArmas, int cantBalas) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos, patente);
        this.sistemaDeArmas = sistemaDeArmas;
        this.cantBalas = cantBalas;
    }


    //get y set

    public String getSistemaDeArmas() {
        return sistemaDeArmas;
    }

    public void setSistemaDeArmas(String sistemaDeArmas) {
        this.sistemaDeArmas = sistemaDeArmas;
    }

    public int getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(int cantBalas) {
        this.cantBalas = cantBalas;
    }


    //metodos


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
        return "Avion militar depegando";
    }

    @Override
    public String aterrizar() {
        return "Avion militar aterriza";
    }

    @Override
    public String volar() {
        return "Avion militar vuela";
    }

    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Militar avion)
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
        return super.toString()+ "Militar{" +
                "sistemaDeArmas='" + sistemaDeArmas + '\'' +
                ", cantBalas=" + cantBalas +
                '}';
    }

    public String disparar(){
        return "Avion militar dispara";
    }
}
