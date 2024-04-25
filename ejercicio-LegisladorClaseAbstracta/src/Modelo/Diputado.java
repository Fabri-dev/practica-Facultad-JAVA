package Modelo;

public class Diputado extends Legislador
{
    //atributos

    //constructores

    public Diputado(String provinciaQueRepresenta, String partido, int edad, String nombre, String apellido) {
        super(provinciaQueRepresenta, partido, edad, nombre, apellido);
    }
    //getters y setters

    //metodos

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Soy un Diputado";
    }

    @Override
    public String getInformacionCompleta() {
        return super.getInformacionCompleta() + "\n" + getCamaraEnQueTrabaja();
    }
}
