package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Aeropuerto {
    //atributos
    private String nombreAeropuerto;
    private String codigoInternacional; //MDQ
    private int capacidadOperacion;//cant de aviones que puede aguantar
    private String direccion;
    private HashMap<Integer,Hangar> hangares;
    //HANGARES ID: 1= Comercial, 2=Privado, 3=Carguero, 4=Militar
    //constructores

    public Aeropuerto(String nombreAeropuerto, String codigoInternacional, int capacidadOperacion,String direccion) {
        this.nombreAeropuerto = nombreAeropuerto;
        this.codigoInternacional = codigoInternacional;
        this.capacidadOperacion = capacidadOperacion;
        this.direccion=direccion;
        hangares= new HashMap<>();
        setHangares();
    }

    //get y set

    private void setHangares()
    {
        hangares.put(1,new Hangar(1,0));
        hangares.put(2,new Hangar(2,0));
        hangares.put(3,new Hangar(3,0));
        hangares.put(4,new Hangar(4,0));
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public String getCodigoInternacional() {
        return codigoInternacional;
    }

    public int getCapacidadOperacion() {
        return capacidadOperacion;
    }

    public HashMap<Integer, Hangar> getHangares() {
        return hangares;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public void setCapacidadOperacion(int capacidadOperacion) {
        this.capacidadOperacion = capacidadOperacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodos


    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombreAeropuerto='" + nombreAeropuerto + '\'' +
                ", codigoInternacional='" + codigoInternacional + '\'' +
                ", capacidadOperacion=" + capacidadOperacion +
                ", direccion='" + direccion + '\'' +
                ", hangares=" + hangares +
                '}';
    }

    public boolean hayEspacio()
    {
        boolean flag=false;
        if (contarCantTotalAviones() < capacidadOperacion)
        {
            flag=true;
        }
        return flag;
    }

    public int contarCantTotalAviones()
    {
        //recoleto de todos los hangares la cantidad de aviones que hay estacionados
        int cont=0;
        Iterator<Map.Entry<Integer, Hangar>> iterator= hangares.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<Integer,Hangar> datoActual= iterator.next();
            Hangar hangar= datoActual.getValue();
            cont+=hangar.contarCantidadAvionesGuardados();
        }

        return cont;
    }

    public String ingresarAvion(TipoAvion nuevoAvion)
    {
        String s="";


        if (hayEspacio()) // si hay espacio
        {
            if (guardarAvionEnHangarCorrecto(nuevoAvion)) // si el avion a agregar no es el mismo (compruebo la patente)
            {
                //si este metodo retorna true, se agrega el avion
                //sino no se agrega
                s="Avion agregado!";
            }
            else {
                s="Ese avion ya existe, tienen la misma patente";
            }
        }
        else {
            s="Capacidad de aviones esta al limite";
        }
        return s;
    }

    private boolean guardarAvionEnHangarCorrecto(TipoAvion nuevoAvion)
    {
        Hangar aux;
        boolean flag=false;
        if (nuevoAvion != null)
        {
            if (nuevoAvion instanceof Comercial)
            {
               aux= hangares.get(1); // key 1 es para comerciales
               flag=aux.agregarAvionHangar(nuevoAvion);

            } else if (nuevoAvion instanceof Privado) {
                aux= hangares.get(2); //key 2 es para privados
                flag=aux.agregarAvionHangar(nuevoAvion);

            }else if(nuevoAvion instanceof Carguero)
            {
                aux= hangares.get(3); // key 3 es par cargueros
                flag=aux.agregarAvionHangar(nuevoAvion);

            } else if (nuevoAvion instanceof Militar) {
                aux= hangares.get(4); // key 4 es para militares
                flag=aux.agregarAvionHangar(nuevoAvion);
            }
        }



        return flag;
    }





}
