package modelo;

import java.util.Objects;

public class Libro {
    //atributos
    private String nombre;
    private int id;

    //constructores
    public Libro()
    {
        nombre="Sin nombre";
        id=-1;
    }

    public Libro(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    //get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

   //metodos

    @Override
    public String toString() {
        return "Libro{" +
                "nombre=" + nombre +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Libro libroAux)
            {
                if (this.id == libroAux.getId())
                {
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
