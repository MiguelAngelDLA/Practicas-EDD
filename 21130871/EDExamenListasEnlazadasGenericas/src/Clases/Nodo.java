/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author krodr
 * @param <T>
 */
public class Nodo <T> {
    
    //Atributos
    private T dato;
    private Nodo sig;
    
    //Constructores
    public Nodo(T dato){
        this.dato=dato;
        this.sig=null;
    }    
    
    public Nodo(T dato, Nodo enlace){
        this.dato=dato;
        this.sig=enlace;
    }
    
    //Métodos get y set
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }    
    
}
