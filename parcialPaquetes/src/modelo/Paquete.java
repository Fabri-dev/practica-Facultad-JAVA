package modelo;

import interfaces.ICalculos;

import java.util.Objects;

public abstract class Paquete implements ICalculos{
    //atributos

    private double peso;
    private String destino;
    private boolean seguroEnvio;
    private boolean entregaMismoDia;
    private boolean enviado;
    private int id;

    //constructores
    public Paquete()
    {
        peso=0.0;
        destino="";
        seguroEnvio=false;
        entregaMismoDia=false;
        enviado=false;
        id=-1;
    }

    public Paquete(double peso, String destino, boolean seguroEnvio, boolean entregaMismoDia) {
        this.peso = peso;
        this.destino = destino;
        this.seguroEnvio = seguroEnvio;
        this.entregaMismoDia = entregaMismoDia;
        this.enviado=false;
        id=-1;
    }

    //get y set

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isSeguroEnvio() {
        return seguroEnvio;
    }

    public void setSeguroEnvio(boolean seguroEnvio) {
        this.seguroEnvio = seguroEnvio;
    }

    public boolean isEntregaMismoDia() {
        return entregaMismoDia;
    }

    public void setEntregaMismoDia(boolean entregaMismoDia) {
        this.entregaMismoDia = entregaMismoDia;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //metodos

    public String enviar()
    {
        String s="Paquete ya enviado";
        if (!enviado)
        {
            enviado=true;
            s="Paquete enviado!";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "peso=" + peso +
                ", destino='" + destino + '\'' +
                ", seguroEnvio=" + seguroEnvio +
                ", entregaMismoDia=" + entregaMismoDia +
                ", enviado=" + enviado +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean flag=false;
        if (o != null)
        {
            if (o instanceof Paquete aux)
            {
                if (this.getId() == aux.getId())
                {
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
