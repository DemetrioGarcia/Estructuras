package org.example.Programame;

public class Primos {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        String nota = in.nextLine();
        String[] notas = nota.split(" ");
        int total = 0;
        boolean primo=false;
        boolean ascendente=true;

        for (int i = 1; i < notas.length; i++) {
            total=total+Integer.parseInt(notas[i]);
        }

        int cont=1;
        if (!primo) {
            for (int j = 2; j < Integer.parseInt(notas[cont]) && cont< notas.length-1; j++) {
                if (Integer.parseInt(notas[cont]) % j == 0) {
                    primo = false;
                    break;
                } else {
                    primo = true;
                }
            }
        }

        for (int i = 1; i < notas.length-1; i++) {
            if (Integer.parseInt(notas[i])>Integer.parseInt(notas[i+1])){
                ascendente=false;
                break;
            }
        }

        if (total<100 && primo && ascendente){
            System.out.println("VALIDO");
        }else {
            System.out.println("INVALIDO");
        }
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
