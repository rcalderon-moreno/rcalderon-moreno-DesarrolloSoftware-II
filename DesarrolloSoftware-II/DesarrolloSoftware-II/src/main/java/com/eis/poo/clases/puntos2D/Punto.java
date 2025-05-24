
package com.eis.poo.clases.puntos2D;

public class Punto implements Comparable<Punto> {

    private int valorEnX;
    private int valorEnY;

    public Punto(int x , int y) {
        this.valorEnX =x;
        this.valorEnY =y;
    }

    @Override
    public boolean equals(Object objeto){

        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }

        Punto punto = (Punto) objeto;

        return (this.valorEnX == punto.getValorEnX() && this.valorEnY == punto.getValorEnY());
    }

    @Override
    public int compareTo(Punto punto) {
        /*
            0	Los objetos son iguales
            < 0 (negativo)	El objeto actual es menor que el otro
            > 0 (positivo)	El objeto actual es mayor que el otro
        */
        //Comparar respecto al valor de la suma que ambos objetos tienen
        return (this.suma() - punto.suma() );
    }

    private int suma(){ return this.valorEnX + this.valorEnY; }

    public int getValorEnX() {
        return valorEnX;
    }
    public int getValorEnY() {
        return valorEnY;
    }


}

