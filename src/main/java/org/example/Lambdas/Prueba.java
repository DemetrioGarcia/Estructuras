package org.example.Lambdas;

public class Prueba {

    public static void main(String[] args) {

        Pruebator pruebator = new Pruebator() {
            @Override
            public String prueba(String texto) {
                System.out.println("Hola desde "+texto);
                return texto.toUpperCase();
            }
        };

        Pruebator lambda = (texto) -> {
            System.out.println("Hola desde " + texto);
            return texto.toUpperCase();
        };

        String resultado_anon = pruebator.prueba("una clase anónima");
        String resultado_lambda = lambda.prueba("una lambda");

        Ejecutor ejecutor = (numero) -> {
            System.out.println("Comparando para el "+numero+":");
            return numero > 10;
        };

        System.out.println(ejecutor.ejecutar(10));
        System.out.println(ejecutor.ejecutar(20));

        VerificadorVoto verificadorVoto = (nombre, edad) -> {
            System.out.println("Probando "+nombre+" con "+edad+" años...");
            return edad > 18;
        };

        System.out.println(verificadorVoto.puedeVotar("Daniel",12));
        System.out.println(verificadorVoto.puedeVotar("Marina",26));
    }
}
