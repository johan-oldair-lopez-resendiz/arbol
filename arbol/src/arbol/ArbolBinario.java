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
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arbol al = new arbol(23);
//        Nodo nuevo=new Nodo(14);
//        al.agregar(nuevo,al.getRaiz());
//        al.recorrerPreorden(al.getRaiz());
//al.agregarNodo((new Nodo(23)));
//al.agregarNodo((new Nodo(9)));
//al.agregarNodo((new Nodo(2)));
//al.agregarNodo((new Nodo(10)));
al.agregar(new Nodo(23),al.getRaiz());
al.agregar(new Nodo(14),al.getRaiz());
al.agregar(new Nodo(9),al.getRaiz());
al.agregar(new Nodo(2),al.getRaiz());
al.agregar(new Nodo(10),al.getRaiz());
al.agregar(new Nodo(16),al.getRaiz());
al.agregar(new Nodo(20),al.getRaiz());
al.agregar(new Nodo(30),al.getRaiz());
al.agregar(new Nodo(50),al.getRaiz());
al.agregar(new Nodo(51),al.getRaiz());
al.recorrerPreorden(al.getRaiz());
    }
    
}
