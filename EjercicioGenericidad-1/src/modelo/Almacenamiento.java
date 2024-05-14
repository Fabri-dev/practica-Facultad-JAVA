package modelo;

import java.util.ArrayList;

public class Almacenamiento<E> {
    //atributos
    private int cantElementos;
    ArrayList<E> elementosGuardados;
    //constructor
    public Almacenamiento() {
        cantElementos=0;
        elementosGuardados =new ArrayList<>();
    }

    //get y set

    public int getCantElementos() {
        return cantElementos;
    }

    public ArrayList<E> getElementosGuardados() {
        return elementosGuardados;
    }

    //metodos

    @Override
    public String toString() {
        return "Almacenamiento{" +
                "cantElementos=" + cantElementos +
                ", elementosGuardados=" + elementosGuardados +
                '}';
    }

    public boolean agregarElementos(E elementoNuevo)
    {
        boolean flag=elementosGuardados.add(elementoNuevo);;
        cantElementos++;
        return flag;
    }

    public boolean eliminarElemento(E elementoAEliminar)
    {
        boolean flag= elementosGuardados.remove(elementoAEliminar);
        cantElementos--;
        return flag;
    }

    public boolean buscarElemento(E e)
    {
        return elementosGuardados.contains(e);
    }

}
