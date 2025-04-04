package org.example;

import org.example.Producto;

import java.util.HashMap;
import java.util.Map;

public class Pedido {

    HashMap<Producto,Integer> pedido;
    double importe_total;

    public Pedido(){
        pedido = new HashMap<>();
        importe_total = 0;
    }

    public void anyadirProducto(Producto producto){
        pedido.put(producto, pedido.getOrDefault(producto,0)+1);
        importe_total += producto.getPrecio();
    }

    public void eliminarProducto(Producto producto){
        pedido.put(producto, pedido.get(producto)-1);
        importe_total -= producto.getPrecio();
        if(pedido.get(producto)==0){
            pedido.remove(producto);
        }

        if (importe_total<0){
            importe_total=0;
        }
    }

    public void aplicarPromo3x2(){
        for (Map.Entry<Producto,Integer> producto : pedido.entrySet()){
            if (producto.getValue()>=3){
                int cant = producto.getValue()/3;
                importe_total = cant*producto.getKey().getPrecio();
            }
        }
    }

    public void aplicarPromo10(){
        importe_total*=0.9;
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public double getImporte_total() {
        return importe_total;
    }

}
