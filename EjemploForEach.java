package com.ntec;

public class EjemploForEach {
    public static void main(String[] args) {
        String [] nombres = {"Ana", "Carlos", "Maria"};

        for (String nombre : nombres) {
            System.out.println("Hola " + nombre);
        }
    }
}
