package org.example.TareasFuncionarios;

import javax.swing.*;
import java.util.HashSet;
import java.util.Stack;

public class AppInformes {

    static Stack<Informe> pilaInformes = new Stack<>();
    static HashSet<Informe> colaInformes = new HashSet<>();

    public static void main(String[] args) {

        anyadirInforme(1, Tipo.PERSONAL," ");
        anyadirInforme(2,Tipo.EMPRESARIAL, " ");
        anyadirInforme(3,Tipo.ADMINISTRATIVO," ");
        anyadirInforme(1,Tipo.EMPRESARIAL, " ");
        anyadirInforme(2, Tipo.EMPRESARIAL, " ");

        eliminarInforme();

        anyadirInforme(1, Tipo.PERSONAL, " ");
        anyadirInforme(1, Tipo.EMPRESARIAL, " ");
        anyadirInforme(3, Tipo.ADMINISTRATIVO, " ");

        System.out.println();
        mostrarSalida();
        TareasDiferentes();

    }

    public static void anyadirInforme(int codigo, Tipo tipo, String descripcion){
        pilaInformes.push(new Informe(codigo, tipo, descripcion));
        colaInformes.add(new Informe(codigo, tipo, descripcion));
    }

    public static void eliminarInforme(){

        if (!pilaInformes.empty()){
            System.out.println("Despachando: "+pilaInformes.pop());
            eliminarInforme();
        }
    }

    public static void mostrarSalida(){

        for (int i = pilaInformes.size()-1; i >= 0; i--){
            System.out.println(pilaInformes.get(i));
        }
    }

    public static void TareasDiferentes(){

        System.out.println("Tareas diferentes: "+colaInformes.size());
    }
}
