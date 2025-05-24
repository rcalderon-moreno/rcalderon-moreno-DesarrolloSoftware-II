package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class VentanaInicial4 {
    private JFrame ventana;
    private JButton boton;  
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField texto3;
    

    public VentanaInicial4() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            this.ventana.setSize(400, 400);
            this.ventana.getContentPane().setLayout(new FlowLayout());            
            this.boton=new JButton("Calcular");
            this.etiqueta1=new JLabel("X");
            this.etiqueta2=new JLabel("Y");
            this.etiqueta3=new JLabel("X+Y");
            this.texto1=new JTextField(5);
            this.texto2=new JTextField(5);
            this.texto3=new JTextField(5);
            this.texto1.setText("1");
            this.texto2.setText("5");
            this.texto3.setText("");
            this.ventana.add(this.etiqueta1);
            this.ventana.add(this.texto1);
            this.ventana.add(this.etiqueta2);
            this.ventana.add(this.texto2);
            this.ventana.add(boton);           
            this.ventana.add(this.etiqueta3);
            this.ventana.add(this.texto3);
            this.boton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                              botonActionPerformed(e);
                    }
                }
            );
            this.texto1.addFocusListener(new FocusListener(){
                @Override
                public void focusGained(FocusEvent e) {}
                @Override
                public void focusLost(FocusEvent e) {
                        texto1FocusListener(e);
                }
            });
            this.texto2.addFocusListener(new FocusListener(){
                @Override
                public void focusGained(FocusEvent e) {}
                @Override
                public void focusLost(FocusEvent e) {
                        texto2FocusListener(e);
                }
            });
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.setResizable(false);
            this.ventana.setVisible(true);            
    }    
    private void botonActionPerformed(ActionEvent evt) {                                         
        float resultado;
        resultado=Float.parseFloat(this.texto1.getText()) + Float.parseFloat(this.texto2.getText());
        this.texto3.setText( String.valueOf(resultado));    
    }
     private void texto1FocusListener(FocusEvent evt) {                                         
         float resultado;
         
         
         resultado=Float.parseFloat(this.texto1.getText());
         if (resultado<0)      
         { this.texto1.setText("0");    
           this.boton.setEnabled(false);
         }
         else
             this.boton.setEnabled(true);
    }
    private void texto2FocusListener(FocusEvent evt) {                                         
         float resultado;
         resultado=Float.parseFloat(this.texto2.getText());
         if (resultado<0)      
             this.texto2.setText("0");    
    } 
}