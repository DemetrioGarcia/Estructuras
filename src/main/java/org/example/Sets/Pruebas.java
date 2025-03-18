package org.example.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pruebas {

    public static void main(String[] args) {

        Set<Character> letras = new HashSet<>();

        letras.add('d');
        letras.add('t');
        letras.add('s');
        letras.add('a');
        letras.add('d');

        System.out.println(letras);

        System.out.println("____________________");

        Set<Character> letras_enlazadas = new LinkedHashSet<>();

        letras_enlazadas.add('z');
        letras_enlazadas.add('s');
        letras_enlazadas.add('q');

        System.out.println(letras_enlazadas.add('z'));

        System.out.println(letras_enlazadas);
        System.out.println("____________________");

        Set<Character> letras_ordenadas = new TreeSet<>();

        letras_ordenadas.add('v');
        letras_ordenadas.add('s');
        letras_ordenadas.add('d');
        letras_ordenadas.add('t');
        letras_ordenadas.add('s');

        System.out.println(letras_ordenadas);

    }
}
