package modelo;

public class Contrasenia {
    //atributos
    private int longitud;
    private String contrasenia;

    //constructores

    public Contrasenia()
    {
        longitud=8; //longitud predeterminada
        contrasenia="";
    }

    public Contrasenia(int longitud) {
        this.longitud = longitud;
        contrasenia="";
        generarContraAleatoria();
        //contrasenia random
    }

    //get y set

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    //metodos

    public boolean esFuerte()
    {
        boolean flag=false;

        int contMayusc=0,contMinusc=0,contNums=0;
        int minMayusc=2,minMinusc=1,minNums=5,minLongitud=11;
        char aux;
        if (contrasenia.length() > minLongitud) {
            for (int i = 0; i < contrasenia.length(); i++) {
                aux = contrasenia.charAt(i);

                if (Character.isUpperCase(aux)) {
                    contMayusc++;
                } else if (Character.isLowerCase(aux)) {
                    contMinusc++;
                } else if (Character.isDigit(aux))
                {
                    contNums++;
                }
            }

            if (contNums> minNums && contMinusc > minMinusc && contMayusc > minMayusc)
            {
                flag=true;
            }
        }


        return flag;
    }

    public void generarContraAleatoria()
    {
        String caracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int indiceAleatorio=0;
        for (int i=0; i < longitud; i++)
        {
            indiceAleatorio= (int) (Math.random()*caracteres.length()); // me da un numero entre 0 y la long del arreglo de caracteres
            contrasenia+= caracteres.charAt(indiceAleatorio);
        }

    }



    @Override
    public String toString() {
        return "Contrasenia{" +
                "longitud=" + longitud +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}
