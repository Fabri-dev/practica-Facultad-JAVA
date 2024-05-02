package modelo;

public class PaqueteTierra extends Paquete{
    //atributos
    private double distanciaDeEnvio;
    private String tipoVehiculo;

    //constructores


    public PaqueteTierra() {
        super();
        distanciaDeEnvio=0.0;
        tipoVehiculo="";

    }

    public PaqueteTierra(double peso, String destino, boolean seguroEnvio, boolean entregaMismoDia, double distanciaDeEnvio, String tipoVehiculo) {
        super(peso, destino, seguroEnvio, entregaMismoDia);
        this.distanciaDeEnvio = distanciaDeEnvio;
        this.tipoVehiculo = tipoVehiculo;
    }

    //get y set

    public double getDistanciaDeEnvio() {
        return distanciaDeEnvio;
    }

    public void setDistanciaDeEnvio(double distanciaDeEnvio) {
        this.distanciaDeEnvio = distanciaDeEnvio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


    //metodos


    @Override
    public String toString() {
        return super.toString()+"PaqueteTierra{" +
                "distanciaDeEnvio=" + distanciaDeEnvio +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }

    @Override
    public double calcularTarifaEnvio() {
        double tarifaEnvio=super.getPeso()*25;

        if (tipoVehiculo.equalsIgnoreCase("camion")) //compara si es igual ignorando las diferencias mayusc
        {
            tarifaEnvio*=1.1;
        }

        if (distanciaDeEnvio > 100) // si la tarifa es mayor a 100
        {
            for (int i=0; i < distanciaDeEnvio-100; i++) // calculo la tarifa un 5% mas cada 1km
            {
                tarifaEnvio*=1.05;
            }
        }
        return tarifaEnvio;
    }

    @Override
    public double calcularCostoAdicional() {
        double costoAd= this.calcularTarifaEnvio();

        if (super.isSeguroEnvio())
        {
            costoAd+=1500;
        }
        if (super.isEntregaMismoDia())
        {
            costoAd*=1.25;
        }
        return costoAd;
    }

    @Override
    public double calcularTotalFinal() {
        return this.calcularCostoAdicional();
    }
}
