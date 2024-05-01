package modelo;

import interfaces.IColeccionInterfaz;

import javax.swing.plaf.SpinnerUI;
import java.util.ArrayList;

public class Pila implements IColeccionInterfaz {
    //atributos
    private ArrayList<Integer> pilita;
    private int contadorPila;
    //constructores

    public Pila() {
        pilita=new ArrayList<>();
        contadorPila=0;
    }

    //get y set

    public ArrayList<Integer> getPilita() {
        return pilita;
    }

    public int getContadorPila() {
        return contadorPila;
    }


    //metodos


    @Override
    public String toString() {
        return "Pila{" +
                "pilita=" + pilita +
                ", contadorPila=" + contadorPila +
                '}';
    }

    @Override
    public boolean estaVacia() {
        boolean flag=false;
        if (contadorPila==0)
        {
            flag=true;
        }
        return flag;
    }

    @Override
    public Integer extraer() {
        Integer aux=null;
        if (contadorPila != 0)
        {
            aux=pilita.getLast();
            pilita.remove(contadorPila-1);
            contadorPila--;
        }
        return aux;
    }

    @Override
    public Integer primero() {
        Integer aux=null;
        if (contadorPila !=0)
        {
            aux=pilita.getLast();
        }

        return aux;
    }

    @Override
    public boolean agregar(Integer nuevoDato) {
        pilita.add(nuevoDato);
        contadorPila++;
        return true;
    }
}
