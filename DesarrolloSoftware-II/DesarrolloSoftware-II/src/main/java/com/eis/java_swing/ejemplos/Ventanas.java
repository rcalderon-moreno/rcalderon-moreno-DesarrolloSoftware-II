package com.eis.java_swing.ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanas implements ActionListener{
    private JFrame miventana;
    private JLabel etiqueta; 
    private JLabel etiqueta2; 
    private JMenuBar barraDeMenu;
    private JMenu menuArchivo;
    private JMenu menuArchivo2;
    private JMenuItem elementoAbrir;
    private JMenuItem elementoSalir;
    private JMenuItem acercaDe;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton11;
    private JButton boton22;
    private JButton boton33;
    private JButton boton44;
    private JButton boton55;
    private JButton boton66;    
    private JButton boton444;
    private JButton boton555;
    private JButton boton666;
    JPanel barraDeHerramientas;
    JPanel barraCentral;
    JPanel barraEste;
    
    @Override
    public void actionPerformed(ActionEvent evento) //cuando se preciona el mouse
    {
        System.out.println("Elemento: " + evento.getActionCommand());
        if(evento.getActionCommand().equals("Abrir")==true)
            JOptionPane.showMessageDialog(miventana,"Selecciona la opción de Abrir") ;
        else if (evento.getActionCommand().equals("Salir")==true) 
            JOptionPane.showMessageDialog(miventana,"Selecciona la opción de Salir");
        else if    (evento.getActionCommand().equals("Acerca de...")==true)
            JOptionPane.showMessageDialog(miventana,"Selecciona la opción Acerca de...") ;
    }
    
    Ventanas()
    {
        this.construirVentana();
    }
    private void construirVentana()
    {
        this.miventana=new JFrame("Ventanas en Java");
        Container panelContenedor=this.miventana.getContentPane();               
        panelContenedor.setLayout(new BorderLayout());        
        
        this.etiqueta=new JLabel("Etiqueta1");
        this.etiqueta2=new JLabel("Etiqueta2");        
        
        panelContenedor.add(etiqueta,BorderLayout.NORTH);
        panelContenedor.add(etiqueta2,BorderLayout.SOUTH);
        
        
        this.barraDeMenu=new JMenuBar();        
        this.miventana.setJMenuBar(barraDeMenu);
        
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
        //------------------------------------------------------------------------
        //-ESCUCHAR EVENTOS-------------------------------------------------------
        
        this.elementoAbrir.addActionListener(this);
        this.elementoSalir.addActionListener(this);
        this.acercaDe.addActionListener(this);
//        this.boton1.addKeyListener(this);
        //------------------------------------------------------------------------
        
        
        barraDeHerramientas=new JPanel(new GridLayout(0,1));
        boton1 =new JButton("Boton1"); 
        boton2 =new JButton("Boton2"); 
        boton3 =new JButton("Boton3"); 
        boton4 =new JButton("Boton4"); 
        boton5 =new JButton("Boton5"); 
        boton6 =new JButton("Boton6"); 
        
        boton6.addActionListener(this);
        
        this.barraDeHerramientas.add(this.boton1);
        this.barraDeHerramientas.add(this.boton2);
        this.barraDeHerramientas.add(this.boton3);
        this.barraDeHerramientas.add(this.boton4);
        this.barraDeHerramientas.add(this.boton5);
        this.barraDeHerramientas.add(this.boton6);
        panelContenedor.add(this.barraDeHerramientas,BorderLayout.WEST);
        
        barraCentral=new JPanel(new GridLayout(1,0));
        boton11 =new JButton("Boton11"); 
        boton22 =new JButton("Boton22"); 
        boton33 =new JButton("Boton33"); 
        this.barraCentral.add(this.boton11);
        this.barraCentral.add(this.boton22);
        this.barraCentral.add(this.boton33);
        boton44 =new JButton("Boton44"); 
        boton55 =new JButton("Boton55"); 
        boton66 =new JButton("Boton66"); 
        this.barraCentral.add(this.boton44);
        this.barraCentral.add(this.boton55);
        this.barraCentral.add(this.boton66);
        panelContenedor.add(this.barraCentral,BorderLayout.CENTER);     
        
        
        
        barraEste=new JPanel(new GridLayout(0,1));
        boton444 =new JButton("Boton44"); 
        boton555 =new JButton("Boton55"); 
        boton666 =new JButton("Boton66"); 
        this.barraEste.add(this.boton444);
        this.barraEste.add(this.boton555);
        this.barraEste.add(this.boton666);
        panelContenedor.add(this.barraEste,BorderLayout.EAST);   
        
        JPanel panelFlow = new JPanel(); 
        panelFlow.add(this.barraDeHerramientas);
        panelContenedor.add(panelFlow,BorderLayout.WEST);   
        
        this.miventana.setSize(900,600);
      //this.miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.miventana.pack();
        this.miventana.setVisible(true);
       
        
    }

   
    
    
    
}
