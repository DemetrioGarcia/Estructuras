package org.example;

import java.util.Random;

public class Bus {
    public static final int TAM = 97;
    public static void main(String[] args) throws InterruptedException {
        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0; // SEGUNDO BUS
        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(2000);
        Random random = new Random();
        while (a < TAM && b < TAM) {
            int t1 = random.nextInt(2);
            int t2 = random.nextInt(2);
            if (t1 == 1) {
                a++; // avanzamos
            }
            if (t2 == 1){
                b++;
            }
            limpiarPantalla();
            if (a < TAM && b < TAM) {
                System.out.println(dibujarCarrera(a,b));
                Thread.sleep(30);
            }
        }
        if (a == TAM){
        System.out.println("\033[32m" + "EL AUTOBUSITO A HA LLEGADO A SU DESTINO!!" + "\033[0m");
        } else {
            System.out.println("\033[32m" + "EL AUTOBUSITO B HA LLEGADO A SU DESTINO!!" + "\033[0m");
        }
    }

        public static String dibujarCarrera(int n1, int n2) {
            StringBuilder sb = new StringBuilder();
            sb.append("-".repeat(117)).append("\n");
            sb.append(" ".repeat(n1)).append("_______________ ").append(" ".repeat(101 - n1)).append("|\n");
            sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
            sb.append(" ".repeat(n1)).append("| IES MUTXAMEL    |)").append(" ".repeat(TAM - n1)).append("|\n");
            sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
            sb.append("-".repeat(117)).append("\n");
            sb.append(" ".repeat(n2)).append("_______________ ").append(" ".repeat(101 - n2)).append("|\n");
            sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
            sb.append(" ".repeat(n2)).append("| IES SANVICENT   |)").append(" ".repeat(TAM - n2)).append("|\n");
            sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
            sb.append("_".repeat(117));
            return sb.toString();
        }

        public static void limpiarPantalla() {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }

}

