package modelo;

import java.util.ArrayList;

public class GestoraPaquetes {
    //atributos
    private ArrayList<Paquete> paquetes;
    //constructor

    public GestoraPaquetes() {
        paquetes=new ArrayList<>();
    }

    //get y set

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    //metodos

    @Override
    public String toString() {
        return "GestoraPaquetes{" +
                "paquetes=" + paquetes +
                '}';
    }

    public void agregarUnPaquete(Paquete nuevoPaquete)
    {
        nuevoPaquete.setId(this.buscarUltimoId());
        paquetes.add(nuevoPaquete);
    }

    private int buscarUltimoId()
    {
        int ultId=1;
        if (!paquetes.isEmpty())
        {
            for(Paquete paquetito: paquetes)
            {
                if (paquetito.getId() >= ultId)
                {
                    ultId= paquetito.getId()+1;
                }
            }
        }

        return ultId;
    }

    public int cantidadTotalPaquetes()
    {
        return paquetes.size();
    }

    public int cantidadPaquetesEnviados()
    {
        int cont=0;
        for (Paquete paquetito: paquetes)
        {

            if (paquetito.isEnviado())
            {
                cont++;
            }
        }
        return cont;
    }
    public int cantidadPaquetesNoEnviados()
    {
        int cont=0;
        for (Paquete paquetito: paquetes)
        {

            if (!paquetito.isEnviado())
            {
                cont++;
            }
        }
        return cont;
    }

    public String listarTodosLosPaquetes()
    {
        return this.toString();
    }
}
