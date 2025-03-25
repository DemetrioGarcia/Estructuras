package org.example.Iterator;

public class Casino {

    private String juego;
    private int apuestaMinima;

    Casino(String juego, int apuestaMinima){
        this.apuestaMinima=apuestaMinima;
        this.juego=juego;
    }

    @Override
    public String toString() {
        return "Casino{" +
                "juego='" + juego + '\'' +
                ", apuestaMinima=" + apuestaMinima +
                '}';
    }

    public int getApuestaMinima() {
        return apuestaMinima;
    }

    public void setApuestaMinima(int apuestaMinima) {
        this.apuestaMinima = apuestaMinima;
    }

}
