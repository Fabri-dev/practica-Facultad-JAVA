package modelo;

public class Cliente {
    //atributos
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    //constructores
    public Cliente()
    {
        nombre="";
        apellido="";
        telefono="";
        direccion="";
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //get y set

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //metodos

    public String pedirUnViaje()
    {

    }

}
