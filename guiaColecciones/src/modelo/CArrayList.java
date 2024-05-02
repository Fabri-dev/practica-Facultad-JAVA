package modelo;

import interfaces.IMetodosEspeciales;

import java.util.ArrayList;

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
    public boolean agregar(Object o) {
        boolean flag=false;
        if (o != null && o instanceof Integer)
        {
            Integer aux=(Integer) o;
            flag=arreglito.add(aux);
        }
        return flag;
    }

    @Override
    public boolean eliminar(Object o) {
        boolean flag=false;
        if (o != null && o instanceof Integer aux)
        {
            flag= arreglito.remove(aux); // si no se encuentra retorna false, si se elimina retorna true
        }
        return flag;
    }

    @Override
    public boolean buscar(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Integer aux)
            {
                flag= arreglito.contains(aux);
            }
        }
        return flag;
    }

    @Override
    public String listar() {
        return this.toString();
    }

    @Override
    public int contar() {
        return arreglito.size();
    }

    @Override
    public String toString() {
        return "CArrayList{" +
                "arreglito=" + arreglito +
                '}';
    }
}
