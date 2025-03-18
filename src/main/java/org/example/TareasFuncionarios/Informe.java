package org.example.TareasFuncionarios;

import java.util.Objects;

public class Informe {

    private int codigo;
    private Tipo tipo;
    private String descripcion;

    Informe(int codigo, Tipo tipo, String descripcion){
        this.codigo=codigo;
        this.tipo = tipo;
        this.descripcion=descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}
