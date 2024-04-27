package modelo;

import java.util.ArrayList;

public  class GestoraDeEmpleados {
    //atributos
    private ArrayList<Empleado> empleados;

    //constructores

    public GestoraDeEmpleados() {
        empleados = new ArrayList<>();
    }

    //getters y setters


    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    //metodos
    public void agregar(Empleado empleado)
        {
            empleados.add(empleado);
        }

    public String obtenerInfoTotal()
    {
        String s="";
        for(Empleado empleado: empleados)
        {
            s+=empleados.toString()+"\n";
        }
        return s;
    }
}
