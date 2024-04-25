package Modelo;

public abstract class Legislador extends Persona
{
    //atributos
    private String provinciaQueRepresenta;
    private String partido;
    //constructor
    public Legislador(String provinciaQueRepresenta, String partido, int edad,String nombre, String apellido)
    {
        super(nombre,apellido,edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partido = partido;
    }

    //getters

    public String getProvinciaQueRepresenta()
    {
        return provinciaQueRepresenta;
    }

    public String getPartido(){
        return partido;
    }

    //metodos
    public abstract String getCamaraEnQueTrabaja(); //para saber si es diputado o senador

    public String getInformacionCompleta()
    {
        String s= super.getInformacionCompleta() + "\n|Legislador|\nprovinciaQueRepresenta: " + provinciaQueRepresenta + "\npartido: " + partido;
        return s;
    }
}
