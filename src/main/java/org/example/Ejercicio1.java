package org.example;

import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {

        Stack<Character> letras = new Stack<Character>();

        letras.push('a');
        letras.push('b');
        letras.push('c');
        letras.push('d');
        letras.push('e');

        if (letras.empty()) {
            System.out.println("La pila está vacia");
        } else {
            System.out.println("La pila NO está vacia");
        }

        System.out.println("La pila tiene " + letras.size() + " elementos");

        System.out.println(letras.peek());

        while (!letras.empty()) {
            System.out.println(letras.pop());
        }
    }
}
