package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaDos {
    private JFrame ventana;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
   
    public VentanaDos() {
        this.construirVentana();
    }
    public void construirVentana()
    {
        this.ventana=new JFrame("Ventanas en Java");
        this.ventana.setSize(400, 400);
        this.ventana.getContentPane().setLayout(new FlowLayout());
        
        // de esta forma no es necesario implementar la interfaz ActionListener al iniciar la clase
        // public class Ventanas implements ActionListener{
        // se utiliza una clase anonima
        ActionListener actionListener=new ActionListener()
        {
            @Override
             public void actionPerformed(ActionEvent evento)
                {
                    System.out.println("Elemento: " + evento.getActionCommand());    
                }
        };
      /*
        FocusListener actionListenerFocus=new FocusListener()
        {
            @Override
             public void focusGained(FocusEvent evento) {
               this.focusGained(evento);
               System.out.println("Elemento: " + evento.getComponent().getName());    
            }

            @Override
            public void focusLost(FocusEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
            
        };
        */

        
        this.boton1=new JButton("Aceptar");
        this.ventana.add(boton1);
        this.boton2=new JButton("Cancelar");        
        this.ventana.add(boton2);
        this.boton3=new JButton("Eliminar");        
        this.ventana.add(boton3);
        this.boton4=new JButton("Salir");        
        this.ventana.add(boton4);
        
        this.boton1.addActionListener(actionListener);
        this.boton1.addKeyListener(new KeyListener()
        {

            @Override
            public void keyTyped(KeyEvent e) {
                //System.out.println("Presiono la tecla " + e.getKeyCode() + "  sobre el Boton1");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("Presiono la tecla " + e.getKeyCode() + "  sobre el Boton1");
            }
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Presiono la tecla " + e.getKeyCode() + "  sobre el Boton1");
            }
        }       
       );
       this.boton1.addMouseListener(new MouseListener()
       {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Presiono el mouse " + e.getButton()  + "  sobre el Boton1");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Presiono la tecla " + e.getButton() + "  sobre el Boton1");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("MOuse " + e.getButton() + "  sobre el Boton1");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("MOuse " + e.getButton() + "  sobre el Boton1");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("MOuse " + e.getButton() + "  sobre el Boton1");
            }
       
       }
       );
       
       this.boton1.addFocusListener(new FocusListener(){
			@Override
			public void focusGained(FocusEvent evento) {
                            System.out.println("Recibio el enfoque el elemento:  Boton1" );
			}
			@Override
			public void focusLost(FocusEvent evento) {
				System.out.println("Perdio el enfoque el elemento:  Boton1" );
			}
		});
        
        this.boton2.addActionListener(actionListener);
        this.boton3.addActionListener(actionListener);
        this.boton4.addActionListener(actionListener);
        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.ventana.setVisible(true);
    }
    

    
    
    
}
