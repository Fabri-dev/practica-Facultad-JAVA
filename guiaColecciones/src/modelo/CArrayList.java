package modelo;

import interfaces.IMetodosEspeciales;

import java.util.ArrayList;
import java.util.Objects;

public class CArrayList implements IMetodosEspeciales {
    //atributos
    private ArrayList<Integer> arreglito;

    //constructores

    public CArrayList()
    {
        arreglito=new ArrayList<>();
    }

    //get y set

    public ArrayList<Integer> getArreglito() {
        return arreglito;
    }

    //metodos


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof CArrayList)
            {
                CArrayList aux= (CArrayList) o;
                if (this.arreglito.equals(aux.getArreglito()))
                {
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public void agregar(Object o) {
        if (o != null && o instanceof Integer)
        {
            
        }

    }

    @Override
    public boolean eliminar(Object o) {
        return false;
    }

    @Override
    public boolean buscar(Object o) {
        return false;
    }

    @Override
    public String listar() {
        return "";
    }

    @Override
    public int contar() {
        return 0;
    }

    @Override
    public String toString() {
        return "CArrayList{" +
                "arreglito=" + arreglito +
                '}';
    }
}
