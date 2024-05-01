package interfaces;

public interface IMetodosEspeciales {
    void agregar(Object o); //agrega un objeto, adaptandose al comportamiento de cada coleccion
    boolean eliminar(Object o); //eliminar un objeto pasado por parametro, si se elimina retorna true sino false(por ej si no se encontro)
    boolean buscar(Object o); //busca un objeto especifico comparandolo con el equals, si son iguales retorna true, sino sigue buscando hasta encontrar y sino retorna false
    String listar(); // devuelve en un String todos los objetos en la coleccion
    int contar(); // devuelve en un int el numero de objetos que hay

}
