
package com.eis.poo.clases.Genericos;

public class ClaseGenerica <T> {
    private  T obj;
    public   ClaseGenerica() {super();}
    public   ClaseGenerica(T obj) {this.obj=obj;}
    public T getObj() {return obj;}
    public void setObj(T obj) {this.obj = obj;}

    @Override
    public String  toString()
    {
        return ("Tipo de dato de T es " + this.obj.getClass().getName()
                +"\t  Valor inicial es " + this.obj );
    }
}



///\


