package org.example.Sets;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una serie de palabras: ");
        String cadena = entrada.nextLine();

        Set<String> palabras = new LinkedHashSet<>(Arrays.asList(cadena.toLowerCase().split(" ")));

        System.out.println(palabras);
    }
}
