package org.example.Programame;

public class Progcoins {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        String entrada = in.nextLine();
        String[] valores = entrada.split(" ");

        int cantidad = Integer.parseInt(valores[0])/Integer.parseInt(valores[1]);
        int sobrantes = Integer.parseInt(valores[0])%Integer.parseInt(valores[1]);

        System.out.println(cantidad+" "+sobrantes);
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
