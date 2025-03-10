import java.util.Scanner;
import java.util.Random;

public class Juego {
    private int numeroSecreto;
    private int maxIntentos;
    private boolean juegoTerminado;

    public Juego(int maxIntentos){
        this.maxIntentos = maxIntentos;
        this.juegoTerminado = false;
        generarNumeroSecreto();
    }
    
    private void generarNumeroSecreto(){
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100)+1;
    }

    public void jugar(Jugador jugador){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Bienvenido, " + jugador.getNombre() + "Adivina un numero del 1 al 100");
            int intentos = 0;
            
            while (!juegoTerminado && intentos < maxIntentos) {
                System.out.println("Ingresa tu numero o un cero (0) para rendirte");
                int numero = scanner. nextInt();

                if (numero == 0) {
                    System.out.println("Juego terminado");
                    break;
                }
                intentos++;
                jugador.incrementarIntentos();

                if (numero == numeroSecreto) {
                    System.out.println("Felicidades, " + jugador.getNombre() + " haz ganado el juego en " + intentos + "intentos");
                    juegoTerminado = true;
                }else if (numero < numeroSecreto) {
                    System.out.println("El numero es mayor");
                }else {
                    System.out.println("El numero es menor");
                }

                if (juegoTerminado) {
                    System.out.println("Numero maximo de intentos alcanzado, el numero era: " + numeroSecreto);
                }
            }
        }
    }
}
