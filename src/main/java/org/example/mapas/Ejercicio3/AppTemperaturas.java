package org.example.mapas.Ejercicio3;

public class AppTemperaturas {

    public static void main(String[] args) {

        RegistroTemperatura registro = new RegistroTemperatura();
        registro.insertarTemperatura("Alicante",32);

        System.out.println(registro);

        registro.insertarTemperatura("SanJoan",18);
        registro.actualizarTemperatura("Alicante");
        registro.actualizarTemperatura("Mutxamel");
        registro.consultarTemperatura();
        registro.mostrar();
    }
}
