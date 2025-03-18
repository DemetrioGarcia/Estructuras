package org.example.Sets;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio4 {
    public static void main(String[] args) {

        TreeSet<Integer> lista1 = new TreeSet<>();
        TreeSet<Integer> lista2 = new TreeSet<>();

        lista1.add(1);
        lista2.add(2);
        lista1.add(5);
        lista2.add(3);
        lista1.add(6);
        lista2.add(4);
        lista1.add(4);
        lista1.add(0);

        TreeSet<Integer> listamezclada = mezclados(lista1,lista2);
        System.out.println(listamezclada);
    }

    public static TreeSet<Integer> mezclados(TreeSet<Integer> lista1, TreeSet<Integer> lista2){

        TreeSet<Integer> listamezclada = new TreeSet<>();

        listamezclada.addAll(lista1);
        listamezclada.addAll(lista2);
        return listamezclada;
    }
}
