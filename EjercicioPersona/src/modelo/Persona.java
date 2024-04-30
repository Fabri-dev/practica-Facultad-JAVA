package modelo;

public class Persona {
    //atributos
    private final static char SEXO_XDEFECTO='H';
    private String nombre,nacionalidad,dni;
    private int edad;
    private char sexo;
    private double peso,altura;

    //constructores
    public Persona()
    {
        nombre="";
        nacionalidad="";
        dni=generarDniAleatorio();
        edad=0;
        sexo=SEXO_XDEFECTO;
        peso=0;
        altura=0;
    }

    public Persona(String nombre, int edad, char sexo)
    {
        this.nombre=nombre;
        this.edad=edad;
        setSexo(sexo);// utilizo un setter debido a que tengo una validacion
        nacionalidad="";
        dni=generarDniAleatorio();
        peso=0;
        altura=0;
    }

    public Persona(String nombre, String nacionalidad, String dni, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
        this.edad = edad;
        setSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    //get y set

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    private void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos


    public int calcularIMC() {
        int rta = -1;
        double calculo = peso / (Math.pow(altura, 2));
        if(calculo >= 20 && calculo <= 25)
        {
            rta=0; // persona por deabjo de su peso ideal
        }
        else if (calculo > 25)
        {
            rta=1; // persona con sobrepeso
        }

        return rta;
    }

    public boolean esMayorDeEdad()
    {
        boolean flag=false;
        if (edad > 65)
        {
            flag=true;
        }
        return flag;
    }

    private char comprobarSexo(char sexoIngresado)
    {
        //hombre por defecto si el sexo introducido esta mal
        if (sexoIngresado != 'm' || sexoIngresado != 'M')
        {
            sexoIngresado='H';
        }
        return sexoIngresado;
    }

    private String generarDniAleatorio()
    {
        int dniAleatorio= (int) (10000000 + Math.random()* 90000000);
        String s=String.valueOf(dniAleatorio);
        return s;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


}
