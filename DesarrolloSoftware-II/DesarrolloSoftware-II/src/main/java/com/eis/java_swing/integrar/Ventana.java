package com.eis.java_swing.integrar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana implements ActionListener{
    private JFrame miventana;
  
    private JMenuBar barraDeMenu;
    private JMenu menuArchivo;
    private JMenu menuArchivo2;
    private JMenuItem elementoAbrir;
    private JMenuItem elementoSalir;
    private JMenuItem acercaDe;
    
    @Override
    public void actionPerformed(ActionEvent evento) //cuando se preciona el mouse
    {
        //System.out.println("Elemento: " + evento.getActionCommand());
        if(evento.getActionCommand().equals("Persona")==true)
            //JOptionPane.showMessageDialog(miventana,"Selecciona la opción de Abrir") ;
           llamarPersona();            
        else if (evento.getActionCommand().equals("Estudiante")==true) 
            //JOptionPane.showMessageDialog(miventana,"Selecciona la opción de Salir");
            llamarEstudiante();
        else if    (evento.getActionCommand().equals("Acerca de...")==true)
            //JOptionPane.showMessageDialog(miventana,"Selecciona la opción Acerca de...") ;
            ;
    }
    Ventana()
    {
        Control t = new Control();
        this.construirVentana();
        
    }
    private void construirVentana()
    {
        this.miventana=new JFrame("Ventanas en Java");
        Container panelContenedor=this.miventana.getContentPane();               
        panelContenedor.setLayout(new BorderLayout());    
        miventana.addWindowListener( new WindowAdapter() { 
            @Override
                public void windowClosing( WindowEvent evt ) { 
                    cerrarVentana(); 
                } 
                } ); 

       /*         
         setVisible se usa para hacer que la ventana se pueda ver o no,
         pero esta siempre permanece en la memoria ram. por otra parte el 
         método dispose destruye el objeto y cuando pasa el 
         recolector de basura de la máquina virtual se borra del todo de la memoria. 
         hasta donde recuerdo cuando haces dispose no puedes hacer setVisible(true) 
         * dado que el objeto de ventana ya no existe. 
         por el contrario al hacer setVisible(false) solo se oculta 
         visualmente la ventana, es por eso que se ven los 
         datos (cajas de texto y demás) cuando haces setVisible(true), ya 
         que el objeto aun permanece en memoria. 
        */
                
                
        this.barraDeMenu=new JMenuBar();        
        this.miventana.setJMenuBar(barraDeMenu);
        this.menuArchivo=new JMenu("Archivo");
        this.menuArchivo2=new JMenu("Ayuda");
        this.elementoAbrir=new JMenuItem("Persona");
        this.elementoSalir=new JMenuItem("Estudiante");
        this.acercaDe=new JMenuItem("Acerca de...");
        this.barraDeMenu.add(this.menuArchivo);  
        this.barraDeMenu.add(this.menuArchivo2);  
        this.menuArchivo.add(this.elementoAbrir);
        this.menuArchivo.add(this.elementoSalir);
        this.menuArchivo2.add(this.acercaDe);
        //------------------------------------------------------------------------
        //-ESCUCHAR EVENTOS-------------------------------------------------------
        
        this.elementoAbrir.addActionListener(this);
        this.elementoSalir.addActionListener(this);
        this.acercaDe.addActionListener(this);
        //        this.boton1.addKeyListener(this);
        //------------------------------------------------------------------------
        this.miventana.setSize(900,600);
        this.miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        //this.miventana.pack();
        this.miventana.setVisible(true);
    }
    public void llamarPersona()
    {
        FormPersonal ob = new FormPersonal();
    }
    public void llamarEstudiante()
    {
        FormEstudiante ob = new FormEstudiante();
    }
        public void cerrarVentana()
    {
        this.miventana.dispose();

    } 
}
