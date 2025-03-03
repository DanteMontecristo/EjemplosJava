package calculadora;

public class Persona {
    String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("¡Hola, mi nombre es: " + nombre + "!");
    }
}
