package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {

    static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) {

        if(esBalanceado("(2+2))")){
            System.out.println("Operacion correcta");
        } else{
            System.out.println("Operacion incorrecta");
        }
    }

    public static boolean esBalanceado(String expresion){

        Stack<Character> pila = new Stack<Character>();

        for (int i = 0; i < expresion.length(); i++) {

            if (expresion.charAt(i)=='('){
                pila.push(expresion.charAt(i));
            } else if (expresion.charAt(i)==')' && pila.contains('(')) {
                    pila.pop();
            } else if (expresion.charAt(i)==')' && !pila.contains('(')) {
                pila.push(expresion.charAt(i));
            }
        }

        return pila.empty();
    }
}
