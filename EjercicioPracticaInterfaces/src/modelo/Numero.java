package modelo;

import interfaces.IRelaciones;

import java.util.Objects;

public class Numero implements IRelaciones {
    //atributos
    private Integer entero;

    //constructores

    public Numero(Integer entero) {
        this.entero = entero;
    }

    //get y set

    public int getEntero() {
        return entero;
    }

    public void setEntero(Integer entero) {
        this.entero = entero;
    }

    //metodos

    @Override
    public String toString() {
        return "Numero{" +
                "entero=" + entero +
                '}';
    }

    @Override
    public boolean esMayor(Object o)
    {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Integer)
            {
                Integer aux = (Integer) o;
                if (entero > aux)
                {
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public boolean esMenor(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Integer)
            {
                Integer aux = (Integer) o; // se puede castear despues de la condicion
                if (entero < aux)
                {
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public boolean esIgual(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Integer aux) // se puede castear dentro de la condicion
            {
                if (Objects.equals(entero, aux))
                {
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Numero numero)) return false;
        return Objects.equals(getEntero(), numero.getEntero());
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
