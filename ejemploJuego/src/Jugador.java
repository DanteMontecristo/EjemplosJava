public class Jugador {
    private String nombre;
    private int intentos;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.intentos = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getIntentos(){
        return intentos;
    }

    public void incrementarIntentos(){
        this.intentos++;
    }
}
