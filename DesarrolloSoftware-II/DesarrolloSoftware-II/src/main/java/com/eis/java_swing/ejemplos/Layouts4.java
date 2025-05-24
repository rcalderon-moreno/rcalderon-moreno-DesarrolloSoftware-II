package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;


public class Layouts4 {
    private JFrame ventana;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JLabel etiqueta5;
    private JLabel cuadro;
    private JTextField cajaDeTexto1;
    private JTextField cajaDeTexto2;
    private JTextField cajaDeTexto3;
    private JTextField cajaDeTexto4;
    private JPanel panelInicial;
    private JPanel panelDeInformacion;
    private JPanel panelDeBotones;
    private JPanel panelDeImagenes;
    private Icon imagen1;
    
    
    
    public Layouts4() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            this.ventana.setSize(500, 400);
            this.ventana.setLayout(new BorderLayout(5,5) );
            this.panelInicial=new JPanel(); 
            this.panelDeBotones=new JPanel();
            this.panelDeInformacion=new JPanel();  
            this.panelDeImagenes=new JPanel();  
            this.panelInicial.setLayout(new FlowLayout(FlowLayout.CENTER,2,2));
            this.panelDeBotones.setLayout(new FlowLayout(FlowLayout.CENTER,2,2));
            this.panelDeImagenes.setLayout(new GridLayout(1,0));             
            this.panelDeInformacion.setLayout(new GridLayout(4,2,3,3));             
            this.boton1=new JButton("Anterior");
            this.boton2=new JButton("Guardar");
            this.boton3=new JButton("Eliminar");
            this.boton4=new JButton("Actualizar");
            this.boton5=new JButton("Siguiente");
            this.etiqueta1=new JLabel("Identificación");
            this.etiqueta2=new JLabel("Nombres");
            this.etiqueta3=new JLabel("Apellidos");
            this.etiqueta4=new JLabel("Dirección");
            this.etiqueta5=new JLabel("Diseño de IGU con Java - Swing");
            this.cuadro=new JLabel();
            this.cajaDeTexto1=new JTextField(10);
            this.cajaDeTexto2=new JTextField(20);
            this.cajaDeTexto3=new JTextField(20);
            this.cajaDeTexto4=new JTextField(20);  

            panelDeImagenes.add(this.cuadro);
            this.panelInicial.add(etiqueta5);
            this.panelDeInformacion.add(etiqueta1 );
            this.panelDeInformacion.add(cajaDeTexto1);
            this.panelDeInformacion.add(etiqueta2);
            this.panelDeInformacion.add(cajaDeTexto2);
            this.panelDeInformacion.add(etiqueta3);
            this.panelDeInformacion.add(cajaDeTexto3);
            this.panelDeInformacion.add(etiqueta4);
            this.panelDeInformacion.add(cajaDeTexto4);
            this.panelDeBotones.add(boton1);
            this.panelDeBotones.add(boton2);
            this.panelDeBotones.add(boton3);
            this.panelDeBotones.add(boton4);
            this.panelDeBotones.add(boton5);
            
            this.ventana.add(this.panelInicial,BorderLayout.NORTH);
            this.ventana.add(this.panelDeImagenes,BorderLayout.EAST );
            this.ventana.add(this.panelDeInformacion,BorderLayout.CENTER );
            this.ventana.add(this.panelDeBotones,BorderLayout.SOUTH);
            
            /*this.ventana.add(boton1,BorderLayout.NORTH);
            this.ventana.add(boton2,BorderLayout.SOUTH);
            this.ventana.add(boton3,BorderLayout.WEST);
            this.ventana.add(boton4,BorderLayout.EAST );
            this.ventana.add(boton5,BorderLayout.CENTER);            
            * 
            */
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.pack();//hace que se pregunte al LayoutManager sobre el tamaño minimo de un componente para que lo respeten
            this.ventana.setVisible(true);
    }  
    
}