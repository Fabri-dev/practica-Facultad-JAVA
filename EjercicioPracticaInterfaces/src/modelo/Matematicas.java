package modelo;

import interfaces.IExtremos;

import java.util.LinkedList;

public class Matematicas implements IExtremos {
    //atributos
    LinkedList<Double> listaEnlazada;
    //constructores
    public Matematicas()
    {
        listaEnlazada=new LinkedList<>();
    }
    //get y set

    public LinkedList<Double> getListaEnlazada() {
        return listaEnlazada;
    }

    //metodos

    public void agregar(Double aux)
    {
        listaEnlazada.add(aux);
    }

    @Override
    public String toString() {
        return "Matematicas{" +
                "listaEnlazada=" + listaEnlazada +
                '}';
    }

    @Override
    public double inicio() {
        return listaEnlazada.getFirst();
    }

    @Override
    public double fin() {
        return listaEnlazada.getLast();
    }
}
