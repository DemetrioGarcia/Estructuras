package org.example.equals_hashcode;

import java.util.LinkedHashSet;

public class Prueba {
    public static void main(String[] args) {

        Paciente raul = new Paciente("123456", "Raúl", "García Delgado");
        Paciente xavi = new Paciente("456123", "Xavi", "Cervera Lillo");
        Paciente javi = new Paciente("456123", "Xavi", "Cervera Lillo");

        LinkedHashSet<Paciente> listaPacientes = new LinkedHashSet<>();
        listaPacientes.add(raul);
        listaPacientes.add(xavi);
        listaPacientes.add(javi);

        System.out.println(xavi.hashCode());
        System.out.println(javi.hashCode());

        System.out.println(listaPacientes.size());
    }
}
