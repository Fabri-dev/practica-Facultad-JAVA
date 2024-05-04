package modelo;

import java.util.Objects;

public class Vip extends Entrada{
    //atributos
    private String beneficio;

    //constructores

    public Vip()
    {
        super();
        beneficio="Sin beneficio";
    }
    public Vip(String tipoEntradas, int id, double precio, boolean disponible, String beneficio) {
        super(tipoEntradas, id, precio, disponible);
        this.beneficio = beneficio;
    }

    //get y set

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }


    //metodos


    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Vip entradita)
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
        return super.toString()+ "Vip{" +
                "beneficio='" + beneficio + '\'' +
                '}';
    }
    @Override
    public double obtenerPrecioTotal() {
        double aumento=1.5;
        return super.getPrecio()*aumento;
    }

    @Override
    public String obtenerTipo() {
        String tipoActual="vip";
        return tipoActual;
    }
}
