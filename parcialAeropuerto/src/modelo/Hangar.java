package modelo;

import java.util.HashSet;
import java.util.Iterator;

public class Hangar {
    //atributos
    private HashSet<TipoAvion> aviones;
    private int idHangar; //depende el ID van a almacenarse distintos tipoDeAviones
    private int cantAviones;

    //constructores

    public Hangar(int idHangar, int cantAviones) {
        this.aviones = new HashSet<>();
        this.idHangar = idHangar;
        this.cantAviones = cantAviones;
    }

    //get y set

    public HashSet<TipoAvion> getAviones() {
        return aviones;
    }

    public int getIdHangar() {
        return idHangar;
    }

    //metodos


    @Override
    public String toString() {
        return "Hangar{" +
                "aviones=" + aviones +
                ", idHangar=" + idHangar +
                ", cantAviones=" + cantAviones +
                '}';
    }

    public int contarCantidadAvionesGuardados()
    {
        return aviones.size();
    }

    public boolean agregarAvionHangar(TipoAvion nuevoAvion)
    {
        boolean flag=false;
        if (nuevoAvion != null)
        {
            if (!aviones.contains(nuevoAvion)) // si el nuevo avion no es igual a ningun otro avion
            {
                aviones.add(nuevoAvion);
                cantAviones++;
                flag=true;
            }
        }
        return flag;
    }

    public String despegarTodosLosAviones(){
        String s="Hangar vacio, no se despego ningun avion";
        if (!aviones.isEmpty())
        {
            s="";
            Iterator<TipoAvion> iterator= aviones.iterator();
            while (iterator.hasNext())
            {
                s+=iterator.next().despegar()+"\n";
            }
        }
        return s;
    }

}
