package modelo;

public class Revista extends ElementoLegible {
    //atributos
    private int numRevista;

    //constructores

    public Revista(int codigo, String titulo, int anioDePubli, int numRevista) {
        super(codigo, titulo, anioDePubli);
        this.numRevista = numRevista;
    }


    //get y set

    public int getNumRevista() {
        return numRevista;
    }


    //metodos


    @Override
    public String getInformacion() {
        return super.toString()+this;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numRevista=" + numRevista +
                '}';
    }
}
