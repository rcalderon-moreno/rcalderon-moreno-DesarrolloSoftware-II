package com.eis.poo.clases.enumeraciones;

public enum TransporteV2 {

    AUTO(120), CAMION(150), AVION(1250), TREN(250), BARCO(500);
    private final int velocidad;

    TransporteV2(int v){
        this.velocidad=v;
    }
    public int getVelocidad() {
        return velocidad;
    }
}