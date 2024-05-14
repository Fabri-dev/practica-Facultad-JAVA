package modelo;

import java.util.ArrayList;

public class OperacionMatematematica<E extends Number> {
    //atributos
    private E num1;
    private E num2;
    //constructores

    public OperacionMatematematica() {
        num1 = null;
        num2 = null;
    }

    public OperacionMatematematica(E num1, E num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //get y set


    public E getNum1() {
        return num1;
    }

    public void setNum1(E num1) {
        this.num1 = num1;
    }

    public E getNum2() {
        return num2;
    }

    public void setNum2(E num2) {
        this.num2 = num2;
    }

    //metodos

    public E sumar() {
        return num1+num2;
    }

    public E restar()
    {

    }

    public E dividir()
    {

    }

    public E multiplicar()
    {

    }


    @Override
    public String toString() {
        return "OperacionMatematematica{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
