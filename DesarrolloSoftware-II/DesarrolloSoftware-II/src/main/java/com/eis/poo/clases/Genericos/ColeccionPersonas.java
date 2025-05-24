/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.poo.clases.Genericos;

import com.eis.poo.clases.personal.Persona;

import java.util.Arrays;


public class ColeccionPersonas<T extends Persona> {
     private T obj;
     private T listado[];
     private int pos=0;
     private final int TAMA=3;

    public ColeccionPersonas() {
        this.listado=(T[]) new Persona[this.TAMA];
    }    
    public void insertarDato(T dato){
        if(this.TAMA!=this.pos){
            listado[pos]=dato;
            pos++;
        }
    }
    public T[] getListado() {
        return listado;
    }
    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ColeccionPersonas{" + "obj=" + obj + ", listado=" + Arrays.toString(listado)
                + ", pos=" + pos + ", TAMA=" + TAMA + '}';
    }
}
