package Factura;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato: ");
        String nombrePlato = sc.nextLine();

        System.out.println("Ingrese el precio del plato: ");
        Double precioPlato = sc.nextDouble();

        System.out.println("Ingrese ela cantidad: ");
        int cantidad = sc.nextInt();

        Plato pla1 = new Plato(nombrePlato, precioPlato);

        Factura fac1 = new Factura(nombrePlato,precioPlato,cantidad);

        fac1.mostrarFactura();

        sc.close();
    }
}
