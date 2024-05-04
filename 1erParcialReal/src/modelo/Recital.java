package modelo;

import interfaces.IFuncionesEvento;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Recital implements IFuncionesEvento {
    //atributos
    private String nombre;
    private String fecha;
    private String lugar;
    private HashMap<String, HashSet<Entrada>> entradas;// k= tipoEntrada, v= coleccion de entradas

    //constructores
    public Recital() {
        nombre= "Sin nombre";
        fecha= "Sin fecha";
        lugar="Sin lugar";
        setEntradas();
    }

    public Recital(String nombre, String fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        setEntradas();
    }

    //get y set


    private void setEntradas() { //reservado para la clase
        entradas=new HashMap<>();
        //entradas.put("normal",new HashSet<>()); //por defecto creamos normal
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public HashMap<String, HashSet<Entrada>> getEntradas() {
        return entradas;
    }

    //metodos


    public boolean agregarUnTipoDeEntrada(String nuevoTipo){
        boolean flag=false;
        nuevoTipo=nuevoTipo.toLowerCase(); // lo paso a minusculas
        if (!entradas.containsKey(nuevoTipo)) // si no hay un tipo de entrada existente al que se paso por parametro
        {
            flag=true;
            entradas.put(nuevoTipo,new HashSet<>());
        }
        return flag;
    }


    @Override
    public String toString() {
        return "Recital{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", entradas=" + entradas +
                '}';
    }

    @Override
    public boolean cargarEntrada(Entrada nuevaEntrada) {
        //se carga una entrada al HashSet correspondiente
        boolean flag;
        HashSet<Entrada> entradasTipo= entradas.get(nuevaEntrada.obtenerTipo());
        flag=entradasTipo.add(nuevaEntrada);
        return flag;
    }

    @Override
    public int cantidadDeEntradasVendidasEnTotal() {
        //revisar las que no estan disponibles

        int contador=0;
        HashSet<Entrada> auxSet;
        Iterator<Map.Entry<String,HashSet<Entrada>>> mapaIterator= entradas.entrySet().iterator();
        Iterator<Entrada> hashSetIterator;
        Entrada auxEntrada;
        while (mapaIterator.hasNext()) // recorro el mapa
        {
            auxSet=mapaIterator.next().getValue(); // obtengo una parte del mapa y saco el valor: un hashset
            hashSetIterator = auxSet.iterator(); //recorro el hashset recibido
            while (hashSetIterator.hasNext())
            {
                //cuento las que NO estan disponibles
                auxEntrada= hashSetIterator.next();
                if (!auxEntrada.isDisponible()) // si la entrada NO esta disponible aumento
                {
                    contador++;
                }
            }
        }
        return contador;
    }

    @Override
    public int cantidadDeEntradasVendidasXTipo(String tipo) {
        //lo mismo pero entrar al mapa segun el tipo SI EXISTE EL TIPO PASADO POR PARAMETRO
        HashSet<Entrada> hashSetEntradas;
        Iterator<Entrada> iterator;
        Entrada auxEntrada;
        int contador=0;
        if (entradas.containsKey(tipo))
        {
            hashSetEntradas = entradas.get(tipo); //obtengo el hashset del tipo requerido
            iterator = hashSetEntradas.iterator(); //creo el iterator para recorrer el hashset

            while (iterator.hasNext())
            {
                auxEntrada=iterator.next();
                if (!auxEntrada.isDisponible()) // si la entrada no esta disponible aumento
                {
                    contador++;
                }
            }

        }
        return contador;
    }

    @Override
    public boolean venderUnaEntrada(String tipo) {
        HashSet<Entrada> entradaHashSet;
        Iterator<Entrada> iterator;
        Entrada auxEntrada;
        boolean flag=false;
        if (entradas.containsKey(tipo)) // si el tipo pedido existe
        {
            entradaHashSet= entradas.get(tipo);
            if (!entradaHashSet.isEmpty()) // si el hashset no esta vacio
            {
                iterator= entradaHashSet.iterator();
                while (iterator.hasNext() && !flag) // dejo de recorrer si mi hashset esta vacio y si ya encontre la entrada requerida
                {
                    auxEntrada= iterator.next();
                    if (auxEntrada.isDisponible()) // si la entrada actual esta disponible(true), la vendo
                    {
                        //cambiarle el estado de disponible a false
                        auxEntrada.setDisponible(false);
                        flag=true;
                    }
                }
            }

        }
        return flag;
    }

    @Override
    public double dineroTotalRecaudado() {
        //dinero total de las entradas vendidas
        double total=0;
        Iterator<Map.Entry<String,HashSet<Entrada>>> iteratorMapa= entradas.entrySet().iterator();
        Iterator<Entrada> iteratorHashSet;
        Entrada auxEntrada;
        while (iteratorMapa.hasNext())
        {
            iteratorHashSet=iteratorMapa.next().getValue().iterator();
            while (iteratorHashSet.hasNext())
            {
                auxEntrada= iteratorHashSet.next();
                if (!auxEntrada.isDisponible()) //SIGNIFICA QUE YA ESTA VENDIDA SI NO ESTA DISPONIBLE
                {
                    total+= auxEntrada.obtenerPrecioTotal();
                }

            }
        }
        return total;
    }

    @Override
    public int obtenerCantidadDeEntradasEnTotal() {
        //recorrer cada hashset y preguntarle el size
        int contador=0;
        HashSet<Entrada> auxHashSet;
        Iterator<Map.Entry<String, HashSet<Entrada>>> tipoEntrada= entradas.entrySet().iterator();
        while (tipoEntrada.hasNext())
        {
            auxHashSet= tipoEntrada.next().getValue();
            contador+=auxHashSet.size();
        }


        return contador;
    }

    @Override
    public int obtenerCantidadDeEntradasXTipo(String tipo) {
        //preguntar size del key tipo SI EXISTE
        int contador=0;
        if (entradas.containsKey(tipo))
        {
            contador+=entradas.get(tipo).size(); //obtengo el valor(hashset) y le pregunto el tamano
        }

        return contador;
    }

    @Override
    public int obtenerCantidadDeEntradasDisponiblesEnTotal() {
        //recorrer las que estan disponibles true en cada hashSet
        int contador=0;
        HashSet<Entrada> auxSet;
        Iterator<Map.Entry<String,HashSet<Entrada>>> mapaIterator= entradas.entrySet().iterator();
        Iterator<Entrada>entradaIterator;
        Entrada auxEntrada;
        while (mapaIterator.hasNext()) // recorro el mapa
        {
            auxSet=mapaIterator.next().getValue(); // obtengo una parte del mapa y saco el valor: un hashset
            entradaIterator = auxSet.iterator(); //recorro el hashset recibido
            while (entradaIterator.hasNext())
            {
                //cuento las que estan disponibles
                auxEntrada=entradaIterator.next();
                if (auxEntrada.isDisponible()) // si la entrada esta disponible aumento
                {
                    contador++;
                }
            }
        }
        return contador;
    }

    @Override
    public int obtenerCantidadDeEntradasDisponiblesXTipo(String tipo) {
        //recorrer el key pasado SI EXISTE y retornar la cant disponible
        HashSet<Entrada> hashSetEntradas;
        Iterator<Entrada> iterator;
        Entrada auxEntrada;
        int contador=0;
        if (entradas.containsKey(tipo))
        {
            hashSetEntradas = entradas.get(tipo);
            iterator = hashSetEntradas.iterator();
            while (iterator.hasNext())
            {
                auxEntrada=iterator.next();
                if (auxEntrada.isDisponible())
                {
                    contador++;
                }
            }

        }
        return contador;
    }

    @Override
    public String mostrarListadoEntradasDisponiblesXTipo(String tipo) {
        String msj="";
        HashSet<Entrada> auxHashSet;
        if (entradas.containsKey(tipo))
        {
            auxHashSet= entradas.get(tipo);
            msj= auxHashSet.toString();

        }



        return msj;
    }

    @Override
    public String mostrarListadoEntradasDisponiblesEnTotal() {
        String msj="";
        Iterator<Map.Entry<String,HashSet<Entrada>>>iteratorMapa=entradas.entrySet().iterator();
        HashSet<Entrada> hashSetAux;
        while (iteratorMapa.hasNext())
        {
            hashSetAux= iteratorMapa.next().getValue(); // obtengo el iterator del hashSet que estan el value del mapa

            msj+="\n"+hashSetAux.toString();
        }
        return msj;
    }
}
