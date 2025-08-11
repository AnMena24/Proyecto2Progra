
package buscaminas.modelo;

/**
 *
 * @author dylan
 */
public class Estadisticas {
    private int juegosJugados;
    private int juegosGanados;
    private int juegosPerdidos;
 
      // Constructor
    public Estadisticas() {
        this.juegosJugados = 0;
        this.juegosGanados = 0;
        this.juegosPerdidos = 0;
    }
 // Registrar cuando el jugador gana
    public void registrarVictoria() {
        juegosJugados++;
        juegosGanados++;
    }
// Registrr cuando el jugador pierde
    public void registrarDerrota() {
        juegosJugados++;
        juegosPerdidos++;
    }
// Mostrar los datos como texto para JOptionPane
    public String mostrarEstadisticas() {
        return "Juegos Jugados: " + juegosJugados + "\n"
             + "Juegos Ganados: " + juegosGanados + "\n"
             + "Juegos Perdidos: " + juegosPerdidos;
    }
// Métodos opcionales
    public int getJuegosJugados() {
        return juegosJugados;
    }

    public int getJuegosGanados() {
        return juegosGanados;
        
    }
 public int getJuegosPerdidos() {
        return juegosPerdidos;
 }
}
