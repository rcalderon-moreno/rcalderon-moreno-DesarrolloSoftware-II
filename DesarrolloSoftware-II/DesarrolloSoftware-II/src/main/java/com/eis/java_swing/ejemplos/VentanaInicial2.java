package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;

public class VentanaInicial2 {
    private JFrame ventana;
    private JList lista;
    private JCheckBox seleccion1;
    private JCheckBox seleccion2;
    private JComboBox combo;
    private JMenuBar barraDeMenu;
    private JMenu menuArchivo;
    private JMenu menuArchivo2;
    private JMenuItem elementoAbrir;
    private JMenuItem elementoSalir;
    private JMenuItem acercaDe;
    
    public VentanaInicial2() {
        construirVentana();        
    }
    public void construirVentana()
    {
            this.ventana=new JFrame("Ventanas en Java");
            this.ventana.setSize(400, 400);
            this.ventana.getContentPane().setLayout(new FlowLayout());
            String datosLista[]={"sistemas","electronica","biologia","matematicas"};
            this.lista=new JList(datosLista);        
            String datosCombo[]={"Cedula","Tarjeta Identidad","Registro Civil"};
            this.combo=new JComboBox(datosCombo);
            this.seleccion1=new JCheckBox("Seleccionar");
            this.seleccion2=new JCheckBox("Seleccionar");
            this.barraDeMenu=new JMenuBar();    
            this.ventana.setJMenuBar(barraDeMenu);
            
            this.menuArchivo=new JMenu("Archivo");
            this.menuArchivo2=new JMenu("Ayuda");
            this.elementoAbrir=new JMenuItem("Abrir");
            this.elementoSalir=new JMenuItem("Salir");
            this.acercaDe=new JMenuItem("Acerca de...");
            
            this.barraDeMenu.add(this.menuArchivo);  
            this.barraDeMenu.add(this.menuArchivo2);  
            this.menuArchivo.add(this.elementoAbrir);
            this.menuArchivo.add(this.elementoSalir);
            this.menuArchivo2.add(this.acercaDe);
            
            this.ventana.add(lista);
            this.ventana.add(seleccion1);
            this.ventana.add(seleccion2);
            this.ventana.add(combo);            
            this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
            this.ventana.setVisible(true);
    }
}