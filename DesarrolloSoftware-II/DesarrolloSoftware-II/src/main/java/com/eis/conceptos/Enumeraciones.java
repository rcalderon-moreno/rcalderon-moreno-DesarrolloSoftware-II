package com.eis.conceptos;

import com.eis.poo.clases.enumeraciones.Estado;
import com.eis.poo.clases.enumeraciones.Transporte;
import com.eis.poo.clases.enumeraciones.TransporteV2;

public class Enumeraciones {

    public static void main(String[] args) {

        Transporte tp,tp1,tp2;
        Estado estado = Estado.PROCESANDO;

        tp= Transporte.TREN;
        tp1= Transporte.AUTO;
        tp2= Transporte.AVION;

        System.out.println(tp.toString());

        estadoProceso(estado);
        tipoTransporte(tp);

        Transporte todos[] = Transporte.values();
        for(Transporte t: todos)
            System.out.println("Transporte: " + t.name() );


        TransporteV2 transporte = TransporteV2.AUTO;
        System.out.println("Transporte " + transporte.name() + " Velocidad "+ transporte.getVelocidad());

        TransporteV2 transportes[]  = TransporteV2.values();
        System.out.println("Velocidad de los tipos definidos () ");

        for(TransporteV2 t: transportes)
            System.out.println("Transporte " + t.name() + " Velocidad "+ t.getVelocidad());
        }

    public static void estadoProceso(Estado estado) {
        switch (estado) {
            case INICIADO:
                System.out.println("El proceso ha comenzado.");
                break;
            case PROCESANDO:
                System.out.println("El proceso está en curso.");
                break;
            case TERMINADO:
                System.out.println("El proceso ha finalizado.");
                break;
        }

    }
    public static void tipoTransporte(Transporte tipo) {
        switch (tipo) {
            case AUTO, CAMION:
                System.out.println("Es un auto.");
                break;
            default:
                System.out.println("No es un auto es un: " + tipo);
        }
    }

}
