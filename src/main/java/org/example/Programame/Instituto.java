package org.example.Programame;

import java.util.Arrays;

public class Instituto {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        String entrada = in.nextLine();
        String[] valores = entrada.split(" ");

        int filas = Integer.parseInt(valores[0]);
        int columnas = Integer.parseInt(valores[1]);

        System.out.println(filas+" "+columnas);

        String[][] matriz = new String[filas][columnas];

        for (int j = 0 ; j < matriz.length-1; j++) {
            String valor = in.next();
            for (int i = 0; i < matriz[0].length-1; i++) {
                matriz[j][i] = String.valueOf((valor.charAt(i)));
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

}
