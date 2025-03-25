package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {

    static HashMap<String,Integer> mapaNotas = new HashMap<>();

    public static void main(String[] args) {
        mapaNotas.put("Adrian",3);
        mapaNotas.put("Raul",4);
        mapaNotas.put("Manuel",7);
        mapaNotas.put("Adrian",4);

        System.out.println("Nota para Raúl: "+mapaNotas.get("Raul"));
        System.out.println("Nota para Adrian: "+mapaNotas.get("Adrian"));

        System.out.println(mapaNotas.remove("Manuel"));

        for (String claves : mapaNotas.keySet()){
            System.out.println("Clave: "+claves);
        }

        for (Integer notas : mapaNotas.values()){
            System.out.println("Notas: "+notas);
        }

        for (Map.Entry<String,Integer> notas : mapaNotas.entrySet()){
            System.out.println("Notas de "+notas.getKey() + " es de "+notas.getValue());
            System.out.println(notas);
        }
    }
}
