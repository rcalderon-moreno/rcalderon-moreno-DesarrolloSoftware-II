package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;
public class VentanaInicial {
    private JFrame ventana;
    private JButton boton;
    private JLabel etiqueta;
    private JTextField cajaDeTexto1;
    private JTextField cajaDeTexto2;
    public VentanaInicial() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            this.ventana.setSize(400, 400);
            this.ventana.getContentPane().setLayout(new FlowLayout());            
            this.boton=new JButton("Boton");
            this.etiqueta=new JLabel("Etiqueta1");
            this.cajaDeTexto1=new JTextField("UNILLANOS",10);
            this.cajaDeTexto2=new JTextField(10);
            this.ventana.add(boton);
            this.ventana.add(etiqueta);
            this.ventana.add(cajaDeTexto1);
            this.ventana.add(cajaDeTexto2);
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.setVisible(true);
    }  
}
