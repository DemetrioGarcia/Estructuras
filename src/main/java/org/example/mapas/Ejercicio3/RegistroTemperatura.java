package org.example.mapas.Ejercicio3;

import org.example.TareasFuncionarios.Informe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperatura {

    static Scanner entrada = new Scanner(System.in);
    private HashMap<String, Integer> mapaTemperaturas;

    public RegistroTemperatura(){
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperatura(String ciudad, Integer temperatura){
        mapaTemperaturas.put(ciudad,temperatura);
    }

    public void actualizarTemperatura(String ciudad){
        System.out.println("Inserta la temperatura de la ciudad de "+ciudad+" :");
        mapaTemperaturas.put(ciudad,entrada.nextInt());
    }

    public void consultarTemperatura() {
        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = entrada.next();
        if (mapaTemperaturas.containsKey(ciudad)) {
            System.out.println("La temperatura en " + ciudad + " es de " + mapaTemperaturas.get(ciudad) + "º");
        } else {
            System.out.println("La ciudad "+ciudad+" no tiene temperatura registrada.");
        }
    }

    public void mostrar(){
        System.out.println("Registro de Temperaturas: ");
        for (Map.Entry<String,Integer> temperatura : mapaTemperaturas.entrySet()){
            System.out.println(temperatura.getKey()+": "+temperatura.getValue()+"º");
        }
    }

    @Override
    public String toString() {
        return "RegistroTemperatura{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }

}
