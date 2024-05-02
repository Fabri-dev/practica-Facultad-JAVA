package modelo;

import interfaces.IMetodosEspeciales;

import java.util.HashMap;


public class CHashMap implements IMetodosEspeciales {
    //atributos
    HashMap<String,Integer> mapita;
    //constructores

    public CHashMap()
    {
        mapita = new HashMap<>();
    }

    //get y set

    public HashMap<String, Integer> getMapita() {
        return mapita;
    }


    //metodos


    @Override
    public boolean agregar(Object o) {
        return false;
    }

    @Override
    public boolean eliminar(Object o) {
        return false;
    }

    @Override
    public boolean buscar(Object o) {
        return false;
    }

    @Override
    public String listar() {
        return "";
    }

    @Override
    public int contar() {
        return 0;
    }
}
