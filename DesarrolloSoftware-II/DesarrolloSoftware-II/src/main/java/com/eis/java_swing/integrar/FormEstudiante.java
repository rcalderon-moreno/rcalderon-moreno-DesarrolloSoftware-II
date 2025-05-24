package com.eis.java_swing.integrar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FormEstudiante{
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
    private JLabel etiqueta6;
    private JLabel etiqueta7;
    
    private JLabel cuadro;
    private JTextField cajaDeTexto1;
    private JTextField cajaDeTexto2;
    private JTextField cajaDeTexto3;
    private JTextField cajaDeTexto4;
    private JTextField cajaDeTexto5;
    private JTextField cajaDeTexto6;
    
    private JPanel panelInicial;
    private JPanel panelDeInformacion;
    private JPanel panelDeBotones;
    private JPanel panelDeImagenes;
    private Icon imagen1;
    
    
    
    public FormEstudiante() {
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
            this.panelDeInformacion.setLayout(new GridLayout(6,2,3,3));             
            this.boton1=new JButton("Anterior");
            this.boton2=new JButton("Guardar");
            this.boton3=new JButton("Eliminar");
            this.boton4=new JButton("Actualizar");
            this.boton5=new JButton("Mostrar");
            this.etiqueta1=new JLabel("Identificación");
            this.etiqueta2=new JLabel("Nombres");
            this.etiqueta3=new JLabel("Apellidos");
            this.etiqueta4=new JLabel("Dirección");
            this.etiqueta5=new JLabel("Diseño de IGU con Java - Swing");
            this.etiqueta6=new JLabel("Codigo");
            this.etiqueta7=new JLabel("Programa");
            this.cuadro=new JLabel();
            this.cajaDeTexto1=new JTextField(10);
            this.cajaDeTexto2=new JTextField(20);
            this.cajaDeTexto3=new JTextField(20);
            this.cajaDeTexto4=new JTextField(20); 
            this.cajaDeTexto5=new JTextField(20); 
            this.cajaDeTexto6=new JTextField(20);            

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
            this.panelDeInformacion.add(etiqueta6);
            this.panelDeInformacion.add(cajaDeTexto5);
            this.panelDeInformacion.add(etiqueta7);
            this.panelDeInformacion.add(cajaDeTexto6);            
            this.panelDeBotones.add(boton1);
            this.panelDeBotones.add(boton2);
            this.panelDeBotones.add(boton3);
            this.panelDeBotones.add(boton4);
            this.panelDeBotones.add(boton5);            
            this.ventana.add(this.panelInicial,BorderLayout.NORTH);
            this.ventana.add(this.panelDeImagenes,BorderLayout.EAST );
            this.ventana.add(this.panelDeInformacion,BorderLayout.CENTER );
            this.ventana.add(this.panelDeBotones,BorderLayout.SOUTH);
            this.boton2.addActionListener(
                new ActionListener()
                {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        botonActionListener(e);
                    }
                   
                }
            );
            this.boton5.addActionListener(
                new ActionListener()
                {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mostrarActionListener(e);
                    }
                   
                }
            );
            
            
          ventana.addWindowListener( new WindowAdapter() { 
            @Override
                public void windowClosing( WindowEvent evt ) { 
                    cerrarVentana(); 
                } 
                } ); 

            this.ventana.pack();//hace que se pregunte al LayoutManager sobre el tamaño minimo de un componente para que lo respeten
            this.ventana.setVisible(true);
    } 
    
    public void botonActionListener(ActionEvent e)
    {
        
        ///Persona arreglo[]=Control.getDatos();
        
        //Estudiante(double codigo, String programa, 
        //double identificacion, String nombres, String apellidos, String direccion) 
        double valor=1,codigo=0;
        Estudiante midato;
        valor=Double.parseDouble(this.cajaDeTexto1.getText());
        codigo=Double.parseDouble(this.cajaDeTexto5.getText());
        midato=new Estudiante(
                codigo,
                this.cajaDeTexto6.getText(),
                valor,
                this.cajaDeTexto2.getText(),
                this.cajaDeTexto3.getText(),
                this.cajaDeTexto4.getText()
        );
        Control.insertarDato(midato);
        /*
         * arreglo[Control.getContador()]=new Estudiante(
                codigo,
                this.cajaDeTexto6.getText(),
                valor,
                this.cajaDeTexto2.getText(),
                this.cajaDeTexto3.getText(),
                this.cajaDeTexto4.getText()
        );
        * 
        */
        //Control.aumentarContador();
        //Control.setDatos(arreglo);
    }
    
    public void mostrarActionListener(ActionEvent e)
    {
        Persona arreglo[]=Control.getDatos();
        for(int x=0;x<Control.getContador();x++)
        {
            System.out.println("Arreglo de personas [" + x +"]=" + arreglo[x].getNombres());
        }
    
    }
    public void cerrarVentana()
    {
        this.ventana.dispose();

    } 
    
    
    
}