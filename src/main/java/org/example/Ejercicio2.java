package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Stack<Integer> pila = new Stack<Integer>();

        int n1,n2,n3;

        System.out.println("Introduce el primer número: ");
        n1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("Introduce el tercer número: ");
        n3 = entrada.nextInt();

        pila.push(n1);
        pila.push(n2);
        pila.push(n3);

        while (!pila.empty()){
            System.out.println(pila.pop());
        }
    }
}
