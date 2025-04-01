package org.example.MercaDAM;

import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.List;

public class Mercadam {

    private List<Cliente> clientes;


    public void generarCliente(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String usuario = "";
        String contrasenya = "";

        Cliente cliente = new Cliente(usuario,contrasenya);
    }

    public List<Cliente> getClientes(){

        return Collections.unmodifiableList(clientes);
    }
}
