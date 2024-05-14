package modelo;

import java.util.LinkedList;

public class Pila <E>{
    //atributos
    LinkedList<E> pilita;
    E tope;

    //constructores

    public Pila() {
        pilita= new LinkedList<>();
        tope=null;
    }

    //get y set

    public LinkedList<E> getPilita() {
        return pilita;
    }

    public E getTope() {
        return tope;
    }

    //metodos

    public boolean apilar(E nuevoElemento)
    {
        tope=nuevoElemento;
        return pilita.add(nuevoElemento);
    }

    public E desapilar()
    {
        E desapilado= pilita.removeLast();
        tope=pilita.getLast();
        return desapilado;
    }

    public boolean estaVacia()
    {
        return pilita.isEmpty();
    }

    public int contarTotal()
    {
        return pilita.size();
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pilita=" + pilita +
                ", tope=" + tope +
                '}';
    }
}
