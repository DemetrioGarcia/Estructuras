package org.example.RecaudacionCine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class AppCine {

    static Random random = new Random();
    static Queue<Persona> cola_personas = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("**** CINE AL POBLE ****");
        generarCola();
        double total = recaudado();
        System.out.println("Total recaudado: "+total);

    }

    public static void generarCola(){
        int personas = random.nextInt(250)+1;
        System.out.println("Gente que ha venido hoy: "+personas);

        for (int i = 0 ; i < personas; i++){
            cola_personas.add(new Persona(random.nextInt(97)+3));
        }
    }

    public static double recaudado(){
        double total = 0;
        while (!cola_personas.isEmpty()){
            if (cola_personas.peek().getEdad()<11){
                total+=1;
            } else if (cola_personas.peek().getEdad()<18) {
                total+=2.5;
            } else {
                total+=3.5;
            }
            cola_personas.poll();
        }
        return total;
    }
}
