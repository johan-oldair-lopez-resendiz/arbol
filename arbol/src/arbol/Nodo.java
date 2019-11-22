/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author arturo
 */
class Nodo {
    protected int Dato;
    protected Nodo izdo;
    protected Nodo dcho;
    
    public Nodo(int Dato){
        this.Dato=Dato;
        izdo=dcho=null;
    }
    public Nodo(int dato,Nodo izquierdo, Nodo derecho){
        this.Dato=dato;
        this.izdo=izquierdo;
        this.dcho=derecho;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
    
    
}
