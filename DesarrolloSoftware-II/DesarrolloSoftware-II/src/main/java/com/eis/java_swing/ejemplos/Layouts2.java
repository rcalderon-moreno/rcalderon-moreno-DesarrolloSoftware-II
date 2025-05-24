package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;


public final class Layouts2 {
    private JFrame ventana;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    
    public Layouts2() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            this.ventana.setSize(500, 400);
            this.ventana.setLayout(new BorderLayout(5,5));            
            this.boton1=new JButton("NORTE");
            this.boton2=new JButton("SUR");
            this.boton3=new JButton("OESTE");
            this.boton4=new JButton("ESTE");
            this.boton5=new JButton("CENTRO");
            this.ventana.add(boton1,BorderLayout.NORTH);
            this.ventana.add(boton2,BorderLayout.SOUTH);
            this.ventana.add(boton3,BorderLayout.WEST);
            this.ventana.add(boton4,BorderLayout.EAST );
            this.ventana.add(boton5,BorderLayout.CENTER);            
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.pack();//hace que se pregunte al LayoutManager sobre el tamaño minimo de un componente para que lo respeten
            this.ventana.setVisible(true);
    }  
    
}