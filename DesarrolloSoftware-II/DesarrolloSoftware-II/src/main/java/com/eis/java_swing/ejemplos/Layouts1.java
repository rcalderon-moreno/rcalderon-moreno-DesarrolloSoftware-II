package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;

public class Layouts1 {
    private JFrame ventana;
    private JButton boton;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JTextField cajaDeTexto1;
    private JTextField cajaDeTexto2;
    private JTextField cajaDeTexto3;
    private JTextField cajaDeTexto4;
    
    public Layouts1() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            this.ventana.setSize(500, 400);
            this.ventana.setLayout(new FlowLayout(FlowLayout.CENTER,10,10 ) );            
            this.boton=new JButton("Guardar");
            this.etiqueta1=new JLabel("Identificación");
            this.etiqueta2=new JLabel("Nombres");
            this.etiqueta3=new JLabel("Apellidos");
            this.etiqueta4=new JLabel("Dirección");
            this.cajaDeTexto1=new JTextField(10);
            this.cajaDeTexto2=new JTextField(20);
            this.cajaDeTexto3=new JTextField(20);
            this.cajaDeTexto4=new JTextField(20);            
            this.ventana.add(etiqueta1);
            this.ventana.add(cajaDeTexto1);
            this.ventana.add(etiqueta2);
            this.ventana.add(cajaDeTexto2);
            this.ventana.add(etiqueta3);
            this.ventana.add(cajaDeTexto3);
            this.ventana.add(etiqueta4);
            this.ventana.add(cajaDeTexto4);
            this.ventana.add(boton);
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.setVisible(true);
    }  
    
}
