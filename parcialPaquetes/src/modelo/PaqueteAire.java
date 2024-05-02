package modelo;

public class PaqueteAire extends Paquete{
    //atributos
    private String aerolineaActual;
    private boolean express;

    //constructores

    public PaqueteAire()
    {
        super();
        aerolineaActual="";
        express=false;
    }

    public PaqueteAire(double peso, String destino, boolean seguroEnvio, boolean entregaMismoDia, String aerolineaActual, boolean express) {
        super(peso, destino, seguroEnvio, entregaMismoDia);
        this.aerolineaActual = aerolineaActual;
        this.express=express;
    }


    //get y set

    public String getAerolineaActual() {
        return aerolineaActual;
    }

    public void setAerolineaActual(String aerolineaActual) {
        this.aerolineaActual = aerolineaActual;
    }

    public boolean isExpress() {
        return express;
    }

    public void setExpress(boolean express) {
        this.express = express;
    }

    //metodos

    @Override
    public double calcularTarifaEnvio() {
        double tarifaEnvio= super.getPeso()*30;

        if (aerolineaActual.equalsIgnoreCase("aa"))
        {
            tarifaEnvio*=1.5;
        }

        if (express)
        {
            tarifaEnvio+=1000;
        }

        return tarifaEnvio;
    }

    @Override
    public double calcularCostoAdicional() {
        double costoAdicional=this.calcularTarifaEnvio();

        if (super.isEntregaMismoDia())
        {
            costoAdicional*=1.5;
        }
        if (super.isSeguroEnvio())
        {
            costoAdicional+=2500;
        }
        return costoAdicional;
    }

    @Override
    public double calcularTotalFinal() {
        return this.calcularCostoAdicional();
    }

    @Override
    public String toString() {
        return super.toString()+"paqueteAire{" +
                "aerolineaActual='" + aerolineaActual + '\'' +
                ", tipoDeEnvio='" + express + '\'' +
                '}';
    }


}
