package org.example.mapas;

import org.example.TareasFuncionarios.Informe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);
    static Map<String, Integer> mapaPalabras = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();
        String[] palabras = frase.toLowerCase().split(" ");

        for (String palabra : palabras){
            mapaPalabras.put(palabra,mapaPalabras.getOrDefault(palabra,0)+1);
        }

        for (Map.Entry<String,Integer> palabra: mapaPalabras.entrySet()){
            System.out.println("Palabra: "+palabra.getKey()+", cantidad de veces que aparece: "+palabra.getValue());
        }
    }
}
