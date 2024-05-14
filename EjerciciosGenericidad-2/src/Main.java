import modelo.Pila;

public class Main {
    public static void main(String[] args) {

        Pila<Integer> integerPila=new Pila<>();

        System.out.println("Esta vacia: "+ integerPila.estaVacia());
        integerPila.apilar(5);
        integerPila.apilar(3);
        integerPila.apilar(1);
        integerPila.apilar(2);
        System.out.println("Pila: "+ integerPila);

        System.out.println("Total: "+ integerPila.contarTotal());
        System.out.println("Numero desapilado: "+ integerPila.desapilar());

        System.out.println("Tope: "+integerPila.getTope());
        System.out.println("Esta vacia: "+ integerPila.estaVacia());
        System.out.println("Pila: "+integerPila);

    }

}