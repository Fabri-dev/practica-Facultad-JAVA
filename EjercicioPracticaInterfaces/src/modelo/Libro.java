package modelo;

import interfaces.IPrestable;

public class Libro extends ElementoLegible implements IPrestable {
    //atributos
    private boolean prestado;


    //constructores

    public Libro(int codigo, String titulo, int anioDePubli) {
        super(codigo, titulo, anioDePubli);
        prestado = false;
    }

    //get y set

    //metodos


    @Override
    public String getInformacion() {
        return super.toString()+this;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                '}';
    }

    @Override
    public String prestar() {
        String s="Libro ya esta prestado actualmente";
        if (!prestado)
        {
            s="Libro fue prestado";
            prestado=true;
        }

        return s;
    }

    @Override
    public String devolver() {
        String s="Libro en posesion";
        if (prestado)
        {
            s="Libro fue devuelto";
            prestado=false;
        }
        return s;
    }
}
