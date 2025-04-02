package org.example.MercaDAM;

import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class AppZonaClientes {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Mercadam mercadam = new Mercadam();
        mercadam.generarCliente();
        autenticacion(mercadam.getClientes());
    }

    static public void autenticacion(List<Cliente> clientes){
        System.out.println("*** COMPRA ONLINE DE MERCADAM ***");

        for (int i = 0; i < 3; i++) {
            System.out.println("Usuario: ");
            String user = entrada.next();
            System.out.println("Contraseña: ");
            String pass = entrada.next();

        }
    }

    public void iniciarCompra(){

    }

    public void imprimirProductos(){

    }

    public void imprimirDespedida(){

    }
}
