package org.example.Impresora;

import java.util.LinkedHashSet;

public class AppImpresora {

    static final String ID_PC = "PC9862";
    static LinkedHashSet<Peticion> listaPeticiones = new LinkedHashSet<>();

    public static void main(String[] args) {

        System.out.println("**** BIENVENIDO A TU IMPRESORA ONLINE ****");
        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.txt");
        anyadirDocumento("prueba1.pdf");
        anyadirDocumento("prueba2.pdf");
        anyadirDocumento("prueba2.pdf");
        anyadirDocumento("prueba3.pdf");
        imprimirDocumento();
        System.out.println(listaPeticiones);
    }

    public static void anyadirDocumento( String nombre_fichero){

        if (nombre_fichero.endsWith(".pdf")){
            if(listaPeticiones.add(new Peticion(ID_PC,nombre_fichero))){
                System.out.println("Fichero "+nombre_fichero+" añadido a la cola de impresión");
            } else {
                System.out.println("El archivo "+nombre_fichero+" ya existe en la cola");
            }
        } else {
            System.out.println("El archivo no tiene formato requerido (.pdf)");
        }
    }

    public static void imprimirDocumento(){

        System.out.println("Imprimiendo... "+listaPeticiones.getFirst().getNombre());
        listaPeticiones.removeFirst();
    }

    public static int getNumPeticiones(){
        return listaPeticiones.size();
    }

    public static void verTodo(){
        System.out.println("Cola de impresión: "+listaPeticiones);
    }

    public static void imprimirTodo() {
        while (!listaPeticiones.isEmpty()) {
            imprimirDocumento();
        }
    }
}
