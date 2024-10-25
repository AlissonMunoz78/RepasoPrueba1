package Futbol;

public class Jugador {
    private String nombre;
    private int anioNacimiento, numeroCamiseta;

    public Jugador(String nombre, int anioNacimiento, int numeroCamiseta){
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre(){
        return nombre;
    }

    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    public int getNumeroCamiseta(){
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta){
        this.numeroCamiseta = numeroCamiseta;
    }

    public void mostrarInfo(){
        System.out.println("-----INFORMACION----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año: " + anioNacimiento);
        System.out.println("Numero camiseta: " + numeroCamiseta);
    }
    public double calcularVenta(int cantidad){
        double precioCamiseta = 25.00;
        return precioCamiseta * cantidad;
    }
}
