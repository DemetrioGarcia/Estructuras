package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class VaDeModas {

    public class solution {

        static java.util.Scanner in;
        static HashMap<String, Integer> mapaModa = new HashMap<>();

        public static boolean casoDePrueba() {
            int cant = in.nextInt();
            if (cant==0)
            return false;
        else {
            int[] vectornum = new int[cant];
            String conjunto = in.nextLine();
            String[] numeros= conjunto.split(" ");

            for (String numero : numeros){
                mapaModa.put(numero, mapaModa.getOrDefault(numero,0)+1);
            }
            for (Integer cantidad : mapaModa.values()){

            }
            return true;
            }
        }

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        }

    }
}

