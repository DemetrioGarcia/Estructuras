package org.example.Iterator;

import org.example.TareasFuncionarios.Informe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Pruebas {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(10,23,45,1,3,5));

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()){

            Integer num = it.next();

            if (num == 23){
                it.remove();
            }
        }

        System.out.println(numeros);

        ArrayList<Casino> listaCasino = new ArrayList<>();
        listaCasino.add(new Casino("poker", 500));
        listaCasino.add(new Casino("ruleta",25));
        listaCasino.add(new Casino("blackjack",50));

        Iterator<Casino> casinoIterator = listaCasino.iterator();

        while (casinoIterator.hasNext()){
            Casino casino = casinoIterator.next();

            if (casino.getApuestaMinima()>0.20){
                System.out.println(casino.toString());
                System.out.println("Raul no puede jugar");
            }

            if (casino.getApuestaMinima()<30){
                casinoIterator.remove();
            }
        }

        System.out.println(listaCasino);
    }

}
