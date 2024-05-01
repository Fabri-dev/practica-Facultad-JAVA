package modelo;

public abstract class ElementoLegible {
    //atributos
    private int codigo;
    private String titulo;
    private int anioDePubli;

    //constructor

    public ElementoLegible(int codigo, String titulo, int anioDePubli) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioDePubli = anioDePubli;
    }


    //get y set

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioDePubli() {
        return anioDePubli;
    }

    //metodos

    public abstract String getInformacion();

    @Override
    public String toString() {
        return "ElementoLegible{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", anioDePubli=" + anioDePubli +
                '}';
    }
}
