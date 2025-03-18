package org.example.Sets;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Set<String> palabras =  new LinkedHashSet<>();
        boolean aux = true;

        while (aux) {
            System.out.println("Introduce una URL visitada (o 'salir' para terminar): ");
            String url = entrada.nextLine().toLowerCase();

            if (Objects.equals(url, "salir")) {
                int cont = 1;
                System.out.println();
                System.out.println("Historial de navegación: ");
                for (String palabra : palabras) {
                    System.out.println(cont + ". " + palabra);
                    cont++;
                }
                aux=false;
            } else {
                palabras.add(url);
            }
        }
    }
}
