
package com.eis.poo.clases.Genericos;

public class Parejas<T extends  Comparable >{

    private T obj1; 
    private T obj2; 
    public Parejas(T obj1, T obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }    
    public Parejas<T> intercambiar(){        

        return new Parejas<T>(obj2,obj1);
    }    
    public T elMayor(){        
            if (obj1.compareTo(obj2)==0)                
                return obj1;
            if (obj1.compareTo(obj2)<0)
                return obj2;
            else
                    return obj1;
    }    
    @Override
    public String toString() {
        return "Parejas{" + "obj1=" + obj1.toString() +
                ", obj2=" + obj2.toString() + '}';
    }
    public T getObj1() {
        return obj1;
    }
    public T getObj2() {
        return obj2;
    }
}
