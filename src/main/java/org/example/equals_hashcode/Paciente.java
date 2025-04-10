package org.example.equals_hashcode;

import java.util.Objects;

public class Paciente {

    private String sip;
    private String nombre;
    private String apellido;

    public Paciente(String sip, String nombre, String apellido){
        this.sip=sip;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(sip, paciente.sip) && Objects.equals(nombre, paciente.nombre) && Objects.equals(apellido, paciente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sip, nombre, apellido);
    }
}
