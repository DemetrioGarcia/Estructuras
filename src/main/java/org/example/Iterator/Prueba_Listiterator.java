package org.example.Iterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Prueba_Listiterator {

    public static void main(String[] args) {

        ArrayList<Character> letritas = new ArrayList<>(Arrays.asList('a','b','c','x','z'));

        ListIterator<Character> iterator = letritas.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if (iterator.next() == 'x'){
                iterator.set('r');
            }
        }

        System.out.println();
        ListIterator<Character> iteratorpatras = letritas.listIterator(letritas.size());

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
