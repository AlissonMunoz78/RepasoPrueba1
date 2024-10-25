package Futbol;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE LA INFORMACION ");
        System.out.println("Nombre del Equipo: "  );
        String nombreEquipo = sc.nextLine();

        System.out.println("Inscribir al jugador");
        System.out.println("Nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.println("Año de nacimiento: ");
        int anioNacimiento = sc.nextInt();
        System.out.println("Numero de camiseta: ");
        int numeroCamiseta = sc.nextInt();

        Jugador ju = new Jugador( nombre,anioNacimiento,numeroCamiseta);
        System.out.println("------INFORMACION-------");
        System.out.println("Nombre:" + nombre);
        System.out.println("Año nacimiento: " + anioNacimiento);
        System.out.println("Numero camiseta: " + numeroCamiseta);
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("--------------------------");

        System.out.println("Actualiza el numero de la camiseta: " );
        int nueNumero = sc.nextInt();
        ju.setNumeroCamiseta(nueNumero);
        System.out.println("Numero de camiseta ACTUALIZADO: " + ju.getNumeroCamiseta());

        System.out.println("Ingrese la cantidad de camisetas: ");
        int cantidad = sc.nextInt();

        double total = ju.calcularVenta(cantidad);
        System.out.println("Total a pagar: " + total);
        sc.close();


    }
}
