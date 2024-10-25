package Factura;

public class Factura {
    private String nombrePlato;
    private double precioPlato;
    private int cantidad;

    public Factura(String nombrePlato, double precioPlato, int cantidad){
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
        this.cantidad = cantidad;
    }

   public double calcularTotal(){
        return precioPlato * cantidad;
   }
    public void mostrarFactura(){
        System.out.println("---Mini Factura---");
        System.out.println("Nombre plato: " + nombrePlato);
        System.out.println("Precio plato: " + precioPlato);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Total: " + calcularTotal());
        System.out.println("--------------------");
    }
}
