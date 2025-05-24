package com.eis.java_swing.ejemplos;


import javax.swing.*;
import java.awt.*;


public final class Layouts3 {
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
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    
    public Layouts3() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            /*  GridLayout()
                Creates a grid layout with a default of one column per component,in a single row.
                GridLayout(int rows, int cols)
                Creates a grid layout with the specified number of rows and columns.
                GridLayout(int rows, int cols, int hgap, int vgap)
                Creates a grid layout with the specified number of rows and columns.
            */
            this.ventana.setLayout(new GridLayout(10,2 )); 
            this.boton=new JButton("Guardar");
            this.boton1=new JButton("Cancelar");            
            this.etiqueta1=new JLabel("Identificación");
            this.etiqueta2=new JLabel("Nombres");
            this.etiqueta3=new JLabel("Apellidos");
            this.etiqueta4=new JLabel("Dirección");
            this.cajaDeTexto1=new JTextField(10);
            this.cajaDeTexto2=new JTextField(20);
            this.cajaDeTexto3=new JTextField(20);
            this.cajaDeTexto4=new JTextField(20);            
            this.ventana.add(etiqueta1 );
            this.ventana.add(cajaDeTexto1);
            this.ventana.add(etiqueta2);
            this.ventana.add(cajaDeTexto2);
            this.ventana.add(etiqueta3);
            this.ventana.add(cajaDeTexto3);
            this.ventana.add(etiqueta4);
            this.ventana.add(cajaDeTexto4);
            this.ventana.add(boton);
            this.ventana.add(boton1);
            
           // this.ventana.setResizable(false);
           
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.pack();
            this.ventana.setVisible(true);
    }  
    
}
