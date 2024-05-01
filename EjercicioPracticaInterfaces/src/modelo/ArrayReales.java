package modelo;

import interfaces.IEstadisticas;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayReales implements IEstadisticas {
    //atributos
    private ArrayList<Double> reales;
    //constructores

    public ArrayReales() {
        reales=new ArrayList<>();
    }

    //get y set

    public ArrayList<Double> getReales() {
        return reales;
    }

    //metodos


    @Override
    public String toString() {
        return "ArrayReales{" +
                "reales=" + reales +
                '}';
    }

    @Override
    public double minimo() {
        double min= reales.getFirst();

        for(Double actual:reales)
        {
            if (actual < min)
            {
                min=actual;
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max = reales.getFirst();

        for(Double actual:reales)
        {
            if (actual > max)
            {
                max =actual;
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        Double sum=0.0;
        for (Double actual: reales)
        {
            sum+= actual;
        }
        return sum;
    }

    public void agregar(Double aux)
    {
        reales.add(aux);
    }

}
