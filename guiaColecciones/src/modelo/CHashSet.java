package modelo;

import interfaces.IMetodosEspeciales;

import java.util.HashSet;
import java.util.Iterator;

public class CHashSet implements IMetodosEspeciales {
    //atributos

    HashSet<Integer> hashito;

    //constructores

    public CHashSet()
    {
        hashito = new HashSet<>();
    }

    //get y set

    public HashSet<Integer> getHashito() {
        return hashito;
    }

    //metodos

    @Override
    public String toString() {
        return "CHashSet{" +
                "hashito=" + hashito +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       boolean flag=false;
        if (o != null)
        {
           if (o instanceof CHashSet aux)
           {
               flag= hashito.equals(aux.getHashito());
           }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean agregar(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Integer)
            {
                Integer aux= (Integer) o;
                flag=hashito.add(aux);
            }
        }
        return flag;
    }

    @Override
    public boolean eliminar(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Integer)
            {
                Integer aux= (Integer) o;
                flag=hashito.remove(aux);
            }
        }
        return flag;
    }

    @Override
    public boolean buscar(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Integer)
            {
                Integer aux= (Integer) o;
                flag=hashito.contains(aux);
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
        return hashito.size();
    }
}
