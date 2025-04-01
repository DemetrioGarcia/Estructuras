package org.example.Programame;

import java.util.Scanner;

public class Tapas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {

            String entrada = in.nextLine();
            String[] valores = entrada.split(" ");
            int menor = Integer.parseInt(valores[1]);
            int mayor = 0;
            for (int i = Integer.parseInt(valores[0]); i > 0 ; i--) {

                if(Integer.parseInt(valores[i])>mayor){
                    mayor = Integer.parseInt(valores[i]);
                }
                if (Integer.parseInt(valores[i])<menor){
                    menor = Integer.parseInt(valores[i]);
                }
            }

            System.out.println(mayor+" "+menor);


            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
