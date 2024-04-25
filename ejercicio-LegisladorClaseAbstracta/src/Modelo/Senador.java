package Modelo;

public class Senador extends Legislador
{
    //atributos

    //constructores

    public Senador(String provinciaQueRepresenta, String partido, int edad, String nombre, String apellido) {
        super(provinciaQueRepresenta, partido, edad, nombre, apellido);
    }

    //getters y setters

    //metodos

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Soy un Senador";
    }

    @Override
    public String getInformacionCompleta() {
        String s= super.getInformacionCompleta() + "\n" +getCamaraEnQueTrabaja();
        return s;
    }
}
