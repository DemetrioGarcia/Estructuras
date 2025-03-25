package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);
    static Map<String, Integer> mapaLetras = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Introduce una palabra: ");
        String palabra = entrada.next();

        String[] letras = palabra.split("");

        for (String letra : letras){
            mapaLetras.put(letra, mapaLetras.getOrDefault(letra,0)+1);
        }

        for (Map.Entry<String,Integer> letra : mapaLetras.entrySet()){
            System.out.println("Letra: "+letra.getKey()+", cantidad de veces que aparece: "+letra.getValue());
        }
    }
}
