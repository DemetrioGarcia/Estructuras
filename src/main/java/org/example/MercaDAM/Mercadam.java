package org.example;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mercadam {

    private List<Cliente> clientes = new ArrayList<>();


    public void generarCliente(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder usuario = new StringBuilder();
        StringBuilder contrasenya = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8 ; i++) {

            usuario.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        for (int i = 0; i < 8 ; i++) {

            contrasenya.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        System.out.println(usuario+" "+contrasenya);
        clientes.add(new Cliente(usuario.toString(), contrasenya.toString()));
    }

    public List<Cliente> getClientes(){

        return Collections.unmodifiableList(clientes);
    }
}
