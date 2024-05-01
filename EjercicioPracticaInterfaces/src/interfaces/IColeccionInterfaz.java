package interfaces;

public interface IColeccionInterfaz {

    boolean estaVacia(); // devuelve true si la colección está vacía y false en caso contrario.
    Integer extraer();// devuelve y elimina el primer elemento de la colección.
    Integer primero();// devuelve el primer elemento de la colección.
    boolean agregar(Integer nuevoDato);// añade un objeto por el extremo que corresponda, y devuelve true si se ha añadido y false en caso contrario.


}
