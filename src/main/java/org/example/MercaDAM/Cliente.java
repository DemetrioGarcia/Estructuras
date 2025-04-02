package org.example.MercaDAM;

public class Cliente {

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;


    Cliente(String usuario, String contrasenya){
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        direccion="Calle falsa, 123";
        pedido = null;
        promociones = false;
    }

    public void crearPedido(){

    }

    public void insertarProducto(){

    }

//    public double importePedido(){
//
//        return importe;
//    }
}
