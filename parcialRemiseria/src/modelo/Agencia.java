package modelo;

import java.util.HashSet;

public class Agencia {
    //atributos
    HashSet<Cliente> clientes;
    HashSet<Vehiculo> flota;
    HashSet<Viaje> viajes;

    //constructores

    public Agencia() {
        clientes=new HashSet<>();
        flota=new HashSet<>();
        viajes=new HashSet<>();
    }

    //get y set

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public HashSet<Vehiculo> getFlota() {
        return flota;
    }

    public HashSet<Viaje> getViajes() {
        return viajes;
    }

    //metodos
    public String comenzarViaje(Cliente cliente, Vehiculo auto)
    {
        viajes.add(new Viaje(cliente,auto));
    }


}
