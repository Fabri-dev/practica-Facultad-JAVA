package interfaces;

import modelo.Entrada;

public interface IFuncionesEvento {
    boolean cargarEntrada(Entrada nuevaEntrada);
    int cantidadDeEntradasVendidasEnTotal();
    int cantidadDeEntradasVendidasXTipo(String tipo);
    int obtenerCantidadDeEntradasDisponiblesEnTotal();
    int obtenerCantidadDeEntradasDisponiblesXTipo(String tipo);
    boolean venderUnaEntrada(String tipo);
    int obtenerCantidadDeEntradasEnTotal();
    int obtenerCantidadDeEntradasXTipo(String tipo);
    String mostrarListadoEntradasDisponiblesXTipo(String tipo);
    String mostrarListadoEntradasDisponiblesEnTotal();
    double dineroTotalRecaudado();
}
