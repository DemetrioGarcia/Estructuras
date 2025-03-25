package org.example.Diccionario;

import java.util.HashMap;
import java.util.Random;

public class Diccionario {

    private HashMap<String,String> lista;

    Diccionario(){
        lista = new HashMap<>();
    }

    public void nuevoPar(String espanyol, String ingles){
        lista.put(espanyol,ingles);
    }

    public void traduce(String espanyol){
        System.out.println(lista.get(espanyol));
    }

    public void palabraAleatoria(){
        Random random = new Random();

        int num = random.nextInt(lista.size());

        //for
        System.out.println();
    }

    public void primeraLetraTraduccion(String espanyol){
        System.out.println(lista.get(espanyol).charAt(0));
    }
}
