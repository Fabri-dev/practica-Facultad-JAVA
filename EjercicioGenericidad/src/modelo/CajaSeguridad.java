package modelo;

import Interfaces.IValuable;

public class CajaSeguridad extends Contenedor<CollarDeOro>
{
    //CASO 1: en la caja de seguridad vamos a poder guardar cualquier tipo de objeto,

    //atributos
    private int pin;

    //constructores

    public CajaSeguridad(int pin) {
        super();
        this.pin = pin;
    }

    //get y set

    public int getPin() {
        return pin;
    }

    //metodos

    @Override
    public String toString() {
        return super.toString() +
                "pin=" + pin +
                '}';
    }
}
