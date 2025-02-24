package com.ntec;

public class Condicionales {
    public static void main(String[] args) {
        int edad = 20;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13) {
            System.out.println("Eres un adolecente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
