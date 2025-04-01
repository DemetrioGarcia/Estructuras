package org.example.comparadores;

import java.util.*;

public class PruebasMapas {

    public static void main(String[] args) {

        Map<Integer, String> mapita = new HashMap<>();

        mapita.put(12345,"Patricia");
        mapita.put(54623,"Manuel");
        mapita.put(34562,"Raul");

        List<Map.Entry<Integer, String>> listaMapa = new ArrayList<>(mapita.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Integer,String> mapa : listaMapa){
            System.out.println("DNI: "+mapa.getKey()+" con nombre: "+mapa.getValue());
        }

    }
}
