package personajes;

public class Personaje {
    private String nombre;
    private int anioNacimiento;
    private String telefono;

    public Personaje (String nombre, int anioNacimiento, String telefono){
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.telefono = telefono;
    }

    public String getNombre(){
        return  nombre;
    }

    public int getAnioNacimiento(){
        return anioNacimiento;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }


}
