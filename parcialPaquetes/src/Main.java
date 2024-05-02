
import modelo.*;


public class Main {

    public static void main(String[] args) {
        GestoraPaquetes gestoraPaquetes= new GestoraPaquetes();
       Paquete paquete1= new PaqueteTierra(10.5,"Cordoba",true,true,105,"Camion");
       Paquete paquete2= new PaqueteAire(4.5,"Chile",false,true,"aa",true);
       Paquete paquete3= new PaqueteAire(3.2,"japon",true,false,"asdasd",false);

        gestoraPaquetes.agregarUnPaquete(paquete1);
        gestoraPaquetes.agregarUnPaquete(paquete2);
        gestoraPaquetes.agregarUnPaquete(paquete3);

        System.out.println(paquete1);
        System.out.println("tarifa envio: "+paquete1.calcularTarifaEnvio());
        System.out.println("tarifa adicional"+ paquete1.calcularCostoAdicional());
        System.out.println("total: "+paquete1.calcularTotalFinal());
        System.out.println(paquete2);
        System.out.println("total: "+paquete2.calcularTotalFinal());
        System.out.println(paquete3);
        System.out.println("total: "+paquete3.calcularTotalFinal());

        System.out.println(gestoraPaquetes);

        System.out.println("Total paquetes: "+gestoraPaquetes.cantidadTotalPaquetes());
        System.out.println(gestoraPaquetes.getPaquetes().getFirst().enviar());
        System.out.println(paquete1.enviar());
        System.out.println(gestoraPaquetes.cantidadPaquetesEnviados());
        System.out.println(gestoraPaquetes.cantidadPaquetesNoEnviados());




    }

}