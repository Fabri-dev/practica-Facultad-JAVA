package modelo;

import java.util.Objects;

public class Zapatilla {
    //atributos
    private int id;
    private String marca;

    //constructores
    public Zapatilla(){
        id=-1;
        marca="Sin marca";
    }

    public Zapatilla(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    //get y set

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //metodos


    @Override
    public String toString() {
        return "Zapatilla{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o!= null)
        {
            if (o instanceof Zapatilla zapatillaAux)
            {
                if (this.id == zapatillaAux.getId())
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
