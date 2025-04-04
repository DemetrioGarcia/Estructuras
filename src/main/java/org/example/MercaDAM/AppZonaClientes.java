package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class AppZonaClientes {

    static Scanner entrada = new Scanner(System.in);
    static Cliente cliente;

    public static void main(String[] args) {

        Mercadam mercadam = new Mercadam();
        mercadam.generarCliente();
        System.out.println(mercadam.getClientes());
        boolean aux = autenticacion(mercadam.getClientes());
        if (aux){
           iniciarCompra();
           resumenCarrito();
        }
    }

    static public boolean autenticacion(List<Cliente> clientes) {
        System.out.println("*** COMPRA ONLINE DE MERCADAM ***");
        boolean aux = false;
        int i = 0;
        while (!aux && i < 3) {
            System.out.println("Usuario: ");
            String user = entrada.next();
            System.out.println("Contraseña: ");
            String pass = entrada.next();
            i++;

            for (Cliente usuario : clientes) {
                if (usuario.getUsuario().equals(user) && (usuario.getContrasenya().equals(pass))) {
                    cliente = usuario;
                    System.out.println("Iniciando sesión...");
                    aux = true;
                    break;
                } else {
                    System.out.println("ERROR. revise el usuario y contraseña, intentos restantes: " + (3 - i));
                }
            }
        }
        return aux;
    }

    static public void iniciarCompra() {
        Pedido pedido = new Pedido();
        cliente.setPedido(pedido);
        Producto producto;
        System.out.println("Bienvenido " + cliente.getUsuario());

        char opc;
        do {
            System.out.println("Añade productos a tu lista: ");
            imprimirProductos();

            System.out.println("Elige un producto: ");
            String item = entrada.next().toUpperCase();

            producto = Producto.valueOf(item);
            pedido.anyadirProducto(producto);
            System.out.println(pedido.getPedido());

            System.out.println("Añadido: " + producto + ", Precio: " + producto.getPrecio() + "€");
            System.out.println("Importe total: " + pedido.getImporte_total() + "€");
            System.out.println("¿Quieres añadir más productos a tu carrito? (S/N): ");
            opc = entrada.next().toUpperCase().charAt(0);

        } while (opc != 'N');
    }

    public static void imprimirProductos() {
        for (Producto producto: Producto.values()){
            System.out.println(producto+" "+producto.getPrecio());
        }
        System.out.println();
    }

    public static void resumenCarrito(){
        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA: ");
        System.out.println("Productos: ");

        for (HashMap.Entry<Producto, Integer> producto : cliente.getPedido().getPedido().entrySet()){
            System.out.println(producto.getValue() + " " + producto.getKey() + " " + producto.getKey().getPrecio());
        }
        System.out.println("IMPORTE TOTAL: " + cliente.getPedido().getImporte_total()+" €");

    }


}
