package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class VentanaInicial3 {
    private JFrame ventana;
    private JButton boton;   

    public VentanaInicial3() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            this.ventana.setSize(400, 400);
            this.ventana.getContentPane().setLayout(new FlowLayout());            
            this.boton=new JButton("Boton");
            this.ventana.add(boton);           
            this.boton.addActionListener(
                new ActionListener()
                {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        botonActionListener(e);
                    }
                   
                }
            );            
            this.boton.addKeyListener(
                    new KeyListener()
                    {

                        @Override
                        public void keyTyped(KeyEvent e) {}
                        @Override
                        public void keyPressed(KeyEvent e) {}
                        @Override
                        public void keyReleased(KeyEvent e) {
                                botonKeyListener(e);
                        }
                                               
                    }
            );
            this.ventana.setFocusable(true);
            this.boton.addFocusListener(
             new FocusListener()
             {
                @Override
                public void focusGained(FocusEvent e) {
                    botonFocusGaidListener(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    botonFocusLostListener(e);
                }
             }
            );
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.setVisible(true);            
    }    
    public void botonFocusGaidListener(FocusEvent e)
    {
        System.out.println("Recibio el foco ");                        
    }
    public void botonFocusLostListener(FocusEvent e)
    {
        System.out.println("Perdio el foco ");                        
    }
    
    public void botonActionListener(ActionEvent e)
    {
        System.out.println("Elemento: " + e.getActionCommand());                        
    }
    public void botonKeyListener(KeyEvent e)
    {
        System.out.println("Presiono la tecla " + e.getKeyCode() + "  sobre el Boton1");
    }
    
}
