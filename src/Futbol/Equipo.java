package Futbol;

public class Equipo {
    private String nombreEquipo;
    private Jugador jugador;

    public Equipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }
    public void inscribirJugador(String nombre, int anioNacimiento, int numeroCamiseta){
        jugador = new Jugador(nombre, anioNacimiento,numeroCamiseta);
        System.out.println(jugador);
    }
    public Jugador obtenerJugador(){
        return jugador;
    }
}
