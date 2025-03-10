import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        Scanner nombre = scanner.nextLine();

        Jugador jugador = new Jugador(nombre);
        Juego juego = new Juego(3);

        juego.jugar(jugador);
        System.out.println("Gracias por jugar" + jugador.getNombre());
        scanner.close();
    }
}
