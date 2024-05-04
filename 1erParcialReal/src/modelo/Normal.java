package modelo;

public class Normal extends Entrada{
    //atributos
    private String zona;
    //constructores

    public Normal(){
        super();
        zona="Sin zona";
    }

    public Normal(String tipoEntradas, int id, double precio, boolean disponible, String zona) {
        super(tipoEntradas, id, precio, disponible);
        this.zona = zona;
    }

    //get y set

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }


    //metodos

    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Normal entradita)
            {
                if (this.getId() == entradita.getId())
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

    @Override
    public String toString() {
        return super.toString()+"Normal{" +
                "zona='" + zona + '\'' +
                '}';
    }

    @Override
    public double obtenerPrecioTotal() {
        double precioActual=super.getPrecio();
        return precioActual;
    }

    @Override
    public String obtenerTipo() {
        String tipoActual="normal";
        return tipoActual;
    }
}
