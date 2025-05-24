package com.eis.poo.clases.Genericos;

public class A implements Comparable  {
    private int x;
    private int y;
    B objetoB;
    public A(int x, int y) { this.x = x; this.y = y; this.objetoB=new B(0,0);}    

    @Override
    public String toString() {
        return "A{" + "x=" + x + ", y=" + y + '}' + " Referencia: " + super.toString() + " objetoB: " + this.objetoB.toString();
    }

     @Override
    public int compareTo(Object obj) {

        if ( this == obj )
            return 0;
        if (  obj instanceof A ) 
        {            
            A tmp = (A)obj;
            if (this.x< tmp.x)
                return -1;
            else
                return 0;
        }    
        else
            return -1;
    }

}