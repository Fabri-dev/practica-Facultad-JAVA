import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        int opSw, numero1 =0, numero2=0;
        String string;
        float decimal;
        System.out.println("Ingrese el ejercicio que quiere hacer: ");


        scanner = new Scanner(System.in);
        opSw = scanner.nextInt();
        //falta validacion


        int[] arreglito = {1, 5, 7, 3, 2};
        int[] arreglote = {11,43,22,45,18,24,14,19,12,3,32,43,23,12,14,15,31,30,20,10,11,19,13,8,32,21,31,41,24,21,32,22,23};
        switch (opSw) {
            case 1:
                calcularPromedioArreglo(arreglito);
                break;
            case 2:
                esPar(2);//numero de prueba2
                break;
            case 3:
                imprimirPrimos();
                break;
            case 4:

                imprimirPrimosPorRango(scanner.nextInt());
                break;
            case 5:
                verificarSiEsPrimo(scanner.nextInt());
                break;
            case 6:
                sumaPrimeroDiezNaturales();
                break;
            case 7:
                sumarEnCantidadNumerosPositivos();
                break;
            case 8:
                esBisiesto();
                break;
            case 9:
                encontrarASCII();
                break;
            case 10:
                multiplicarDosNumeros();
                break;
            case 11:
                calcularArea();
                break;
            case 12:
                saludarXNombre();
                break;
            case 13:
                obtenerDobleYTriple();
                break;
            case 14:
                pasarCentigradosAFahrenheit();
                break;
            case 15:
                numero1 = scanner.nextInt();

                calcularAreaYLongitudCirculo(numero1);
                break;
            case 16:
                numero1 = scanner.nextInt();

                kilometrosAMetros(numero1);
                break;
            case 17:
                numero1 = scanner.nextInt();
                numero2 = scanner.nextInt();
                pitagoras(numero1,numero2);
                break;
            case 18:
                leerTemperaturas(arreglote);

                break;
            case 19:
                System.out.println("Ingrese el rango min: ");
                numero1= scanner.nextInt();
                System.out.println("Ingrese el rango max: ");
                numero2= scanner.nextInt();

                generarRandomConRango(numero1, numero2);
                break;
            case 20:
                System.out.println("Ingrese un dia: ");
                scanner.nextLine();
                string = scanner.nextLine();

                esLaboral(string);

                break;
            case 21:
                System.out.println("Ingrese un numero positivo");
                numero1 = scanner.nextInt();
                numPositivoCantCifras(numero1);
                break;
            case 22:
                System.out.println("calculadora polaca \n");
                System.out.println("Ingrese el primer numero: ");
                numero1= scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                numero2= scanner.nextInt();
                System.out.println("Ingrese la operacion aritmetica que desea hacer( + , - , * , / , ^ , % ): ");
                scanner.nextLine();
                string = scanner.nextLine();
                calculadoraPolacaInversa(numero1,numero2,string);
                break;
            case 23:
                System.out.println("Calcular salario ");
                System.out.println("Ingrese su nombre: ");
                scanner.nextLine();
                string= scanner.nextLine();
                System.out.println("Ingrese su edad: ");
                numero1= scanner.nextInt();
                System.out.println("Ingrese su salario: ");
                decimal = scanner.nextFloat();

                calcularSalario(string,numero1,decimal);

                break;
        }

        scanner.close();
    }

    static public void calcularPromedioArreglo(int[] arreglito) {
        /*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
        Realizar variantes con arreglos ya inicializados e ingreso por teclado.*/
        float promedio = 0;
        float sum = 0;
        for (int i = 0; i < arreglito.length; i++) {
            sum += (float) arreglito[i];
        }
        promedio = sum / arreglito.length;

        System.out.println("El promedio del arreglo es: " + promedio);

    }

    static public void esPar(int num) {
        /*Ejercicio nº2: Calcular si un número es par o no.*/


        if (num % 2 == 0) {
            System.out.println("Es par: " + num);
        } else {
            System.out.println("No es par: " + num);
        }
    }

    static public void imprimirPrimos() {
        int cont = 0, i = 1;
        while (cont < 100) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                cont++;
                System.out.println("Su numero es primo: " + i + " " + "cantidad numeros primos = " + cont);
            } else {
                if (i == 2 || i == 3 || i == 5 || i == 7) {
//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                    cont++;
                    System.out.println("Su numero es primo: " + i + " " + "cantidad numeros primos = " + cont);
                }
            }
            i++;
        }
    }

    static public void imprimirPrimosPorRango(int rango) {
        /*  Ejercicio nº4: Mostrar los primeros n números primos.*/
        for (int i = rango; i >= 0; i--) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println("Su numero es primo: " + i);
            } else {
                if (i == 2 || i == 3 || i == 5 || i == 7) {//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                    System.out.println("Su numero es primo: " + i);
                }
            }

        }
    }

    public static void verificarSiEsPrimo(int num) {
        /*Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.*/
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
            System.out.println("Su numero es primo: " + num);
        } else {
            if (num == 2 || num == 3 || num == 5 || num == 7) {//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                System.out.println("Su numero es primo: " + num);

            }
        }
    }


    public static void sumaPrimeroDiezNaturales() {
        /*Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.*/
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sumarEnCantidadNumerosPositivos() {
        /*Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.*/

        char op = 's';
        int num = 0;
        int cont = 0;
        do {
            num = scanner.nextInt();


            if (num > 0) {
                cont++;
            }
            System.out.println("Desea seguir ingresando numeros?: s/n");
            scanner.nextLine();// limpia el buffer para poder guardar el char sino tira error
            op = scanner.nextLine().charAt(0);


        } while (op == 's');

        System.out.println("La cantidad de numeros positivos ingresados es: " + cont);
    }

    public static void esBisiesto() {
        int anio = scanner.nextInt();
        if (anio % 4 == 0) {
            if (anio % 100 != 0) {
                System.out.println("El año es bisiesto");
            } else if (anio % 100 == 0 && anio % 400 == 0) {
                System.out.println("El año es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        } else {
            System.out.println("No es bisiesto");
        }


    }

    public static void encontrarASCII() {
        /*Ejercicio nº10: Encontrar el valor ASCII de un carácter.*/
        char letra = 's';

        System.out.println("Ingrese la letra que desee transformar: ");
        scanner.nextLine();
        letra = scanner.next().charAt(0);
        int numAscii = letra;
        System.out.println(numAscii);
    }

    public static void multiplicarDosNumeros() {
        /*Ejercicio nº11: Multiplicar dos números.*/
        int num1 = 0, num2 = 0, multiplicacion = 0;
        System.out.println("Ingrese el primer numero a multiplicar: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar: ");
        num2 = scanner.nextInt();

        multiplicacion = num1 * num2;

        System.out.println("Multiplicacion: " + multiplicacion);

    }

    public static void calcularArea() {
        /*
            Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular.
             Las opciones son: rectángulo, cuadrado, triangulo y circulo.
         */
        int opSw = 0, num1 = 0, num2 = 0;
        float area = 0;
        System.out.println("""
                1. Rectangulo\s
                2. Cuadrado\s
                3. Triangulo\s
                4. Circulo""");
        System.out.println("Ingrese el area que desea calcular:");
        opSw = scanner.nextInt();

        switch (opSw) {
            case 1:
                System.out.println("Ingrese la longitud de un lado del cuadrado: ");
                num1 = scanner.nextInt();
                area = (float) Math.pow(num1, 2);
                break;
            case 2:
                System.out.println("Ingrese la longitud de la base del rectangulo: ");
                num1 = scanner.nextInt();

                System.out.println("Ingrese la longitud de la altura del rectangulo: ");
                num2 = scanner.nextInt();

                area = (float) num1 * num2;
                break;
            case 3:
                System.out.println("Ingrese la longitud de la base del triangulo: ");
                num1 = scanner.nextInt();
                System.out.println("Ingrese la longitud de la altura del triangulo: ");
                num2 = scanner.nextInt();

                area = (float) (num1 * num2) / 2;
                break;
            case 4:
                System.out.println("Ingrese el radio del circulo: ");
                num1 = scanner.nextInt();

                area = (float) (Math.PI * Math.pow(num1, 2));
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        if (opSw <= 4){

            System.out.println("El area es: " + area);
        }
    }

    static public void saludarXNombre() {
        /*
        Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
        “Buenos dias nombre_introducido”.

         */
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Buenos dias " + nombre + " !");

    }

    static public void obtenerDobleYTriple() {
        /*
        Ejercicio nº14: Escribir un programa que lea
        un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.
         */
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        System.out.println("El doble del numero ingresado es: " + num * 2 +
                "\nEl triple del numero ingresado es: " + num * 3);

    }

    static public void pasarCentigradosAFahrenheit(){
        /*
        Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)
         */
        System.out.println("Ingrese la temperatura en grados celsius");
        int num=scanner.nextInt();

        int rta= 32+(9*num/5);
        System.out.println(num+"° en F es: "+rta);

    }

    static public void calcularAreaYLongitudCirculo(int radio)
    {
        /*
        Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

         */

        float area= (float) (Math.PI * Math.pow(radio, 2));
        int diametro= (int) (2*Math.PI*Math.pow(radio,2));

        System.out.println("El area del circulo es: "+ area+
                "\nEl diametro del circulo es: "+diametro);

    }

    static public void kilometrosAMetros(int km)
    {
        /*
        Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
         */

        float metros= (float) (km / 3.6);

        System.out.println(km + "km/h es: "+ metros+ " m/s");
    }

    static public void pitagoras(int cateto1,int cateto2)
    {
        /*
        Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

         */
        float hipotenusa = (float) ((float) Math.pow(cateto1,2) + Math.pow(cateto2,2));

        System.out.println("La hipotenusa del triangulo es: "+ hipotenusa);

    }

    static public void leerTemperaturas(int[] temps)
    {
        /*
        Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.
         */

        int max=temps[0],min=temps[0],sum=0;
        float prom;

        if (temps.length >= 30)
        {
            for (int i=0; i < temps.length; i++)
            {
                if (temps[i] > max)
                {
                    max= temps[i];
                }

                if (temps[i] < min)
                {
                    min= temps[i];
                }
                sum+= temps[i];
            }
            prom= sum/temps.length;
            System.out.println("La maxima fue de: "+ max +" grados \n"+"La minima fue de: "+ min+" grados\n" +
                    "El promedio es de: "+ prom+" grados");
        }
        else
        {
            System.out.println("Ingrese al menos 30 temperaturas");
        }



    }

    public static void generarRandomConRango(int min, int max)
    {
        /*
        Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio
         */
        int numeroRandom=0;
        for (int i=0; i < 10; i++)
        {
            numeroRandom=(int) (Math.random() * (max - min + 1) + min);

            System.out.println(numeroRandom+" ");
        }


    }
    public static void esLaboral(String dia)
    {
        /*
        Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
         */
        boolean flag=false;

        dia= dia.toLowerCase();
        switch (dia){
            case "lunes","martes","miercoles","jueves","viernes": //se pueden poner mas de una condicion en un switch en java
                flag=true;
                break;
            case "sabado", "domingo":
                break;
            default:
                System.out.println("Ingrese un dia valido");

        }

        if (flag)
        {
            System.out.println("Es dia laboral");
        }
        else
        {
            System.out.println("No es dia laboral");
        }


    }

    public static void numPositivoCantCifras(int num)
    {
        String numStr= String.valueOf(num);
        if (num > 0)
        {
            System.out.println("La cantidad de cifras que tiene el numero dado es de: "+ numStr.length());
        }
        else
        {
            System.out.println("Ingrese un numero positivo :)");
        }
    }

    public static void calculadoraPolacaInversa(int num1, int num2, String operacion)
    {
        /*
        Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.

         */
        boolean flag=true;
        int res=0;
        switch (operacion)
        {
            case "+":
                res= num1+num2;
                break;
            case "-":
                res= num1-num2;
                break;
            case "*":
                res= num1 *num2;
                break;
            case "/":
                res= num1/num2;
                break;
            case "^":
                res= (int) Math.pow(num1,num2);
                break;
            case "%":
                res= num1 %num2;
                break;
            default:
                flag=false;
                System.out.println("Ingrese una operacion valida");
                break;
        }

        if (flag)
        {
            System.out.println("El resultado del calculo es: "+ res);
        }


    }

    static public void calcularSalario(String nombre, int edad, float salario)
    {
        /*
        Ejercicio nº23: Pide por teclado el nombre, edad y salario y muestra el salario


         */

        if (edad <= 16)
        {
            System.out.println(nombre+ "no tenes la edad suficiente para trabajar, tenes: "+ edad +" anios");
        }
        else
        {
            if(edad >= 19 && edad <= 50)
            {
                salario = (float) (salario * 1.05);
            }
            else if (edad >= 51 && edad <=60)
            {
                salario = (float) (salario * 1.1);
            }
            else
            {
                salario = (float) (salario * 1.15);
            }

            System.out.println(nombre+ "al tener: "+ edad+ " tu salario es de: "+ salario);
        }



    }

}
