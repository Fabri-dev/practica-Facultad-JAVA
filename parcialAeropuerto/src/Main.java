import modelo.*;

public class Main {
    public static void main(String[] args) {

        Aeropuerto aeropuerto= new Aeropuerto("Astor Piazzola","MDQ",5,"Avenida chacabuco");

        System.out.println("Capacidad del aeropuerto: "+aeropuerto.getCapacidadOperacion());
        System.out.println(aeropuerto.ingresarAvion(new Comercial("Boeing","Boieng",13,"debil",33,"lol1",33,"BLOWJOBS Y FOOTJOBS")));
        System.out.println(aeropuerto.ingresarAvion(new Privado("AvionPrivado","Faster",13,"doble",2,"lol2",true,"123")));
        System.out.println(aeropuerto.ingresarAvion(new Carguero("AvionCarguer","Heavy",1000,"Fuerte","lol3",1230.4,"Harina y yerba mate")));
        System.out.println(aeropuerto.ingresarAvion(new Militar("militar","Killer",3000,"FUERTISIMO",41,"lol4","WASHERR",1300)));
        System.out.println(aeropuerto.ingresarAvion(new Comercial("Boeing","Boieng",13,"debil",23,"lol6",33,"BLOWJOBS Y FOOTJOBS")));

        System.out.println(aeropuerto);

        System.out.println("Total de aviones en el aeropuerto: "+aeropuerto.contarCantTotalAviones());
        System.out.println("Total aviones hangar 1: "+aeropuerto.getHangares().get(1).contarCantidadAvionesGuardados());
        System.out.println("Total aviones hangar 2: "+aeropuerto.getHangares().get(2).contarCantidadAvionesGuardados());
        System.out.println("Total aviones hangar 3: "+aeropuerto.getHangares().get(3).contarCantidadAvionesGuardados());
        System.out.println("Total aviones hangar 4: "+aeropuerto.getHangares().get(4).contarCantidadAvionesGuardados());

        System.out.println(aeropuerto.getHangares().get(1).despegarTodosLosAviones());

    }
}